package Page.scholastic;

import Page.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.stream.Stream;

public class addBookTC7 extends BasePage {

    By QTYinput = By.xpath("//td[@class=' item-qty']//input[1]");
    By buttonCard =By.xpath("//button[@class='secondary']");
    By studentNameInOrder =By.xpath("//tr[@role='row']//td[@class=' studentName']");
    By studentItemInOrder =By.xpath("//tr[@role='row']//td[@class=' itemNum details-control']");
    By studentQTYinOrder =By.xpath("//tr[@role='row']//td[@class=' item-qty']//input[1]");

    By totalQTY =By.xpath("(//li[@class='std-total-qty']//span)[1]");
    By totalAmount =By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By tableOfContent =By.xpath("//table[@class='cell-border dataTable item-table']//tr");
    By SFOTable=By.xpath("//div[@class='or-inner']//li[2]//span//span[2]");


    public void enterBooks(String number){
        clickThis(QTYinput);
        waitAMin();
        enterField(QTYinput, number);
    }
    public void verifffy(String name){
        checkAndAssert(studentNameInOrder, name);
    }
    public void verifffy2(String name){
        checkAndAssert(studentItemInOrder, name);
    }
    public void verifffy3(String name){
        checkAndAssert(studentQTYinOrder, name);
    }
    public void inCard(){
        clickThis(buttonCard);
    }
    public void AssertQuant(int number){
       AssertQuantity(tableOfContent, number);
    }
    public void verifBooks(String number){
      assertEqual(totalQTY, number);////
    }
    public void inPay(){
        String a1= AssertReturn(SFOTable);
        String a2= AssertReturn(totalAmount);
        Assert.assertEquals(a1,a2,"Sum Books price is not equal");
    }


}
