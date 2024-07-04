package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Register;
import Util.ScreenShot;
import Util.Scroll;
import Util.browserNotificationClose;

import java.io.IOException;
import java.time.Duration;

public class RegisterTest {

    public WebDriver driver;
    Register rg;

    Scroll scrl;
    ScreenShot ss;
    @BeforeClass
    public void setup()
    {
        // Initialize browser with notifications disabled
        browserNotificationClose notifyClose = new browserNotificationClose();
        driver = notifyClose.notificationClose();

        // Maximize the window and navigate to the registration page
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/profile/user-registration");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Create an instance of the Register page and fill the registration form
        rg = new Register(driver);

    }

    @Test(priority = 1,groups = "sign up")
    public void registerBasic() throws IOException, InterruptedException {


        rg.enterUsername("jayatel160");
        rg.enterPassword("Michi@786");
        rg.confirmPassword("Michi@786");
        rg.clickPrimaryLanguageDropdown();
        Thread.sleep(1000);
        rg.selectPrimaryLanguageOption();
        rg.clickSecurityQuestionDropdown();
        Thread.sleep(1000);
        rg.selectSecurityQuestionOption();
        rg.enterSecurityAnswer("Fluffy");

        //scroll
        scrl=new Scroll(); //object variable define as default at top -> (Scroll scrl)
        scrl.scrollWebPage3(driver,92);
        Thread.sleep(1000);

        //Take screenshot
        ss=new ScreenShot();  //object variable define as default at top -> (ScreenShot ss)
        ss.takeScreenShot(driver);

        rg.clickContinue();
        Thread.sleep(1000);

        scrl.scrollWebPage3(driver,92);
        Thread.sleep(1000);
        //Take screenshot
        ss.takeScreenShot(driver);
        // Close the browser
       // driver.quit();
    }

    @Test(priority = 2,groups = "sign up")
    public void registerPersonal() throws InterruptedException, IOException {
        rg.enterFirstName("John");
        //rg.enterLastName("Doe");
        Thread.sleep(1000);
        rg.clickProfessionDropdown();
        Thread.sleep(1000);
        rg.selectProfessionOption();
        rg.enterDateOfBirth();
        Thread.sleep(1000);
        rg.selectDate();
        rg.selectMarriedStatus();
        rg.selectMaleGender();
        rg.enterEmail("john.doe@example.com");
        rg.enterMobile("1234567890");
        rg.clickNationalityDropdown();
        Thread.sleep(1000);
        rg.selectNationalityIndia();
        Thread.sleep(1000);
        ss.takeScreenShot(driver);
        rg.clickContinue();

        Thread.sleep(1000);
        ss.takeScreenShot(driver);

        scrl.scrollWebPage3(driver,92);
        Thread.sleep(1000);
    }
}
