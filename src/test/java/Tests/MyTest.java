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
        globalNavigationScreen.goToProfileOption();
        profileScreen.clickWatchlist();
        watchlistScreen.clickLastWatchListMovie();

        Assert.assertEquals(movieDetailsScreen.getMovieTitle(), randomMovieSelected);

        //delete from watchlist
        movieDetailsScreen.clickAddToWatchlist();
    }
}


