package Tests;

import Adapter.Bases.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest(){
        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("hamilton");
        searchScreen.clickFirstResult();
        Assert.assertEquals(movieDetailsScreen.getMovieTitle(), "Hamilton");
        Assert.assertEquals(movieDetailsScreen.getMovieOverview(),"The real life of one of America's foremost founding fathers and first Secretary of the Treasury, Alexander Hamilton. Captured live on Broadway from the Richard Rodgers Theater with the original Broadway cast.");

        //back to search
        movieDetailsScreen.clickBack();
    }

    @Test(priority = 2)
    public void addToWatchListTest(){
        globalNavigationScreen.goToProfileOption();
        profileScreen.clickSignIn();
        loginScreen.loginWithImdb("email","password");
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("disney");
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
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("interstellar");
        searchScreen.clickFirstResult();
        movieDetailsScreen.scrollDownToUsersReviews();
        movieDetailsScreen.clickRate();
        rateScreen.addPerfectRate();
        String message= movieDetailsScreen.getRatingSavedMessage();
        movieDetailsScreen.clickRateMoreClose();

        Assert.assertEquals(message,"Rating saved");

        //remove rating
        globalNavigationScreen.goToProfileOption();
        profileScreen.clickRatings();
        ratingHistoryScreen.clickMostRecentRating();
        movieDetailsScreen.scrollDownToUsersReviews();
        movieDetailsScreen.clickRate();
        Assert.assertEquals(rateScreen.getYourRatingValue(),"10");
        rateScreen.clickRemoveRating();
        movieDetailsScreen.clickBack();
        ratingHistoryScreen.clickBack();
    }
}


