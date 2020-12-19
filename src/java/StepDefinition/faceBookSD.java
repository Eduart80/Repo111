package StepDefinition;

import PagePac.FBLanding.landingFB;
import cucumber.api.java.en.When;

public class faceBookSD {
    landingFB fb = new landingFB();

    @When("^i click newAccount$")
    public void click(){
        fb.createNewAccount();
    }

}
