package Page.LandingPages;

import org.openqa.selenium.By;

public class checkOut {

    By procedCheckOut=By.xpath("//button[@name='dwfrm_cart_checkoutCart']");
    By proceChecOutAdd =By.xpath("(//button[@class='button-text'])[2]");
    By taxEstimate = By.xpath("//li[@class='std-total-msg']//span");

    By addTeacherOrder=By.xpath("(//div[@class='cart-section-header']//li//a)[2]");
    By enterItemYTO=By.xpath("//input[@name='item-number']");
    By addButton=By.xpath("//button[@class='btn-add']");

    //delete item button
    By deletItem=By.xpath("//td[@class='item-qty']//span//i");
    By clickYES=By.xpath("(//div[@class='tooltip-remove-action']//button[contains(text(),'Yes')])[2]");


}
