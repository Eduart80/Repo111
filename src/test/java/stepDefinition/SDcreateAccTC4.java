package stepDefinition;

import Page.scholastic.AccPageTC4;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SDcreateAccTC4 {
    AccPageTC4 mp = new AccPageTC4();

    @When("^next form i enter '(.+)' zip code, and click search$")
    public void selectZip(String name){
        mp.inserZip(name);
    }
    @When("^entered '(.+)'$")
    public void enterSchool(String name){
        mp.listOfCity(name);
    }
    @And("^i select '(.+)' from list$")
    public void grabSugg(String name){
        mp.waitASec();
        mp.test(name);
    }
    @When("^i verify the address is the same as '(.+)'$")
    public void findAddress(String name){
        mp.verifyAddress(name);
    }

}
