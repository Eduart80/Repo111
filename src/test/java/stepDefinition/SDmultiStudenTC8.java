package stepDefinition;

import Page.scholastic.multStudTC8;
import cucumber.api.java.en.When;

public class SDmultiStudenTC8 {

    multStudTC8 pp=new multStudTC8();

    @When("^student name '(.+)'$")
    public void Names(String name){
        pp.namesIN(name);
    }
    @When("^i verify entry name 'Harry, Michael, John' is same$")
    public void rName(){
        pp.verifffy3();
    }
    @When("^verify entry items '(.+)' are the same$")
    public void verifItem(String name){
        pp.verif2(name);
    }
    @When("^verify the total matches the number of books$")
    public void veriBooks(){
        pp.verifBooks();
    }
    @When("^calculate the books quantity$")
    public void calculate(){
        pp.ccccc();
    }
    @When("^i verify total amount pay is the same like SFO$")
    public void verifPay(){
        pp.toPay();
    }
    @When("^and verify total quantity of student entered is the same in SFO$")
    public void checkStu(){
        pp.checkStudents();
    }


}
