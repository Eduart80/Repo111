package stepDefinition;

import Page.scholastic.taxPresentTC13;
import cucumber.api.java.en.When;

public class SDtaxPresentTC13 {
    taxPresentTC13 pp=new taxPresentTC13();

    @When("^i enter TeachOrder '(.+)'$")
    public void adTeac(String book){
        pp.teacOrder(book);
    }
    @When("^verify tax is not zero \\$.$")
    public void taxVal(){
        pp.seeMeUp();
    }
    @When("^add quantity books '(.+)' and click proceed to checkOut$")
    public void adBook(String book){
        pp.adBook(book);
    }


}
