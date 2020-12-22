package Page;

import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage {

    public void clickThis(By locator) {
        Web.getDriver().findElement(locator).click();
    }
    public void enterField(By locator, String name){
        Web.getDriver().findElement(locator).sendKeys(name);
    }
    public void waitASec(){
        Web.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    public void waitAMin(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectDropDown(By locator, String name){
        WebElement dropDown = Web.getDriver().findElement(locator);
        Select dropD = new Select(dropDown);
        dropD.selectByVisibleText(name);
    }
    public void switchRadioButton(String name){
        switch (name){
            case "Female":
                Web.getDriver().findElement(By.xpath("//input[@id='u_2_4']")).click();
                break;
            case "Male":
                Web.getDriver().findElement(By.xpath("//input[@id='u_2_5']")).click();
                break;
            case "Custom":
                Web.getDriver().findElement(By.xpath("//input[@id='u_2_6']")).click();
                break;
            default:
                break;
        }
    } //on FaceBook radio Buttons
    public void switchForm(By locator){
        boolean checkIf = Web.getDriver().findElement(locator).isEnabled();
        if(checkIf){
            Web.getDriver().findElement(locator).click();
        }
    }
    public void mouseAction(By locator){
        WebElement moveClick = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(moveClick).click().perform();
    }
    public void selectFromList(By locator, String nameToSearch){
        List<WebElement> myList = Web.getDriver().findElements(locator);
        for(WebElement divIn : myList){
            if (divIn.getText().equalsIgnoreCase(nameToSearch)){
                System.out.println("from list form "+divIn.getText());
                divIn.click();
                break;
            }
        }
    }
    public WebElement findElementFluentWait(final By locator) {
        Wait fwait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element not found i 30 sec");
        WebElement element = (WebElement) fwait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return Web.getDriver().findElement(locator);
            }
        });
    return element;
    }



}
