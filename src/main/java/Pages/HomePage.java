package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class=\"n-sidebar\"]/div[5]/a")
    public  WebElement Reservations;
    public  void ClickOnReservationsTab(){
        clickOn(Reservations);
    }


}
