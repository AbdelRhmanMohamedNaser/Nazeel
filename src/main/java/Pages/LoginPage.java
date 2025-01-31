package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"usern\"]")
    WebElement UserName;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"acc\"]")
    WebElement AccessCode;
    @FindBy(xpath = "//*[@id=\"multipleCheck\"]")
    WebElement RememberMe;
    @FindBy(xpath = "//*[@class=\"login__form login-col\"]/form/button")
    WebElement LoginBtn;
    @FindBy(xpath = "//*[@class=\"l-content\"]/main/app-home/app-verify-mobile-number-user/kendo-dialog/div[2]/kendo-dialog-actions/button[2]/span")
    public WebElement later;
    @FindBy(className = "page-header__title")
    public WebElement dashboard;
    public void login(String email , String pass , String acces) {
        setValueToTxtField(UserName, email);
        setValueToTxtField(password, pass);
        setValueToTxtField(AccessCode, acces);
        clickOn(RememberMe);
        clickOn(LoginBtn);
    }




}
