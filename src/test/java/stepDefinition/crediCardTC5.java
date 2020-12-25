package stepDefinition;

import Page.scholastic.myCreditTC5;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class crediCardTC5 {
    myCreditTC5 lp = new myCreditTC5();

    @When("^go to myAccount and click '(.+)'$")
    public void myAcc(String name){
        lp.clickProfile(name);
    }
    @And("^i click to add a new creditCard$")
    public void cADD(){
        lp.clickAddCard();
    }
    @When("^i receive popUp error '(.+)'$")
    public void checkIf(String name){
        lp.CheckError(name);
    }


}
