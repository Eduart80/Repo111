package stepDefinition;

import Page.scholastic.LandingPageTC1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class stepDefinitionTC1 {
    LandingPageTC1 lp = new LandingPageTC1();

    @When("^i 'create new account' account$")
    public void createAccount(){
        lp.creatNA();
    }
    @And("^i select radio button as a teacher$")
    public void buttonRadio(){
        lp.lookIfEnable();
        lp.radioButton();
    }
    @And("^click Next$")
    public void clickNext(){
        lp.mouse();
        lp.waitASec();
    }
    @When("^on the next form i select Mr.$")
    public void selectTitle(){
       lp.dropDownTitle();
       lp.waitAMin();
    }
    @And("^enter name '(.+)' in field$")
    public void nameField(String name){
        lp.nameField(name);
    }
    @And("^entered last name '(.+)' in field$")
    public void lastname(String name){
        lp.lastNameField(name);
    }
    @When("^entered email '(.+)' in field$")
    public void emailHere(String email){
        lp.emailHere(email);
    }
    @When("^password '(.+)' next$")
    public void enterPass(String numbers){
        lp.passEnter(numbers);
    }
    @And("^clicked terms$")
    public void clickTerms(){
        lp.clickTerms();
    }
    @And("^next button$")
    public void nButton(){
        lp.clickNext2();
    }
    @When("^on next form i enter '(.+)' zip code, and click search$")
    public void zipEntry(String name){
        lp.enterZip(name);
    }
    @When("^entered '(.+)' on search$")
    public void selectClub(String name){
        lp.waitASec();
        lp.selectFromClubList(name);
    }
    @When("^select from '(.+)' list$")
    public void select(String name){
        lp.lista(name);
    }
    @When("^i verify the address is the same as '(.+)'$")
    public void checkAddress1(String address){
        lp.checkAddress(address);
    }
    @When("^i select role as Teacher \\(by Grade\\)$")
    public void selectRole(){
        lp.selectRole();
    }
    @And("^select '(.+)' from list and enter 10 students$")
    public void selectGrade(String grade){
        lp.waitASec();
        lp.selectGrade(grade);
    }
    @When("^Reading Level: '(.+)'$")
    public void readingLevel(String lookF){
        lp.selectReadingLevel(lookF);
    }
///////////////////////////////////////////////////////////////////////////////
    @When("^remove adds$")
    public void verification(){
        lp.waitASec();
        lp.verificationSteps();
    }
    @When("^i see if teacher code is here$")
    public void teachCodeMain(){
        lp.codeInMain();
    }
    @When("^click myAccount and select '(.+)'$")
    public void myAcc(String name){
        lp.selectMyAccProfile(name);
    }
    @When("^i check the teacher code$")
    public void teacherCode(){
        lp.checkCode();
    }
    @When("^i check the Name '(.+)' is correct$")
    public void teacherName(String name){
        lp.checkName(name);
    }
    @When("^i verify the address is '(.+)'$")
    public void teacherAddress(String address){
        lp.checkAddress2(address);
    }

}
