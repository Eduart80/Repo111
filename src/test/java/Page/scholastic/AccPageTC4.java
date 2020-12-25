package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class AccPageTC4 extends BasePage {

    By listClub = By.id("ui-id-4390");
    By enterZip =By.id("dwfrm_myschool_schoolzip");
    By buttonSearch = By.id("button-search");
    By inputSearchClick =By.xpath("//input[@class='input-text ui-autocomplete-input valid']");
    By inputSearchA = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    By listOfSuggestion =By.xpath("//ul[@id='ui-id-2']//li//span//span");



    public void inserZip(String name){
        enterField(enterZip, name);
        clickThis(buttonSearch);
        findElementFluentWait(inputSearchA);
    }
    public void listOfCity(String name){
        waitASec();
        enterField(inputSearchA,name);
       mouseAction(inputSearchClick);
    }
    public void SuggList(String name){
       selectFromMultiLines(listOfSuggestion, name);
    }


}
