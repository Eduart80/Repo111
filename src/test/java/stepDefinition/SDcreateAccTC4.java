package stepDefinition;

import Page.scholastic.AccPageTC4;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SDcreateAccTC4 {
    AccPageTC4 lp = new AccPageTC4();

    @When("^next form i enter '(.+)' zip code, and click search$")
    public void selectZip(String name){
        lp.inserZip(name);
    }
    @When("^entered '(.+)' in search$")
    public void enterSchool(String name){
        lp.listOfCity(name);
    }
    @And("^i select '(.+)' in list$")
    public void grabSugg(String name){
        lp.SuggList(name);
    }

}
