package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class ErrorsMsgTC6 extends BasePage {
    //locator

    By menuEnterOrder =By.xpath("(//div[@class='subheader-menu']//li//a[@id='enter-orders'])[2]");
    By teacherOrders =By.xpath("(//li[@id='student-flyer-orders']//a)[2]");
    By stuName=By.xpath("//input[@name='student-name']");
    By itemNumber =By.xpath("//input[@name='item-number']");
    By buttonADD = By.xpath("//button[@id='btn-add']");
    By errorMsg = By.xpath("//span[@id='error-message-tooltip']");

    By ClassCodeInMain=By.xpath("(//div[@class='sec-box']//div[@class='value'])[1]");


    //Methods
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
