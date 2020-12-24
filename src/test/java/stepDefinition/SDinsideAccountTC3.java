package stepDefinition;

import Page.scholastic.AccLandingPageTC3;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SDinsideAccountTC3 {
    AccLandingPageTC3 lp = new AccLandingPageTC3();


    @And("^i signing to account$")
    public void signAcc(){
        lp.logIn();
    }
    @And("^i entered email '(.+)' in field$")
    public void emailInAccount(String email){
        lp.enterEmail(email);
    }
    @And("^i password '(.+)' next$")
    public void passInAccount(String number){
        lp.enterPass(number);
    }
    @When("^clicked enter$")
    public void clkEnter(){
        lp.enter();
        lp.waitAMin();
        lp.verificationSteps();
    }
    @When("^in search i enter for '(.+)'$")
    public void enterSearch(String name){
        lp.checkBooks(name);
    }
    @When("^click on Book '(.+)'$")
    public void myBook(String name){
        lp.selectBook();
    }
    @When("^make recommendation$")
    public void recommendation(){
        lp.recommendation();
    }
    @When("^select '(.+)'$")
    public void bookLike(String name){
        lp.checkList(name);
    }
    @When("^Verify the item is added to my Lists$")
    public void teacherList(){
        lp.verifyBooks();
    }



}
