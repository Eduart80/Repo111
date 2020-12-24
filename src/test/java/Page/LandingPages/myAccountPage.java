package Page.LandingPages;

import Page.BasePage;
import org.openqa.selenium.By;

public class myAccountPage extends BasePage {

    //locator
    By menuEnterOrder =By.xpath("//li[@class='topcategory']//a[contains(text(),'Enter Orders')]");
    By teacherOrders =By.xpath("//li[@id='student-flyer-orders']//a");
    By ClassCodeInMain=By.xpath("(//div[@class='sec-box']//div[@class='value'])[1]");



    //Methods
    public void TechOrder(String name){
        mouseOver(teacherOrders);
        //mouseAction(menuEnterOrder);
        listContainMultiLines(menuEnterOrder, name);
    }

}
