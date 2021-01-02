package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Set;

public class noTaxTC9 extends BasePage {

    By procedCheckOut=By.xpath("//button[@name='dwfrm_cart_checkoutCart']");
    By proceChecOutAdd =By.xpath("(//button[@class='button-text'])[2]");
    By taxEstimate = By.xpath("//li[@class='std-total-msg']//span");

    public void gooOwt(){
        clickThis(procedCheckOut);
        waitASec();
        clickThis(proceChecOutAdd);
    }
    public void seeUp(){
        WebElement many = Web.getDriver().findElement(taxEstimate);
        String ff= many.getText();
        Assert.assertEquals("$0.00", ff, "Tax value is not zero.");
    }

}
