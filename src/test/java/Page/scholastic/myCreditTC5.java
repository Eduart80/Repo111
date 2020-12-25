package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class myCreditTC5 extends BasePage {

    By MyAccountClick =By.xpath("//li[@class='user-info toggle-menu']");
    By MyAccountProfile =By.xpath("//li[@class='user-info toggle-menu active']//li//a");
    By addCreditCard = By.xpath("//div[@class='section-title']//div//a");
    By toolTipComent = By.xpath("//div[@class='tooltipster-body']");


    public void clickProfile(String name){
        mouseAction(MyAccountClick);
        selectFromList(MyAccountProfile, name);
    }
    public void clickAddCard(){
        clickThis(addCreditCard);
    }
    public void CheckError(String name){
        assertEqual(toolTipComent,name);
    }


}
