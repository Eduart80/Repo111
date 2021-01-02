package stepDefinition;

import Page.BasePage;
import Page.scholastic.noTaxTC9;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class SDnoTaxTC9 {
    noTaxTC9 pp =new noTaxTC9();

    @When("^i proceed to check out$")
    public void checkOut(){
        pp.gooOwt();
    }
    @When("^verify tax is zero \\$.$")
    public void seeUp(){
        pp.seeUp();
    }



}
