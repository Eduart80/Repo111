package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class inAccountLandingPage extends BasePage {

    By signInAcc = By.xpath("//a[@class='signin pureguest dialog-close disable-autoplay']");
    By clickFrame = By.xpath("//div[@class='main modal-login--unauthparent']");
    By emailEntry = By.xpath("//input[@name='dwfrm_login_username']");
    By passEntry = By.xpath("//input[@name='dwfrm_login_password']");
    By enter = By.xpath("//button[@id='loginModalBtn']");
    By isOverForm = By.xpath("//div[@id='notificationBar']");
    By closeOverlayForm = By.xpath("//div[@class='notification-right-col']//span");
    By verificationCode = By.xpath("//div[@class='details']//*[contains(text(),'ZXWKV')]");
    By goToMyAcc = By.xpath("//li[@class='user-info toggle-menu']");
    By selectDropDown =By.xpath("//div[@class='toggle-content']//li//a");
/////
    By teacherCode = By.xpath("//div[@class='classcode']//span");
    By teachName =By.xpath("//div[@class='name-section']//div[2]//div//span");
    By teachSchool = By.xpath("//div[@class='school-section']//div[2]//div//span");




    public void logIn(){
        clickThis(signInAcc);
        waitASec();
        switchForm(clickFrame);
    }
    public void enterEmail(String name){
        enterField(emailEntry, name);
    }
    public void enterPass(String number){
        enterField(passEntry, number);
    }
    public void enter(){
        clickThis(enter);
    }
    public void verificationSteps() {
        waitAMin();
        WebElement seeFirst = Web.getDriver().findElement(isOverForm);
        boolean isAcct = seeFirst.isDisplayed();
        if (isAcct) {
            clickThis(closeOverlayForm);
        }
    }
    public void selectMyAccProfile(String name){
        clickThis(goToMyAcc);
        selectFromList(selectDropDown, name);
    }
    public void checkCode(){
        isDisplayed(teacherCode);
    }
    public void checkName(String name){
       assertEqual(teachName, name);
    }
    public void checkAddress(String name){
      selectFromMultiLines(teachSchool, name);
    }





}
