package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;

public class makeOrderTC15 extends BasePage {

    By totalAll=By.xpath("//li[@class='std-total-price']//span[@id='cartTotalQty']");
    By checkOutButton=By.xpath("//button[@id='btn-continue-checkout']");

    By clickPayMethod=By.xpath("//div[@class='selected-option']");
    By selectCreditCard=By.xpath("//div[@class='selection-list visible']//li[2]");
    By cardType=By.xpath("(//div[@class='selected-option input-select selected-active'])[2]");

    By selectAddRadioButt=By.xpath("(//div[@class='sec-info-module-inner'] //label//span)[1]");
    By selectNewCard=By.xpath("(//div[@class='custom-scrollbar']//li//span)[9]");
    By inputCardNumber=By.xpath("//input[@name='dwfrm_billing_paymentMethods_creditCard_number']");
    By clickDate=By.xpath("(//div[@class='selected-option input-select no-mouseflow required selected-active'])[1]");
    By selectDate=By.xpath("(//div[@class='selection-list visible']//li)[5]");
    By clickYear=By.xpath("(//div[@class='selected-option input-select no-mouseflow required selected-active'])[2]");
    By selectYear=By.xpath("(//div[@class='custom-select active']//div[@class='selection-list visible']//li//span)[3]");
    By codeNumber =By.xpath("//input[@id='dwfrm_billing_paymentMethods_creditCard_cvn']");

    By enterName= By.xpath("(//input[@class='input-text namefield no-mouseflow required'])[1]");
    By enterLast =By.xpath("//input[@id='dwfrm_billing_billingAddress_addressFields_lastName']");
    By address=By.xpath("//input[@class='input-text no-mouseflow required']");
    By zipp=By.xpath("//input[@class='input-text numericonly autozipcode no-mouseflow required']");

    By clickCity=By.xpath("(//div[@class='selected-option input-select no-mouseflow required selected-active'])[3]");
    By clickState=By.xpath("(//div[@class='selected-option input-select no-mouseflow required selected-active'])[4]");
    By telephone=By.xpath("//input[@class='input-text formatphone numericonly custom-placeholder no-mouseflow phone required']");

    By contToCheckOut=By.xpath("//button[@id='billingContinueButton']//span");

    By tablePresent =By.xpath("//div[@class='sec-order-table']//table");
    By clickX=By.xpath("//div[@class='sec-order-table']//table//tbody//td//span");
    By clickYes=By.xpath("(//div[@class='sec-order-table']//table//tbody//td//div//button)[1]");

    By submitOrder =By.xpath("(//button[@name='dwfrm_summary_submitOrder'])[1]");
    By thankYouMsg=By.xpath("//div[@class='col order-instruction']");
    By orderRefNumber=By.xpath("//div[@class='sec-info-module sec-rco-content cart-section-header']");


    public void clickGo(){
        clickThis(checkOutButton);
    }
    public void scrollPix(){
        clickThis(selectAddRadioButt);
        scrollPage();
        waitAMin();
    }
    public void selectCard(){
        clickThis(clickPayMethod);
        waitASec();
        clickThis(selectCreditCard);
        waitASec();
        clickThis(cardType);
    }
    public void number(String numb){
        clickThis(selectNewCard);
        waitAMin();
        enterField(inputCardNumber, numb);
    }
    public void selectDate(String numb){
        clickThis(clickDate);
        waitASec();
        clickThis(selectDate);
        waitASec();
        clickThis(clickYear);
        waitASec();
        clickThis(selectYear);
        waitASec();
        enterField(codeNumber, numb);
    }
    public void nameIn(String name){
        enterField(enterName,name);
    }
    public void LastnameIn(String name){
        enterField(enterLast,name);
    }
    public void addrIn(String name){
        enterField(address, name);
    }
    public void zippIn(String name){
        enterField(zipp, name);
        enterField(telephone,"9294448888");
        waitAMin();
        clickThis(contToCheckOut);
    }
    public void ThankY(){
        clickThis(submitOrder);
        waitAMin();
        isEnable(thankYouMsg);
        isEnable(orderRefNumber);
    }
    public void RefNumb(){
        isEnable(orderRefNumber);
    }



}
