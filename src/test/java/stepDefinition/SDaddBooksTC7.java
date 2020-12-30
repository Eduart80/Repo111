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
    @When("^i verify entry items '(.+)' are the same$")
    public void verifItem(String name){
        pp.verifffy2(name);
    }
    @When("^click Review card button$")
    public void ClickButt(){
        pp.inCard();
    }
    @When("^i verify under Harry quantity is '(.+)'$")
    public void verifQTY(int name){
        pp.AssertQuant(name);
    }
    @When("^i calculate the books sum$")
    public void calculate(){
        pp.ccccc();
    }
    @When("^verification the table student Name is same as entered$")
    public void verificationName(){
        pp.checkVerific();
    }

    @When("^I verify the total matches the number of books$")
    public void veriBooks(){
        pp.verifBooks();
    }
    @When("^i verify total amount pay is the same in SFO$")
    public void verifPay(){
        pp.inPay();
    }
    @When("^i verify total quantity of student entered is the same in SFO$")
    public void checkStu(){
        pp.checkStudents();
    }


}
