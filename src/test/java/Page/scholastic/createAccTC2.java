package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class createAccTC2 extends BasePage {

    By selectCity = By.xpath("//div[@class='custom-select active']//ul//li//span");
    By scrolling =By.xpath("//div[@class='ps-scrollbar-y-rail']");
    By clickMeCity = By.xpath("//div[@class='form-row school-state']//div[@class='custom-select']");
    By clickSearch =By.xpath("//div[@class='findschool-bystate']//div[5]//button");
    By cityNameDisplay =By.xpath("//label[@for='dwfrm_myschool_schoolcity']//span");
    By enterNext = By.xpath("//input[@name='dwfrm_myschool_schoolcity']");


    public void selectCityList(String name){
        mouseAction(clickMeCity);
        scrollByWebElement(scrolling);
        selectFromMultiLines(selectCity, name);

    }
    public void enterNextCityName(String name){
        isVisible(cityNameDisplay);
        findElementFluentWait(cityNameDisplay);
        enterField(enterNext, name);
        clickThis(clickSearch);
    }

}
