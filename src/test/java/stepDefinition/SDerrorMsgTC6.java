package stepDefinition;

import Page.scholastic.ErrorsMsgTC6;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SDerrorMsgTC6 {
    ErrorsMsgTC6 lp = new ErrorsMsgTC6();

    @When("^Go to 'Enter Orders'$")
    public void seeOrders(){
        lp.waitASec();
        lp.TechOrder();
    }
    @And("^Select 'Student Flyer Orders'$")
    public void selectStuFlyer(){
        lp.TechStuFlyer();
    }
    @When("^i enter student name '(.+)'$")
    public void stuName(String name){
       lp.stuNameIN(name);
    }
    @When("^item number '(.+)'$")
    public void stuNumb(String name){
        lp.stustuItemN(name);
    }
    @When("^i click ADD button$")
    public void stuName(){
            lp.buttADD();
    }
    @When("^i got error msg: '(.+)'$")
    public void msgError(String name){
        lp.verifyMsg(name);
    }


/**
 *
 *
 * Student Name: Harry
 * Item number: 111
 * Click on ADD button
 * Expected error msg: Please enter a valid item number.
 *
 */
}
