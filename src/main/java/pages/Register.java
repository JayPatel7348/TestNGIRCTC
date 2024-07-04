package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

    public WebDriver driver;
    @FindBy(id ="userName")
    public WebElement txtUsername;

    @FindBy(id ="usrPwd")
    public WebElement txtUsernamePswd;

    @FindBy(id ="cnfUsrPwd")
    public WebElement txtCnfUsernamePswd;

    @FindBy(xpath ="//*[@class ='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-7 pi pi-chevron-down']")
    public WebElement clkDrpdwnPreLang;

    @FindBy(xpath ="//li[@aria-label='English']")
    public WebElement slctPreLangOpt;

    @FindBy(xpath ="//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-8 pi pi-chevron-down']")
    public WebElement clkDrpdwnSecQue;

    @FindBy(xpath ="//li[@aria-label='What is your pet name?']")
    public WebElement slctSecQueOpt;

    @FindBy(xpath ="//input[@placeholder='Security Answer']")
    public WebElement txtAnsSecQueOpt;

    @FindBy(xpath ="//button[normalize-space()='Continue']")
    public WebElement prsContinue;


    public Register(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    // Method to enter username
    public void enterUsername(String username) {
        txtUsername.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String UsernamePswd) {
        txtUsernamePswd.sendKeys(UsernamePswd);
    }

    // Method to confirm password
    public void confirmPassword(String CnfUsernamePswd) {
        txtCnfUsernamePswd.sendKeys(CnfUsernamePswd);
    }

    // Method to click on primary language dropdown
    public void clickPrimaryLanguageDropdown() {
        clkDrpdwnPreLang.click();
    }

    // Method to select primary language option
    public void selectPrimaryLanguageOption() {
        slctPreLangOpt.click();
    }

    // Method to click on security question dropdown
    public void clickSecurityQuestionDropdown() {
        clkDrpdwnSecQue.click();
    }

    // Method to select security question option
    public void selectSecurityQuestionOption() {
        slctSecQueOpt.click();
    }

    // Method to enter security answer
    public void enterSecurityAnswer(String ansSecQueOpt) {
        txtAnsSecQueOpt.sendKeys(ansSecQueOpt);
    }

    // Method to click on continue button
    public void clickContinue() {
        prsContinue.click();
    }


    //RegisterPersonal tab

    @FindBy(id = "firstName")
    public WebElement txtFirstName;

    @FindBy(id = "lastName")
    public WebElement txtLastName;

    @FindBy(xpath = "//*[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-9 pi pi-chevron-down']")
    public WebElement clkDrpdwnProfession;

    @FindBy(xpath = "//span[normalize-space()='PROFESSIONAL']")
    public WebElement slctProfessionOpt;

    @FindBy(xpath = "//input[@placeholder='Date Of Birth']")
    public WebElement txtDateOfBirth;

    @FindBy(xpath = "//p-radiobutton[@id='married']")
    public WebElement rdoMarried;

    @FindBy(xpath = "//span[normalize-space()='Male']")
    public WebElement rdoMale;

    @FindBy(id = "email")
    public WebElement txtEmail;

    @FindBy(id = "mobile")
    public WebElement txtMobile;

    @FindBy(xpath = "//select[@formcontrolname='nationality']")
    public WebElement slctNationality;

    @FindBy(xpath = "//option[@value='94'][normalize-space()='India'][1]")
    public WebElement slctNationalityIndiaOpt;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement prsContinuetab2;


    // Date of Birth field
    @FindBy(xpath = "//*[@placeholder='Date Of Birth']")
    public WebElement clkDateOfBirth;

    // Year dropdown
    @FindBy(xpath = "//*[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")
    public WebElement drpdwnYear;

    // Year option 1994
    @FindBy(xpath = "//option[normalize-space()='1994']")
    public WebElement optionYear1994;

    // Month dropdown
    @FindBy(xpath = "//*[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")
    public WebElement drpdwnMonth;

    // Month option January
    @FindBy(xpath = "//option[normalize-space()='January']")
    public WebElement optionMonthJanuary;

    // Day option 1
    @FindBy(xpath = "//a[normalize-space()='1']")
    public WebElement optionDay1;


    // Method to enter first name
    public void enterFirstName(String firstName) {
        txtFirstName.sendKeys(firstName);
    }

    // Method to enter last name
    public void enterLastName(String lastName) {
        txtLastName.sendKeys(lastName);
    }

    // Method to click on profession dropdown
    public void clickProfessionDropdown() {
        clkDrpdwnProfession.click();
    }

    // Method to select profession option
    public void selectProfessionOption() {
        slctProfessionOpt.click();
    }

    // Method to enter date of birth
    public void enterDateOfBirth(String dateOfBirth) {
        txtDateOfBirth.sendKeys(dateOfBirth);
    }

    // Method to select married status
    public void selectMarriedStatus() {
        rdoMarried.click();
    }

    // Method to select gender as male
    public void selectMaleGender() {
        rdoMale.click();
    }

    // Method to enter email
    public void enterEmail(String email) {
        txtEmail.sendKeys(email);
    }

    // Method to enter mobile number
    public void enterMobile(String mobile) {
        txtMobile.sendKeys(mobile);
    }

    // Method to click on nationality dropdown
    public void clickNationalityDropdown() {
        slctNationality.click();
    }

    // Method to select nationality as India
    public void selectNationalityIndia() {
        slctNationalityIndiaOpt.click();
    }

    // Method to click on continue button
    public void clickContinuetab2() {
        prsContinuetab2.click();
    }

    // Method to select the year 1994
    public void selectYear1994() throws InterruptedException {
        drpdwnYear.click();
        Thread.sleep(1000);
        optionYear1994.click();
    }

    // Method to select the month January
    public void selectMonthJanuary() throws InterruptedException {
        drpdwnMonth.click();
        Thread.sleep(1000);
        optionMonthJanuary.click();
    }

    // Method to select the day 1
    public void selectDay1() {
        optionDay1.click();
    }

    // Method to select a specific date (1st January 1994)
    public void selectDate() throws InterruptedException {
        selectYear1994();
        Thread.sleep(1000);
        selectMonthJanuary();
        Thread.sleep(1000);
        selectDay1();
    }

    public void enterDateOfBirth() {
        clkDateOfBirth.click(); // Click to open the date picker
       //selectDate(); // Select the date (assumes the date picker opens and selects 1st January 1994)
    }
}


