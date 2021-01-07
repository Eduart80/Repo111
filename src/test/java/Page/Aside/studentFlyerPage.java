package Page.Aside;

import Page.BasePage;
import org.openqa.selenium.By;

public class studentFlyerPage extends BasePage {

    By stuName=By.xpath("//input[@name='student-name']");

    By studentNameInOrder =By.xpath("//tr[@role='row']//td[@class=' studentName']");
    By studentItemInOrder =By.xpath("//tr[@role='row']//td[@class=' itemNum details-control']");
    By beckUpTotalQTY=By.xpath("//div[@class='total-review-order']//li[4]//span");
    By individualTotalAmount =By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By BigTotalToPay =By.xpath("//div[@class='total-review-order']//li[3]");
    By tableOfContent =By.xpath("//table[@class='cell-border dataTable item-table']//tr");
    By SFOTable=By.xpath("//div[@class='or-inner']//li[2]//span//span[2]");
    By SFOTableStudents=By.xpath("(//div[@class='or-inner']//li[2]//span//span[1])[1]");
    By tableOfStuOrder =By.xpath("//div[@class='cart-sfo-content']//div[@class='each-review-order']");

    By tableName = By.xpath("//div[@class='each-review-order']//h2//i");
    By booksInBasket =By.xpath("//div[@class='each-review-order']//tr//td[@class='item-qty']//input");


}
