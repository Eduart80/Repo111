package stepDefinition;

import Page.scholastic.flyerjumperTC11;
import cucumber.api.java.en.When;

public class FlyerjumperTC11 {
    flyerjumperTC11 lp = new flyerjumperTC11();

    @When("^at myAccount and click '(.+)'$")
    public void clickMenuOrder(String name){
        lp.EntOed(name);
    }
    @When("^i scroll down '1200' pixels$")
    public void scrollD(){
        lp.scrollDown();
    }
    @When("^i go to By Flyer tab and click on 'PriceQTY box'$")
    public void QTY(){
        lp.QTYbox();
    }
    @When("^a jumper box with message: '(.+)'$")
    public void verifyJumper(String name){
        lp.verifyJumper(name);
    }
    @When("^i enter number '(.+)' obx$")
    public void enterNumber(String name){
        lp.entNumb(name);
    }
    @When("^i entered next number '(.+)' box and verify message$")
    public void enterNextNumber(String name){
        lp.entNextNumb(name);
    }
    @When("^i verify Teacher does NOT see any jumper$")
    public void verifJump(){
        lp.verif();
    }

/**
 * Go to ENTER ORDERS Select YOUR TEACHER ORDER
 * Go to BY FLYER tabClick on Price-QTY box
 *
 * VERIFICATION
 * Teacher sees a jumper right above the box with message: Heading - IMPORTANTMessage -
 * All student paper flyer orders MUST be entered in the Student Flyer Orders tab.
 *
 * Enter data in the clicked Price-QTY box
 * Click on X on the jumper.Click on another Price-QTY box
 *
 * VERIFICATIONTeacher does NOT see any jumper.
 */
}
