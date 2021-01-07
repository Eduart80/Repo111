package Page.Aside;

import Page.BasePage;
import org.openqa.selenium.By;

public class myListPage extends BasePage {

    By stuName=By.xpath("//input[@name='student-name']");
    By itemNumber =By.xpath("//input[@name='item-number']");
    By buttonADD = By.xpath("//button[@id='btn-add']");
    By errorMsg = By.xpath("//span[@id='error-message-tooltip']");

}
