package Tests;

import dto.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static constants.MoviesConstants.*;


public class MoviesTest extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest(){
        Search search= testData.getData(SEARCH_MOVIE_1, Search.class);
        Movie movie= testResult.getData(SUCCESS_MOVIE_1, Movie.class);

        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie(search.getInput());
        searchScreen.clickFirstResult();
        Assert.assertEquals(movieDetailsScreen.getMovieTitle(), movie.getTitle());
        Assert.assertEquals(movieDetailsScreen.getMovieOverview(),movie.getOverview());

        //back to search
        movieDetailsScreen.clickBack();
    }

    @Test(priority = 2)
    public void addToWatchListTest(){
        Search search= testData.getData(SEARCH_MOVIE_2, Search.class);
        User user= testData.getData(VALID_USER,User.class);

        globalNavigationScreen.goToProfileOption();
        profileScreen.clickSignIn();
        loginScreen.loginWithImdb(user.getEmail(), user.getPassword());
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie(search.getInput());
        searchScreen.clickRandomResult();
        String randomMovieSelected = movieDetailsScreen.getMovieTitle();
        movieDetailsScreen.clickAddToWatchlist();
        movieDetailsScreen.clickBack();
        globalNavigationScreen.goToProfileOption();
        profileScreen.clickWatchlist();
        watchlistScreen.clickLastWatchListMovie();

        Assert.assertEquals(movieDetailsScreen.getMovieTitle(), randomMovieSelected);

        //delete from watchlist
        movieDetailsScreen.clickAddToWatchlist();
        movieDetailsScreen.clickBack();
        watchlistScreen.clickBack();
    }

    @Test(priority=3)
    public void rateMovieTest(){
        Search search= testData.getData(SEARCH_MOVIE_3, Search.class);
        UIMessage ratingMessage= testResult.getData(SUCCESS_RATING_MESSAGE, UIMessage.class);
        Rating rating= testResult.getData(YOUR_RATING_10, Rating.class);

        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie(search.getInput());
        searchScreen.clickFirstResult();
        movieDetailsScreen.scrollDownToUsersReviews();
        movieDetailsScreen.clickRate();
        rateScreen.addPerfectRate();
        String message= movieDetailsScreen.getRatingSavedMessage();
        movieDetailsScreen.clickRateMoreClose();

        Assert.assertEquals(message,ratingMessage.getMessage());

        //remove rating
        globalNavigationScreen.goToProfileOption();
        profileScreen.clickRatings();
        ratingHistoryScreen.clickMostRecentRating();
        movieDetailsScreen.scrollDownToUsersReviews();
        movieDetailsScreen.clickRate();
        Assert.assertEquals(rateScreen.getYourRatingValue(),rating.getValue());
        rateScreen.clickRemoveRating();
        movieDetailsScreen.clickBack();
        ratingHistoryScreen.clickBack();
    }
}


