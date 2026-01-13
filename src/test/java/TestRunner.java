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

        // Fill the form and submit
        registerationPage.fillOrganizationRegistrationForm(
                testData.organizationNameArabic,
                testData.organizationNameEnglish,
                testData.unifiedNationalID,
                testData.organizationSector,
                testData.organizationLogo,
                testData.organizationPhone,
                testData.applicantName,
                testData.applicantNationalID,
                testData.applicantJobTitle,
                testData.applicantPhoneNumber,
                testData.foundationDate,
                testData.domain,
                testData.emailDomain
        );

        // Enter SMS code after submission
        registerationPage.enterSMSCode(testData.smsCode);
        Assert.assertTrue(registerationPage.GetSuccessMessage());


    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
