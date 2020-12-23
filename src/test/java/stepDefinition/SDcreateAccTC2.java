package stepDefinition;

import Page.scholastic.createAccTC2;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDcreateAccTC2 {
    createAccTC2 lp = new createAccTC2();

    @When("^next form i search for '(.+)' and next$")
    public void enterCity(String name){
        lp.selectCityList(name);
    }
    @Then("^i enter for '(.+)' in city$")
    public void enterCityInField(String name){
        lp.enterNextCityName(name);
    }







}
