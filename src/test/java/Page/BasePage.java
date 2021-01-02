package Page;

import WebDriver.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage {

    public void clickThis(By locator) {
        Web.getDriver().findElement(locator).click();
    }
    public void enterField(By locator, String name){
        WebElement inIt = Web.getDriver().findElement(locator);
        inIt.clear();
        inIt.sendKeys(name);
    }
    public void submitIt(By locator, String name){
       WebElement toSend = Web.getDriver().findElement(locator);
       toSend.sendKeys(name);
       toSend.submit();
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
    public void mouseOver(By locator){
        WebElement moveClick = Web.getDriver().findElement(locator);
        Actions act1 = new Actions(Web.getDriver());
        act1.moveToElement(moveClick).build().perform();
    }
    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0.1200);");
    }
    public void scrollByWebElement(By locator){
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        WebElement elem = Web.getDriver().findElement(locator);
        js.executeScript("arguments[0].scrollIntoView(true);", elem);
    }
    public void selectFromList(By locator, String nameToSearch){
        List<WebElement> myList = Web.getDriver().findElements(locator);
       // System.out.println("B1 :"+myList.size());
        for(WebElement divIn : myList){
            if (divIn.getText().equalsIgnoreCase(nameToSearch)){
              //  System.out.println("Select form list: "+divIn.getText());
                divIn.click();
                break;
            }
        }
    }//Equals
    public void isDisplayed(By locator) {
        WebElement codeIsHere = Web.getDriver().findElement(locator);
        boolean code = codeIsHere.isDisplayed();
        if(code){
            System.out.println("Teacher verification code: " + codeIsHere.getText());
        }else {
            System.out.println("Teacher verification code: " + false);
        }
    }
    public void isEnable(By locator){
        WebElement codeIsHere = Web.getDriver().findElement(locator);
        boolean code = codeIsHere.isEnabled();
        if(code){
            System.out.println("Object verification is: " + codeIsHere.getText());
        }else {
            System.out.println("Object verification is: " + false);
        }
    }
    public void assertEqual(By locator, String toMatch){
        WebElement codeIsHere = Web.getDriver().findElement(locator);
        Assert.assertEquals(codeIsHere.getText(), toMatch, "The element name is not matching.");
    }
    public void assertEqListOfString(By locator, String toMatch){
        WebElement codeIsHere = Web.getDriver().findElement(locator);
        Assert.assertEquals(codeIsHere.getText(), toMatch, "The element name is not matching.");
    }
    public void assertEqual2Locators(By locator, By locatorToMatch){
        WebElement codeOne = Web.getDriver().findElement(locator);
        WebElement codeTwo = Web.getDriver().findElement(locatorToMatch);
        Assert.assertEquals(codeOne.getText(), codeTwo.getText(), "Books quantity does not match.");
    }
    public void selectFromMultiLines(By locator, String nameSearch){
        List<WebElement> myList = Web.getDriver().findElements(locator);
        //System.out.println("A1: "+myList.size());
        for(WebElement divIn : myList){
            if (divIn.getText().equalsIgnoreCase(nameSearch)){
                //System.out.println("A2: -> "+divIn.getText());
                divIn.click();
            }/////  it does not have break, need to read the entire list
        }
    }//print all
    public void listContainMultiLines(By locator, String nameSearch){
        List<WebElement> myList = Web.getDriver().findElements(locator);
        System.out.println("C1: "+myList.size());
        for(WebElement divIn : myList){
            if (divIn.getText().contains(nameSearch)){
                System.out.println("C2: -> "+divIn.getText());
                divIn.click();
                break;
            }
        }
    }//Contains
    public void removeToolTips(By locator){
        List<WebElement>aList=Web.getDriver().findElements(locator);
        for(WebElement span : aList){
            if(span.isDisplayed()){
                span.click();
            }
        }
    }
    public void assertLinkNotPresent (By locator){
        List<WebElement> verify = Web.getDriver().findElements(locator);
        if (verify.isEmpty()) {
            System.out.println("Object verification is: " + false);
        }
    }
    public void checkAndAssert(By locator, String nameSearch){
        List<WebElement> myList = Web.getDriver().findElements(locator);
        //System.out.println("E1: "+myList.size());
        for(WebElement divIn : myList){
            if (divIn.getText().equalsIgnoreCase(nameSearch)){
                System.out.println("E2: -> "+divIn.getText());
                Assert.assertEquals(divIn.getText(), nameSearch, "The element name is not equal");
            }/////  it does not have break, need to read the entire list
        }
    }//print all
    public void AssertQuantity(By locator, int number){
        List<WebElement> myList = Web.getDriver().findElements(locator);
        Assert.assertEquals(myList.size(), number, "The element name is not equal");
    }
    public String AssertReturn(By locator){
        return Web.getDriver().findElement(locator).getText();
    }
    public int countHowMany(By locator){
        ////  getAttribute by "value"
        List<WebElement> doli = Web.getDriver().findElements(locator);
        int a = 0;
        int counting = 0;
        for (WebElement sdi : doli){
            if(counting <= doli.size()){
                String  textIn = sdi.getAttribute("value") + a;
                int num = Integer.parseInt(textIn);
                int devideIt = num / 10; // check this step too
                a = devideIt + a;
                counting++;
            }
        }
        System.out.println("Total books in basket: "+a);
        return a;
    }
    public Set<String> assertLists(By anotherName){
        Set<String>ar=new HashSet<>();
        List<WebElement> doli = Web.getDriver().findElements(anotherName);
        int counting = 0;
        for (WebElement sdi : doli){
            if(counting <= doli.size()){
                ar.add(sdi.getText());
                counting++;
            }
        }
        System.out.println("Total students: "+ar);
        return ar;

    }
//    public String deleteItemList(By locator, String bookNumb){}





}
