package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class createAccTC2 extends BasePage {

    By selectCity = By.xpath("//div[@class='selection-list visible']//div//ul//li");
    By scrolling =By.xpath("");
    By clickMeCity = By.xpath("//div[@class='selected-option input-select']");
    By clickSearch =By.xpath("//div[@class='findschool-bystate']//div[5]//button");
    By cityNameDisplay =By.xpath("//input[@name='dwfrm_myschool_schoolcity']");
    By enterNext = By.xpath("//input[@name='dwfrm_myschool_schoolcity']");


    public void sel(){
        mouseAction(clickMeCity);
        waitASec();

    }
    public void selectCityList(String name){
        enterField(clickMeCity,"N");
        waitASec();
        //selectFromList(selectCity, name);
    }
    public void enterNextCityName(String name){
        isDisplayed(cityNameDisplay);
        enterField(enterNext, name);
        clickThis(clickSearch);
    }

}
