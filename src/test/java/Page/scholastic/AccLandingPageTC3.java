package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccLandingPageTC3 extends BasePage {

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
    By searchBar = By.id("q");
    By book = By.xpath("//img[@title='Harry Potter and the Goblet of Fire']");
    By productContainer =By.xpath("//div[@class='product-container product-top-content']");
    By recommendationStar =By.xpath("//div[@class='recommended-button icon-button tooltipstered']");
    By closeRecommendation =By.xpath("//div[@class='tooltipster-title']//span[2]");
    By menuList = By.xpath("//li[@class='mylists toggle-menu']//ul//li//a");
    By RecomText = By.xpath("//div[@class='tooltipster-body']//div[@class='col']");
    By myList = By.xpath("//li[@class='mylists toggle-menu']");
    By BooksInList = By.xpath("//li[@class='recommend']");
    By verifyBookInList =By.xpath("//div[@class='product-list-item']//a");






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
    public void checkBooks(String name){
        waitASec();
        submitIt(searchBar, name);
    }
    public void selectBook(){
        clickThis(book);
    }
    public void recommendation(){
        switchForm(productContainer);
        mouseAction(recommendationStar);
    }
    public void checkList(String name){
      selectFromList(menuList, name);
        clickThis(closeRecommendation);
    }
    public void verifyBooks(){
        mouseAction(myList);
        waitASec();
        mouseAction(BooksInList);
        waitASec();
        isDisplayed(verifyBookInList);
    }

}
