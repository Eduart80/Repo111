package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class createAccTC2 extends BasePage {

    By selectCity = By.xpath("//div[@class='selection-list visible']//div//ul//li");
    By scrolling =By.xpath("");
    By clickMeCity = By.xpath("//div[@class='selected-option input-select']");
    By clickSearch =By.xpath("//button[@name='dwfrm_myschool_searchone']");
    By cityNameDisplay =By.xpath("//input[@name='dwfrm_myschool_schoolcity']");
    By enterNext = By.xpath("//input[@name='dwfrm_myschool_schoolcity']");
    By searchByStateBox = By.xpath("//div[@class='selected-option input-select']");
    By nyState = By.xpath("//li[@class='custom-option select-option'and contains(@data-label,'new york')]");

    By selectOnList=By.xpath("//li[@class='ui-menu-item']//span");

    By enterNextInput = By.xpath("//input[@id='dwfrm_myschool_schoolcity']");
    By from2List = By.xpath("//ul[@id='ui-id-2']//li");
    By proveList =By.xpath("//li[@class='ui-menu-item' and contains(text(),'New York')]");



    public void sel(){
        mouseOver(clickMeCity);
        mouseAction(clickMeCity);
    }
    public void selectCityList(String name){
        mouseAction(nyState);
        selectFromList(nyState, name);
        waitASec();
    }
    public void enterNextCityName(String name){
        enterField(enterNext, name);
        waitAMin();
        mouseAction(from2List);
        selectFromList(proveList,name);
    }
    public void eNextCity(){
        clickThis(clickSearch);
    }
    public void lista2(String name){
        selectFromList(selectOnList,name);
    }


}
