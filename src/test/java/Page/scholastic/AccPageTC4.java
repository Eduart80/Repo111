package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccPageTC4 extends BasePage {

    By enterZip =By.id("dwfrm_myschool_schoolzip");
    By buttonSearch = By.id("button-search");
    By inputSearchClick =By.xpath("//input[@class='input-text ui-autocomplete-input valid']");
    By inputSearchField = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");

        By schoolList =By.xpath("//span[@class='ui-menu-item-wrapper']//span");
    By confirmAddress = By.xpath("//div[@class='school-add']");
    By clickNext = By.xpath("//button[@name='dwfrm_searchschool_findnext']");

        By inputSearchAA = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
        By prove=By.xpath("//li[@class='ui-menu-item']//span ");
        By prove2=By.xpath("//li[@class='ui-menu-item']//span/span ");


    public void inserZip(String name){
        enterField(enterZip, name);
        clickThis(buttonSearch);
    }
    public void listOfCity(String name){
        clickThis(inputSearchAA);
        enterField(inputSearchClick,name);
        clickThis(inputSearchAA);
        WebElement ss=Web.getDriver().findElement(prove);
        System.out.println("vvv"+ ss.getText());
        WebElement ssa=Web.getDriver().findElement(prove);
        System.out.println("vvv"+ ssa.getText());
        System.out.println(ss.getText()+ssa.getText());
        waitASec();
        selectFromList(prove, name);
    }
    public void verifyAddress(String name){
        selectFromList(confirmAddress, name);
        clickThis(clickNext);
    }


}
