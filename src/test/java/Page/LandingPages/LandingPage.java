package Page.LandingPages;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    //Locators
    By createNewAccount = By.xpath("//div[@class='hide-desktop mobile_nav_menu']/following::ul//li[2]//a");
    By registrationForm = By.xpath("//div[@class='registration-steps step-1 choose-accounts']");
    By secondRegForm = By.xpath("//div[@class='registration-steps step-1']");
    By teacherSelectRadioB=By.xpath("//label[@for='acccountTeacther']");
    By nextButton = By.xpath("//a[@class='button-next']");

    By clickTitle = By.xpath("//div[@class='custom-select']//div[contains(text(),'Select Title')]");
    By dropTitle = By.xpath("//div[@class='selection-list visible']//ul");
    By enterName = By.id("dwfrm_profile_customer_firstname");
    By enterLast = By.id("dwfrm_profile_customer_lastname");
    By emterEmail = By.id("dwfrm_profile_customer_email");
    By enterPass = By.id("dwfrm_profile_login_password");
    By termsOfUse = By.id("dwfrm_registration_termsofuseteacher");
    By clickingNext = By.xpath("//button[@class='button-continue']");

    By enterZip =By.id("dwfrm_myschool_schoolzip");
    By buttonSearch = By.id("button-search");
    By inputSearshA = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    By listClub = By.id("ui-id-4390");
    By selectOnList=By.xpath("//ul[@id='ui-id-2']//li");
    By confirmAddress = By.xpath("//div[@class='school-add']");
    By clickNext = By.xpath("//button[@name='dwfrm_searchschool_findnext']");

    By selectRole =By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By selectRole2 =By.xpath("//div[@class='custom-scrollbar']//li[2]");
    By thirdForm =By.xpath("//div[@class='registration-steps step-3']");
    By selectGrade =By.xpath("//div[@class='selected-option input-select noscroll']");
    By selectGradeList=By.xpath("//div[@id='scrollbar-3']//li//span");
    By enterStudents = By.id("dwfrm_myrole_students");
    By clickNext3 = By.xpath("//button[@name='dwfrm_myrole_findgrade']");

    By readingLevel1 = By.xpath("//div[@class='selected-option input-select required']");
    By readingLevList = By.xpath("//div[@class='custom-scrollbar']//li//span");
    By clicNext4 = By.xpath("//button[@name='dwfrm_profileselection_confirmed']");

    By isOverForm = By.xpath("//div[@id='notificationBar']");
    By closeOverlayForm = By.xpath("//div[@class='notification-right-col']//span");
    By verificationCode = By.xpath("//div[@class='details']//*[contains(text(),'ZXWKV')]");
    By signInAcc = By.xpath("//a[@class='signin pureguest dialog-close disable-autoplay']");
    By goToMyAcc = By.xpath("//li[@class='user-info toggle-menu']");
    By selectDropDown =By.xpath("//div[@class='toggle-content']//li//a");
    /////
    By teachCodeInMain=By.xpath("By ClassCodeInMain=By.xpath(\"(//div[@class='sec-box']//div[@class='value'])[1]\");");
    By teacherCode = By.xpath("//div[@class='classcode']//span");
    By teachName =By.xpath("//div[@class='name-section']//div[2]//div//span");
    By teachSchool = By.xpath("//div[@class='school-section']//div[2]//div//span");




    //Methods
    public void creatNA(){
        clickThis(createNewAccount);
    }
    public void radioButton(){
        clickThis(teacherSelectRadioB);
    }
    public void lookIfEnable(){
        switchForm(registrationForm);
    }
    public void mouse(){
        mouseAction(nextButton);
    }
    public void dropDownTitle(){
        switchForm(secondRegForm);
        clickThis(clickTitle);
        clickThis(dropTitle);
    }
    public void nameField(String name){
        enterField(enterName, name);
    }
    public void lastNameField(String name){
        enterField(enterLast,name);
    }
    public void emailHere(String email){
        enterField(emterEmail,email);
    }
    public void passEnter(String numbers){
        enterField(enterPass, numbers);
    }
    public void clickTerms(){
        clickThis(termsOfUse);
    }
    public void clickNext2(){
        clickThis(clickingNext);
    }
    public void enterZip(String zipNbr){
        enterField(enterZip, zipNbr);
        clickThis(buttonSearch);
        findElementFluentWait(inputSearshA);
    }
    public void selectFromClubList(String name){
        enterField(inputSearshA,name);
        waitASec();
        selectFromList(listClub,name);
    }
    public void lista(String name){
        selectFromList(selectOnList,name);
    }
    public void checkAddress(String addressInMain){
        waitASec();
//        WebElement address = Web.getDriver().findElement(confirmAddress);
//        System.out.println("from address "+address.getText());
        Web.getDriver().findElement(clickNext).click();
    }
    public void selectRole(){
        switchForm(thirdForm);
        mouseAction(selectRole);
        Web.getDriver().findElement(selectRole2).click();
    }
    public void selectGrade(String grade){
        clickThis(selectGrade);
        waitASec();
        selectFromList(selectGradeList, grade);
        enterField(enterStudents, "10");
        clickThis(clickNext3);
    }
    public void selectReadingLevel(String lookFor){
        clickThis(readingLevel1);
        selectFromList(readingLevList, lookFor);
        clickThis(clicNext4);
    }
    public void verificationSteps() {
        waitAMin();
        WebElement seeFirst = Web.getDriver().findElement(isOverForm);
        boolean isAcct = seeFirst.isDisplayed();
        if (isAcct) {
            clickThis(closeOverlayForm);
        }
    }
    public void selectMyAccProfile(String name){
        clickThis(goToMyAcc);
        selectFromList(selectDropDown, name);
    }
    public void codeInMain(){
        isVisible(teachCodeInMain);
    }
    public void checkCode(){
        isDisplayed(teacherCode);
    }
    public void checkName(String name){
        assertEqual(teachName, name);
    }
    public void checkAddress2(String name){
        selectFromMultiLines(teachSchool, name);
    }

}
