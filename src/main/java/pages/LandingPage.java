package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class LandingPage extends BasePage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    By languageBtn = By.id("langBtn");
    By loginBtn = By.id("loginBtn");


    public void navigateToLandingPage() {
        String baseURL = "https://stg-dev.hrsdportal.hrsd.gov.sa/";
        driver.get(baseURL);


    }

    public void changeLanguageToEnglish() {
        driver.findElement(languageBtn).click();
    }

    public void clickOnLoginButton() {
        driver.findElement(loginBtn).click();
    }


}
