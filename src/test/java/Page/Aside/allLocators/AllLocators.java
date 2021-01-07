package Page.Aside.allLocators;

import org.openqa.selenium.By;

public class AllLocators {

    By createNewAccount = By.xpath("//div[@class='hide-desktop mobile_nav_menu']/following::ul//li[2]//a");
    By registrationForm = By.xpath("//div[@class='registration-steps step-1 choose-accounts']");
    By secondRegForm = By.xpath("//div[@class='registration-steps step-1']");
    By secTESTForm =By.xpath("//div[@class='selection-list visible']//ul//li//span");
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
    By selectRoleDropDown =By.xpath("//div[@class='custom-scrollbar']//li[2]");
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

    By teacherCode = By.xpath("//div[@class='classcode']//span");
    By teachName =By.xpath("//div[@class='name-section']//div[2]//div//span");
    By teachSchool = By.xpath("//div[@class='school-section']//div[2]//div//span");

    By inputSearchClick =By.xpath("//input[@class='input-text ui-autocomplete-input valid']");
    By inputSearchA = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    By aListOfSuggestion =By.xpath("//ul[@id='ui-id-2']//li");
    By findState = By.xpath("//li[@class='custom-option select-option'and contains(@data-label,'Adak School')]");

    By MyAccountClick =By.xpath("//li[@class='user-info toggle-menu']");
    By MyAccountProfile =By.xpath("//li[@class='user-info toggle-menu active']//li//a");
    By addCreditCard = By.xpath("//div[@class='section-title']//div//a");
    By toolTipComent = By.xpath("//div[@class='tooltipster-body']");

    By enterOrderList =By.xpath("//div[@class='subheader-cell first subheader_level_1']//ul//a");
    By enterOrderMouse =By.xpath("(//li[@class='topcategory active'])[2]");
    By qtyBox1 = By.xpath("(//td[@class=' item-qty'])[1]");
    By qtyBox3 = By.xpath("(//td[@class=' item-qty'])[3]");
    By inputTypeQTY1 =By.xpath("(//td[@class=' item-qty']//input)[1]");
    By inputTypeQTY3 =By.xpath("(//td[@class=' item-qty']//input)[3]");
    By alertBox =By.xpath("//div[@class='info-modal-content']");//is displayed first
    By alertBoxBody =By.xpath("//div[@id='info-student-flyer-order-fee' and @style='left: 546px; top: -74px; display: block;']");

    By menuEnterOrder =By.xpath("(//div[@class='subheader-menu']//li//a[@id='enter-orders'])[2]");
    By teacherOrders =By.xpath("(//li[@id='student-flyer-orders']//a)[2]");
    By stuName=By.xpath("//input[@name='student-name']");
    By itemNumber =By.xpath("//input[@name='item-number']");
    By buttonADD = By.xpath("//button[@id='btn-add']");
    By errorMsg = By.xpath("//span[@id='error-message-tooltip']");
    By toolTips = By.xpath("//div[@class='tooltipster-box']//div//span[2]");
    By ClassCodeInMain=By.xpath("//div[@class='sec-top-boxes']//div[1]//div[2]//div");

    By selectCity = By.xpath("//div[@class='selection-list visible']//div//ul//li");
    By scrolling =By.xpath("");
    By clickMeCity = By.xpath("//div[@class='selected-option input-select']");
    By clickSearch =By.xpath("//div[@class='findschool-bystate']//div[5]//button");
    By cityNameDisplay =By.xpath("//input[@name='dwfrm_myschool_schoolcity']");
    By enterNext = By.xpath("//input[@name='dwfrm_myschool_schoolcity']");

    By searchByStateBox = By.xpath("//div[@class='selected-option input-select']");
    By nyState = By.xpath("//li[@class='custom-option select-option'and contains(@data-label,'new york')]");
    By enterNextINput = By.xpath("//input[@id='dwfrm_myschool_schoolcity']");
    By fromListEDyte = By.xpath("//ul[@id='ui-id-2']//li//span//span");
    By schoolList =By.xpath("//span[@class='ui-menu-item-wrapper']//span");

}
