package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class flyerjumperTC11 extends BasePage {

    By menuEnterOrder =By.xpath("(//div[@class='subheader-menu']//li//a[@id='enter-orders'])[2]");
    By enterOrderList =By.xpath("//div[@class='subheader-cell first subheader_level_1']//ul//a");
    By enterOrderMouse =By.xpath("(//li[@class='topcategory active'])[2]");
    By qtyBox1 = By.xpath("(//td[@class=' item-qty'])[1]");
    By qtyBox3 = By.xpath("(//td[@class=' item-qty'])[3]");
    By inputTypeQTY1 =By.xpath("(//td[@class=' item-qty']//input)[1]");
    By inputTypeQTY3 =By.xpath("(//td[@class=' item-qty']//input)[3]");
    By alertBox =By.xpath("//div[@class='info-modal-content']");//is displayed first
    By alertBoxBody =By.xpath("//div[@id='info-student-flyer-order-fee' and @style='left: 546px; top: -74px; display: block;']");

    public void EntOed(String name){
        mouseOver(menuEnterOrder);
        selectFromList(enterOrderList, name);
    }
    public void scrollDown(){
        waitASec();
        scrollByWebElement(inputTypeQTY1);
    }
    public void QTYbox(){
        clickThis(qtyBox1);
    }
    public void verifyJumper(String name){
        isDisplayed(alertBox);
        assertEqual(alertBox, name);
    }
    public void entNumb(String name){
        enterField(inputTypeQTY1, name);
    }
    public void entNextNumb(String name){
        enterField(inputTypeQTY3, name);
    }
    public void verif(){
        assertLinkNotPresent(alertBoxBody);

    }

}
