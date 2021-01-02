package stepDefinition;

import Page.scholastic.makeOrderTC15;
import cucumber.api.java.en.When;

import java.util.stream.Stream;

public class SDmakeOrderTC15 {
    makeOrderTC15 pp = new makeOrderTC15();

    @When("^i scroll down '1000' pixels$")
    public void scPIX(){
        pp.scrollPix();
    }

    @When("^click continue to checkout$")
    public void hi(){
        pp.clickGo();
    }
    @When("^i select payment method credit card$")
    public void selCard(){
        pp.selectCard();
    }
    @When("^enter cardNumber '(.+)'$")
    public void enterNumb(String Numb){
        pp.number(Numb);
    }
    @When("^i enter date an security number '(.+)'$")
    public void selDate(String num){
        pp.selectDate(num);
    }
    @When("^i enter name '(.+)'$")
    public void enterName(String name){
        pp.nameIn(name);
    }
    @When("^i enter last '(.+)'$")
    public void enterLast(String name){
        pp.LastnameIn(name);
    }
    @When("^address '(.+)'$")
    public void addr(String n){
        pp.addrIn(n);
    }
    @When("^enter zipp '(.+)' than proceed with checkout$")
    public void zzzz(String n){
        pp.zippIn(n);
    }
    @When("^i verify Thank You Msg is present$")
    public void Thanx(){
        pp.ThankY();
    }
    @When("^reference number is shown$")
    public void refNumber(){
        pp.RefNumb();
    }

}
