package Page.scholastic;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Collection;
import java.util.List;

public class useCardTC14 extends BasePage {


    By clickPayMethod=By.xpath("//div[@class='selected-option']");
    By selectCreditCard=By.xpath("//div[@class='selection-list visible']//li[2]");
    By selectAddRadioButt=By.xpath("(//div[@class='sec-info-module-inner'] //label//span)[1]");
    By contToCheckOut=By.xpath("//button[@id='billingContinueButton']//span");
    By TeachTable =By.xpath("//div[@class='sec-order-table']//div//tr");
    By TeachBooksIn =By.xpath("//div[@class='sec-order-table']//div//tr//td[@class='item-qty']//input");
    By TeachPriceUp=By.xpath("//div[@class='total-review-order']//ul//li[@class='std-total-yto-price ytoGrossTotal']");
    By TeachPrice =By.xpath("//div[@class='sec-order-table']//div//td[@class='price']//span");
    By totalOrder=By.xpath("//div[@class='total-review-order cart-total']//*[@id='cartTotalQty']");
    By StuTotalToPay =By.xpath("//div[@class='total-review-order']//li[3]");
    By TotalSFOBooks=By.xpath("//div[@class='total-review-order']//li[4]//span");
    By tableOfStuOrder =By.xpath("//div[@class='cart-sfo-content']//div[@class='each-review-order']");
    By SFOTableStudents=By.xpath("(//div[@class='or-inner']//li[2]//span//span[1])[1]");
    By totalOrderToPay =By.xpath("//div[@class='total-review-order cart-total']//*[@id='teacher-cart-total']");


    ///////
    public static int booksInventory = 0;
    public static double priceOfBooks = 0;
//////
    public void scrollPix(){
        clickThis(selectAddRadioButt);
        scrollPage();
        waitAMin();
    }
    public void selectCard() {
        clickThis(clickPayMethod);
        waitASec();
        clickThis(selectCreditCard);
        waitAMin();
    }
    public void zippIn(){
        clickThis(contToCheckOut);
    }
    public void totalBooks(){
        WebElement numb = Web.getDriver().findElement(TotalSFOBooks);
        booksInventory = Integer.parseInt(numb.getText());
        boolean f = Web.getDriver().findElements(TeachTable).size()>0;
            if(f){
               booksInventory= countHowMany(TeachBooksIn) + booksInventory;
            }
        WebElement numb4 = Web.getDriver().findElement(totalOrder);
        String name3 = numb4.getText();
        String numbB = Integer.toString(booksInventory);
        Assert.assertEquals(numbB,name3, "Table of books numbers not matching");
        System.out.println("Total books in basket: "+booksInventory);
    }
    public void totalPrice(){
        WebElement numb = Web.getDriver().findElement(StuTotalToPay);
        String textIs = numb.getText();
        double ofText = splitStrings(textIs);
        priceOfBooks = ofText;
        boolean f = Web.getDriver().findElements(TeachTable).size()>0;
            if(f){
                priceOfBooks= countHowMuch(TeachPriceUp) + priceOfBooks;
            }
        WebElement numb4 = Web.getDriver().findElement(totalOrderToPay);
        double name2 = splitStrings(numb4.getText());
        String name3 = Double.toString(name2);
        String numbA = Double.toString(priceOfBooks);
        Assert.assertEquals(numbA,name3, "Table price not matching");
        System.out.println("Total to pay is: "+priceOfBooks);
    }


}
