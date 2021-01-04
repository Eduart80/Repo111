package stepDefinition;

import Page.scholastic.useCardTC14;
import cucumber.api.java.en.When;

public class SDuseCardTC14 {
    useCardTC14 pp= new useCardTC14();

    @When("^i scroll down$")
    public void scPIX(){
        pp.scrollPix();
    }
    @When("^i select payment method with existing credit card$")
    public void selCard(){
        pp.selectCard();
    }
    @When("^proceed with checkout$")
    public void zzzz(){
        pp.zippIn();
    }
    @When("^verify the total matches SFO and YTO number of books$")
    public void calc(){
        pp.totalBooks();
    }
    @When("^i verify total amount pay is the same$")
    public void toPayl(){
        pp.totalPrice();
    }

}
