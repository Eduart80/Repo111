package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class ErrorsMsgTC6 extends BasePage {
    //locator
    By menuEnterOrder =By.xpath("//a[@id='enter-orders']/preceding::div[@class='subheader-menu']");
    By teacherOrders =By.xpath("//li[@id='student-flyer-orders']//a");
    By ClassCodeInMain=By.xpath("(//div[@class='sec-box']//div[@class='value'])[1]");



    //Methods
    public void TechOrder(String name){
        isVisible(ClassCodeInMain);
       // mouseAction(menuEnterOrder);
      //  listContainMultiLines(teacherOrders, name);
    }

}
