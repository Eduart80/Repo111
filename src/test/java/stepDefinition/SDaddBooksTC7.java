package stepDefinition;

import Page.scholastic.addBookTC7;
import cucumber.api.java.en.When;

public class SDaddBooksTC7 {
    addBookTC7 pp = new addBookTC7();

    @When("^add quantity of '(.+)'$")
    public void books(String number){
        pp.enterBooks(number);
    }
    @When("^add second quantity of '(.+)'$")
    public void books2(String number){
        pp.enterBooks(number);
    }
    @When("^add third quantity of '(.+)'$")
    public void books3(String number){
        pp.enterBooks(number);
    }
    @When("^i verify entry name '(.+)' is the same$")
    public void verifName(String name){
        pp.verifffy(name);
    }
    @When("^i verify entry item '(.+)' is the same$")
    public void verifItem(String name){
        pp.verifffy2(name);
    }
    @When("^i verify entry QTY '(.+)' is the same$")
    public void verifQTY(String name){
        pp.verifffy3(name);
    }
    @When("^click Review card button$")
    public void ClickButt(){
        pp.inCard();
    }
    @When("^i verify quantity '(.+)'$")
    public void verifQTY(int name){
        pp.AssertQuant(name);
    }
    @When("^i verify total amount pay is the same in SFO$")
    public void verifPay(){
        pp.inPay();
    }
    @When("^i verify totalbooks is '(.+)'$")
    public void verifPay(String name){
        pp.verifBooks(name);
    }


}
