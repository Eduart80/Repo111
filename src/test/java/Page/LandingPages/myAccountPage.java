package Page.LandingPages;

import Page.BasePage;
import org.openqa.selenium.By;

public class myAccountPage extends BasePage {

    //locator
    By menuEnterOrder =By.xpath("(//div[@class='subheader-menu']//li//a[@id='enter-orders'])[2]");
    By teacherOrders =By.xpath("(//li[@id='student-flyer-orders']//a)[2]");

    By toolTips = By.xpath("//div[@class='tooltipster-box']//div//span[2]");
    By ClassCodeInMain=By.xpath("//div[@class='sec-top-boxes']//div[1]//div[2]//div");

    By MyAccountProfile =By.xpath("//li[@class='user-info toggle-menu']//li//a or //li[@class='user-info toggle-menu active']//li//a");
    By addCreditCard = By.xpath("//div[@class='section-title']//div//a");
    By toolTipComment = By.xpath("//div[@class='tooltipster-body']");
    By cardNumber =By.xpath("//input[@name='dwfrm_paymentinstruments_creditcards_newcreditcard_number_d0ehvomnqtsb']");




    //Methods
    public void TechOrder(String name){

    }

}
