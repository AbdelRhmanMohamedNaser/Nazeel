package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PageBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class loginTest extends Testpage{
    HomePage home;
    PageBase page;
    LoginPage login;
    SoftAssert softAssert;
    String Username="Abdelrhman Mohamed";
    String Password="Am@123456";
    String AccessCode="01373";

    @Test
    public void LoginUserWithCorrectEmailAndPassword() throws InterruptedException {
        home = new HomePage(driver);
        page =new PageBase(driver);
        login =new LoginPage(driver);
        softAssert = new SoftAssert();
        login.login(Username , Password , AccessCode );

    }

    }

