package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import gherkin.lexer.Sr_cyrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class deleteItemTC10 extends BasePage {

    //delete item button
    By deletItem=By.xpath("//td[@class='item-qty']//span//i");
    By clickYES=By.xpath("//div[@class='tooltip-remove-action']//button[contains(text(),'Yes')]");

    By tableOfContent =By.xpath("//table[@class='cell-border dataTable item-table']//tr");

    public void deletThis(String name){
        List<WebElement> doli = Web.getDriver().findElements(tableOfContent);
        String a = null;
        for (WebElement sdi : doli){
            if(sdi.getAttribute("id").contains(name)){
                a = sdi.getAttribute("id");
                Web.getDriver().findElement(deletItem).click();
                waitASec();
                Web.getDriver().findElement(clickYES).click();

            }
        }
        System.out.println("books deleted from list: "+a);
    }


}
