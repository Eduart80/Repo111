package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class ErrorsMsgTC6 extends BasePage {
    //locator

    By menuEnterOrder =By.xpath("(//div[@class='subheader-menu']//li//a[@id='enter-orders'])[2]");
    By teacherOrders =By.xpath("(//li[@id='student-flyer-orders']//a)[2]");
    By stuName=By.xpath("//input[@name='student-name']");
    By itemNumber =By.xpath("//input[@name='item-number']");
    By buttonADD = By.xpath("//button[@id='btn-add']");
    By errorMsg = By.xpath("//span[@id='error-message-tooltip']");

    By toolTips = By.xpath("//div[@class='tooltipster-box']//div//span[2]");
    By ClassCodeInMain=By.xpath("//div[@class='sec-top-boxes']//div[1]//div[2]//div");


    //Methods
    public void ifTipsDisplay(){
        removeToolTips(toolTips);
        waitASec();
    }
    public void teacherCodeDisplay(){
        isDisplayed(ClassCodeInMain);
    }
    public void TechOrder(){
        mouseOver(menuEnterOrder);
        waitASec();
    }
    public void TechStuFlyer(){
        mouseAction(teacherOrders);
    }
    public void stuNameIN(String name){
        enterField(stuName, name);
    }
    public void stustuItemN(String name){
        enterField(itemNumber, name);
    }
    public void buttADD(){
        clickThis(buttonADD);
    }
    public void verifyMsg(String name){
        assertEqual(errorMsg, name);
    }

}
