package stepDefinition;

import Page.scholastic.deleteItemTC10;
import cucumber.api.java.en.When;

public class SDdeleteItemsTC10 {
    deleteItemTC10 pp = new deleteItemTC10();

    @When("^delete item '(.+)' from list$")
    public void del(String number){
        pp.deletThis(number);
    }

}
