package stepDefinition;

import Page.scholastic.ErrorsMsgTC6;
import cucumber.api.java.en.When;

public class SDerrorInvaledMsg {
    ErrorsMsgTC6 lp = new ErrorsMsgTC6();

    @When("^Go to '(.+)'$")
    public void seeOrders(String name){
        lp.TechOrder(name);
    }

/**
 * Login
 * Go to 'Enter Orders'
 * Select 'Student Flyer Orders'
 * Student Name: Harry
 * Item number: 111
 * Click on ADD button
 * Expected error msg: Please enter a valid item number.
 * Verification:
 *
 * There is a CLASS CODE allocated to the teacher,
 * present on Home-Page and MyAccount-Page.
 *
 * Same Teacher name is present on My Accounts.
 *
 * Same school address is present as selected while creating the account.
 */
}
