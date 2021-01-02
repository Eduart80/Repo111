package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class taxPresentTC13 extends BasePage {

    By addTeacherOrder=By.xpath("(//div[@class='cart-section-header']//li//a)[2]");
    By enterItemYTO=By.xpath("//input[@name='item-number']");
    By QTYAdd =By.xpath("//input[@class='itm-qty-usd input-qty numericenteronly']");
    By addButton=By.xpath("//button[@class='btn-add']");
    By reviewCardButt =By.xpath("//div[@class='sec-button-inner']//button[contains(text(),'Review Cart')]");

    By taxToSee = By.xpath("//li[@class='std-total-msg']//span");


    public void teacOrder(String book){
        clickThis(addTeacherOrder);
        waitAMin();
        enterField(enterItemYTO, book);
        waitASec();
        clickThis(addButton);
    }
    public void adBook(String number){
        enterField(QTYAdd, number);
        clickThis(reviewCardButt);
        waitASec();
    }
    public void seeMeUp(){
        WebElement many = Web.getDriver().findElement(taxToSee);
        String ff= many.getText();
        Assert.assertNotEquals("$0.00", ff, "Tax value is zero.");
    }


}
