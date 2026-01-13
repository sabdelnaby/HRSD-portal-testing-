package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class OptionPage extends BasePage{

    WebDriver driver;

    public OptionPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    private By AddNewOrganizationButton = By.id("RegisterNewOrganizationButton");

    public void addNewOrganization (){
        driver.findElement(AddNewOrganizationButton).click();

    }

}
