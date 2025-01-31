package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PageBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends Testpage{
    HomePage home;
    PageBase page;
    LoginPage login;
    SoftAssert softAssert;


    @Test
    public void LoginUserWithCorrectEmailAndPassword() throws InterruptedException {
        home = new HomePage(driver);
        page =new PageBase(driver);
        login =new LoginPage(driver);
        softAssert = new SoftAssert();
        Thread.sleep(3000);
        page.clickOn(login.later);
        String actResult=page.getText(login.dashboard);
        softAssert.assertEquals(actResult,"Dashboard");
    }
}
