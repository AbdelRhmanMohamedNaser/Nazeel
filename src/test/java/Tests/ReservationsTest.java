package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PageBase;
import Pages.ReservationsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReservationsTest extends Testpage{
    HomePage home;
    PageBase page;
    LoginPage login;
    ReservationsPage reservations;
    SoftAssert softAssert;
    String GuestID="123456789";
    @Test
    public void Reservation() throws InterruptedException {
        home = new HomePage(driver);
        page =new PageBase(driver);
        login = new LoginPage(driver);
        reservations = new ReservationsPage(driver);
        softAssert = new SoftAssert();
        Thread.sleep(6000);
        page.clickOn(login.later);
        String actResult=page.getText(login.dashboard);
        softAssert.assertEquals(actResult,"Dashboard");
        home.ClickOnReservationsTab();
        reservations.ClickOnNweReservations();
        reservations.selectValueFromVisitPurpose();
        reservations.selectValueFromReservationSource();
        reservations.SelectUnit();
        reservations.ClickOnSelectGuestAndEnterIDNumber(GuestID);
        reservations.ClickOnCheckIn();
        String sucsesMsg=reservations.sucssuesmsg();
        softAssert.assertEquals(sucsesMsg , "Checked In");
        softAssert.assertAll();
    }

}
