package stepDefinition;

import Page.scholastic.createAccTC2;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDcreateAccTC2 {
    createAccTC2 kp = new createAccTC2();

    @When("^select$")
    public void enterCity(){
        kp.sel();
    }
    @When("^next form i search for '(.+)' and next$")
    public void enterCity(String name){
        kp.selectCityList(name);
    }
    @Then("^i enter for '(.+)' in city$")
    public void enterCityInField(String name){
        kp.enterNextCityName(name);
        kp.waitASec();
        kp.eNextCity();
    }
    @When("^select '(.+)' from list$")
    public void SchoolList(String name){
        kp.lista2(name);
    }


}
