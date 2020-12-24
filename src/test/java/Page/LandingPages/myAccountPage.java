package Page.LandingPages;

import Page.BasePage;
import org.openqa.selenium.By;

public class myAccountPage extends BasePage {

    //locator
    By menuEnterOrder =By.xpath("(//div[@class='subheader-menu']//li//a[@id='enter-orders'])[2]");
    By teacherOrders =By.xpath("(//li[@id='student-flyer-orders']//a)[2]");

    By toolTips = By.xpath("//div[@class='tooltipster-box']//div//span[2]");
    By ClassCodeInMain=By.xpath("//div[@class='sec-top-boxes']//div[1]//div[2]//div");



    //Methods
    public void TechOrder(String name){

    }

}
