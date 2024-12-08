package Tests;

import Adapter.Bases.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseMobileTest {

    @Test
    public void searchMovieTest(){
        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("hamilton");
        searchScreen.clickFirstResult();
        Assert.assertEquals(searchScreen.getSelectedMovieTitle(), "Hamilton");
    }
}


