package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class addBookTC7 extends BasePage {

    By QTYinput = By.xpath("//td[@class=' item-qty']//input[1]");
    By buttonCard =By.xpath("//button[@class='secondary']");
    By studentNameInOrder =By.xpath("//tr[@role='row']//td[@class=' studentName']");
    By studentItemInOrder =By.xpath("//tr[@role='row']//td[@class=' itemNum details-control']");
    By studentQTYinOrder =By.xpath("//tr[@role='row']//td[@class=' item-qty']//input[1]");

    By totalQTY =By.xpath("(//li[@class='std-total-qty']//span)[1]");
    By beckUpTotalQTY=By.xpath("//div[@class='total-review-order']//li[4]//span");
    By individualTotalAmount =By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By BigTotalToPay =By.xpath("//div[@class='total-review-order']//li[3]");
    By tableOfContent =By.xpath("//table[@class='cell-border dataTable item-table']//tr");
    By SFOTable=By.xpath("//div[@class='or-inner']//li[2]//span//span[2]");
    By SFOTableStudents=By.xpath("(//div[@class='or-inner']//li[2]//span//span[1])[1]");
    By tableOfStuOrder =By.xpath("//div[@class='cart-sfo-content']//div[@class='each-review-order']");
    By TeachTableQTY =By.xpath("(//div[@class='sec-order-table']//div//td)[5]");

    By tableName = By.xpath("//div[@class='each-review-order']//i");
    By booksInBasket =By.xpath("//div[@class='each-review-order']//tr//td[@class='item-qty']//input");

    //////
    public static String stuNameR = null;
    public static String stuBooks = null;
    public static int numberOfBooks = 0;
    //////
    public void enterBooks(String number){
        clickThis(QTYinput);
        waitAMin();
        enterField(QTYinput, number);
    }
    public void verifffy(String name){
        checkAndAssert(studentNameInOrder, name);
        stuNameR = name;
    }
    public void verifffy2(String name){
        checkAndAssert(studentItemInOrder, name);
    }
    public void inCard(){
        clickThis(buttonCard);
    }
    public void AssertQuant(int number){
       AssertQuantity(tableOfContent, number);
    }
    public void inPay(){
        String a1= AssertReturn(SFOTable);
        String a2= AssertReturn(individualTotalAmount);
        Assert.assertEquals(a1,a2,"Some Books price is not equal");
        System.out.println("You pay: "+a1);
    }
    public void checkVerific(){
        assertEqListOfString(tableName, stuNameR);
        System.out.println("Student name verification "+stuNameR);
    }
    public void ccccc() {
      numberOfBooks = countHowMany(booksInBasket);
    }
    public void verifBooks(){
        String numbOfBooksString = Integer.toString(numberOfBooks);
        WebElement numb = Web.getDriver().findElement(beckUpTotalQTY);
        String inConv = numb.getText();//.toString();
        Assert.assertEquals(numbOfBooksString, inConv, "Books not matching" );
    }
    public void checkStudents(){
        WebElement numb2 = Web.getDriver().findElement(tableOfStuOrder);
        String atConv = numb2.getText();
        WebElement name1 = Web.getDriver().findElement(SFOTableStudents);
        String name3 = name1.getText();
        Assert.assertEquals(atConv,name3, "Student table not matching");
    }


}
