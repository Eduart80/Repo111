package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkBooksTC16 extends BasePage {

    By ClassCodeInMain=By.xpath("//div[@class='sec-top-boxes']//div[1]//div[2]//div");
    By searchField=By.id("q");
    By isOverForm = By.xpath("//div[@id='notificationBar']");
    By closeOverlayForm = By.xpath("//div[@class='notification-right-col']//span");

    public void teacherCodeDisplay(){
        isDisplayed(ClassCodeInMain);
    }
    public void teacherSearchDisplay(String name){
        enterField(searchField, name);
    }
    public void verificationStep() {
        waitAMin();
        WebElement seeFirst = Web.getDriver().findElement(isOverForm);
        boolean isAcct = seeFirst.isDisplayed();
        if (isAcct) {
            clickThis(closeOverlayForm);
        }
    }
///////////////////////////////////////

}
