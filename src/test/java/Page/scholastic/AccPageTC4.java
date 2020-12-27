package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class AccPageTC4 extends BasePage {

    By enterZip =By.id("dwfrm_myschool_schoolzip");
    By buttonSearch = By.id("button-search");
    By inputSearchClick =By.xpath("//input[@class='input-text ui-autocomplete-input valid']");
    By inputSearchA = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    By aListOfSuggestion =By.xpath("//ul[@id='ui-id-2']//li//span");
    By findState = By.xpath("//li[@class='custom-option select-option'and contains(@data-label,'Adak School')]");
    By schoolList =By.xpath("//span[@class='ui-menu-item-wrapper']//span");
    By confirmAddress = By.xpath("//div[@class='school-add']");
    By clickNext = By.xpath("//button[@name='dwfrm_searchschool_findnext']");

    By inputSearchAA = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");



    public void inserZip(String name){
        enterField(enterZip, name);
        clickThis(buttonSearch);
        System.out.println("Step 1");
    }
    public void listOfCity(String name){
        clickThis(inputSearchA);
        enterField(inputSearchClick,name);
        selectFromList(schoolList, name);
        System.out.println("Step 2");
    }
    public void suggList(String name){
    }
    public void verifyAddress(String name){
        System.out.println("Step 5");
        listContainMultiLines(confirmAddress, name);
        clickThis(clickNext);
    }
    public void test(String name){
        clickThis(inputSearchClick);
        System.out.println("Step 3");
        selectFromList(inputSearchAA,name);
    }


}
