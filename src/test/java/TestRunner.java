import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.OptionPage;
import pages.RegisterationPage;

import java.time.Duration;

import java.util.Random;

import static pages.BasePage.getRandomString;


public class TestRunner {

    WebDriver driver;
    Random rand = new Random();

    // page objects
    LandingPage landingPage;
    OptionPage optionPage;
    RegisterationPage registerationPage;
    TestData testData = new TestData();


    @BeforeClass
    public void setup() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.setAcceptInsecureCerts(true);
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        landingPage = new LandingPage(driver);
        optionPage = new OptionPage(driver);
        registerationPage = new RegisterationPage(driver);
    }


    @Test

    public void navigateLanding() throws InterruptedException {
        landingPage.navigateToLandingPage();
        landingPage.changeLanguageToEnglish();
        landingPage.clickOnLoginButton();

        optionPage.addNewOrganization();

        registerationPage.fillOrganizationRegistrationForm(testData.OrganizationNameArabic,
                testData.OrganizationNameEnglish,
                testData.UnifiedNationalID,
                testData.OrganizationSector,
                testData.OrganizationLogo,
                testData.organizationPhone,
                testData.ApplicantName,
                testData.ApplicantNationalID,
                testData.ApplicantJobTitle,
                testData.ApplicantPhoneNumber,
                testData.FoundationDate,
                testData.Domain,
                testData.EmailDomain);

        registerationPage.clickRegisterButton();

        registerationPage.enterSMSCode(testData.SMSCode);

        Assert.assertTrue(registerationPage.GetSuccessMessage());


    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }


}
