package stepDefinition;

import Page.scholastic.checkBooksTC16;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SDcheckBooksTC16 {
    checkBooksTC16 pp =new checkBooksTC16();

    @When("^wait for add to load and remove$")
    public void clkEnter(){
        pp.waitAMin();
        pp.verificationStep();
    }
    @And("^i see for teacher code is present in main page$")
    public void teacherCode(){
        pp.teacherCodeDisplay();
    }
    @And("^i click search bar and enter '(.+)' in field$")
    public void searchBAr(String name){
        pp.teacherSearchDisplay(name);
    }


}
