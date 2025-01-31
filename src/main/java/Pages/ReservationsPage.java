package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReservationsPage extends PageBase{
    public ReservationsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class=\"n-table__top-btns\"]/div[2]/button")
    WebElement NweReservations;
    public void ClickOnNweReservations() throws InterruptedException {
        Thread.sleep(2000);
        clickOn(NweReservations);
    }
    @FindBy(xpath = "//*[@class=\"col-md-12\"]/kendo-dropdownlist/span/span[1]")
    WebElement VisitPurpose;
    @FindBy(xpath = "//li[text()='Sports']")
    WebElement selectValueFromDDLVisitPurpose;
    public void selectValueFromVisitPurpose() throws InterruptedException {
        Thread.sleep(3000);
        clickOn(VisitPurpose);
        clickOn(selectValueFromDDLVisitPurpose);
    }
    @FindBy(xpath = "/html/body/div/app-root/nazeel-dashboard/div/div/main/app-reservation-wizard/div/div[3]/div[1]/app-main-data-step/div[1]/reservation-period-wizard/div[1]/div/div[2]/div[2]/kendo-dropdownlist/span/span[2]/span")
    WebElement ReservationSource;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[2]/ul[1]/li[1]/div[1]")
WebElement selectValueFromDDLReservationSource;
    public void selectValueFromReservationSource(){
        clickOn(ReservationSource);
        clickOn(selectValueFromDDLReservationSource);
    }
    @FindBy(xpath = "//*[@class=\"k-grid-table\"]/tbody/tr/td/div/span")
    WebElement SelectUnitNow;
    @FindBy(xpath = "//*[@id=\"K-border\"]/span/span[2]/span")
    WebElement HousekeepingStatus;
    @FindBy(xpath = "//li[text()='Dirty']")
    WebElement selectDirty;
    @FindBy(xpath = "//*[@class=\"row\"]/div[6]/button")
    WebElement SerachBtn;
    @FindBy(xpath = "/html/body/div/app-root/nazeel-dashboard/div/div/main/app-reservation-wizard/div/div[3]/div[1]/app-main-data-step/div[2]/select-units-wizard/kendo-dialog/div[2]/div/div[2]/div/kendo-panelbar/kendo-panelbar-item/div/div/div/div/div[1]/div[2]")
    WebElement unitCard;
    @FindBy(xpath = "//*[@class=\"u-mb-12\"]/select-units-wizard/kendo-dialog/div[2]/kendo-dialog-actions/div[2]/button[2]")
    WebElement Confirm;
    public void SelectUnit() throws InterruptedException {
        clickOn(SelectUnitNow);
        clickOn(HousekeepingStatus);
        clickOn(selectDirty);
        clickOn(SerachBtn);
        Thread.sleep(2000);
        clickOn(unitCard);
        clickOn(Confirm);
    }
    @FindBy(xpath = "//*[@class=\"div-btn\"]/button/span")
    WebElement SelectGuestNow;

    @FindBy(xpath = "//*[@id=\"guestFormDialogContainer\"]/div[2]/div[1]/input")
    WebElement IDNumber;

    @FindBy(xpath = "//*[@id=\"guestFormDialogContainer\"]/div[2]/div[4]//button")
    WebElement SearchButton;
    @FindBy(xpath = "//*[@class=\"container-fluid\"]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/div")
    WebElement selectGuest;
    @FindBy(xpath = "//*[@class=\"container-fluid\"]/div[3]/kendo-dialog-actions/button[2]")
    WebElement ConfirmInSelectGuest;
    public void ClickOnSelectGuestAndEnterIDNumber(String id) throws InterruptedException {
        clickOn(SelectGuestNow);
        Thread.sleep(3000);
        setValueToTxtField(IDNumber , id);
        clickOn(SearchButton);
        Thread.sleep(3000);
        clickOn(selectGuest);
        Thread.sleep(3000);
        clickOn(ConfirmInSelectGuest);
    }
    @FindBy(xpath = "//*[@class=\"res-scrollable-container\"]/div[4]/div[3]/button/span")
    WebElement CkeckIn;
    @FindBy(xpath = "//*[@class=\"ng-star-inserted\"]/app-reservation-summary/kendo-dialog/div[2]/kendo-dialog-actions/div/button")
    WebElement  CkeckInOnPopUp;
    public void ClickOnCheckIn(){
        clickOn(CkeckIn);
        clickOn(CkeckInOnPopUp);
    }
    @FindBy(xpath = "//*[@class=\"page-header\"]/div[1]/h2/span")
    WebElement SucssesfulMsg;
    public String sucssuesmsg(){
        return getText(SucssesfulMsg) ;
    }

}
