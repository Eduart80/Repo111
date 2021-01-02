package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

public class multStudTC8 extends BasePage {

    By stuName=By.xpath("//input[@name='student-name']");

    By studentNameInTable =By.xpath("//tr[@role='row']//td[@class=' studentName']");
    By studentItemInOrder =By.xpath("//tr[@role='row']//td[@class=' itemNum details-control']");
    By beckUpTotalQTY=By.xpath("//div[@class='total-review-order']//li[4]//span");
    By individualTotalAmount =By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By BigTotalToPay =By.xpath("//div[@class='total-review-order']//li[3]");
    By tableOfContent =By.xpath("//table[@class='cell-border dataTable item-table']//tr");
    By SFOTableTotal=By.xpath("//div[@class='or-inner']//li[2]//span//span[2]");
    By SFOTableStudents=By.xpath("(//div[@class='or-inner']//li[2]//span//span[1])[1]");
    By tableOfStuOrder =By.xpath("//div[@class='cart-sfo-content']//div[@class='each-review-order']");

    By tableName = By.xpath("//div[@class='each-review-order']//h2//i");
    By booksInBasket =By.xpath("//div[@class='each-review-order']//tr//td[@class='item-qty']//input");

    //////
    public static Set<String> ListNames = new HashSet<>();
    public static Set<String> StudentsNames = new HashSet<>();
    private static int itemsNumber = 0;
    //////

    public void namesIN(String name){
        enterField(stuName, name);
        StudentsNames.add(name);//add names in a list from page 1
    }
    public void verifffy3(){
        Set<String> Lis= assertLists(studentNameInTable);
        boolean an = StudentsNames.containsAll(Lis);
        System.out.println("Student mach the list "+an);
        // verify list of names in table
    }
    public void verif2(String name){
        checkAndAssert(studentItemInOrder, name);
    }
    public void ccccc() {
        itemsNumber = countHowMany(booksInBasket);
    }
    public void toPay(){
        String a1= AssertReturn(SFOTableTotal);
        String a2= AssertReturn(BigTotalToPay);
        Assert.assertEquals(a1,a2,"Some Books price is not equal");
        System.out.println("You pay: "+a1);
    }
    public void verifBooks(){
        String numbOfBooksString = Integer.toString(itemsNumber);
        WebElement numb = Web.getDriver().findElement(beckUpTotalQTY);
        String inConv = numb.getText();//.toString();
        Assert.assertEquals(numbOfBooksString, inConv, "Books not matching" );
    }
    public void checkStudents(){

        List<WebElement> doli = Web.getDriver().findElements(tableOfStuOrder);
        int atConv = doli.size();
        String intToString = Integer.toString(atConv);
        WebElement name1 = Web.getDriver().findElement(SFOTableStudents);
        String name3 = name1.getText();
        Assert.assertEquals(intToString,name3, "Student table not matching");
    }
}
