package pages;

import org.openqa.selenium.*;

import java.util.ArrayList;

public class RegisterationPage extends BasePage {

    WebDriver driver;

    public RegisterationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private By SignUpButton = By.cssSelector("dga-button#RegisterButton");
    private By SubmitButton = By.cssSelector("dga-button#ConfirmButton");

    String ArabicNameLocatorHost = "dga-field[id='OrganizationArabicNameField']";
    String ArabicNameLocatorShadowRoot = "input[placeholder='Organization Name in Arabic']";
    ArrayList<String> ArabicNameShadowRoots = new ArrayList<>();

    String EnglishNameLocatorHost = "dga-field[id='OrganizationEnglishNameField']";
    String EnglishNameLocatorShadowRoot = "input[placeholder='Organization Name in English']";
    ArrayList<String> EnglishNameShadowRoots = new ArrayList<>();

    String UnifiedNationalNumberLocatorHost = "dga-numeric-field[id='Number700Field']";
    String UnifiedNationalNumberShadowRoot = "input[placeholder='The Unified National Number']";
    ArrayList<String> UnifiedNationalNumberShadowRoots = new ArrayList<>();

    String OrganizationSectorLocatorHost = "dga-field[id='OrganizationOrientationField']";
    String OrganizationSectorShadowRoot = "input[placeholder='Organization Sector']";
    ArrayList<String> OrganizationSectorShadowRoots = new ArrayList<>();

//    String LogoBrowseButtonHost = "dga-button[class='single-button dark small center hydrated']";
//    String LogoBrowseButtonRoot = "button[aria-label='submit']";
//    ArrayList<String> LogoBrowseButtonShadowRoots = new ArrayList<>();

    String OrganizationPhoneLocatorHost = "dga-field[id='OrganizationPhoneField']";
    String OrganizationPhoneShadowRoot = "input[placeholder='111234567']";
    ArrayList<String> OrganizationPhoneShadowRoots = new ArrayList<>();

    String ApplicantNameLocatorHost = "dga-field[id='OrganizationRepresentativeNameField']";
    String ApplicantNameShadowRoot = "input[placeholder='Applicant Name']";
    ArrayList<String> ApplicantNameShadowRoots = new ArrayList<>();

    String ApplicantNationalIDLocatorHost = "dga-numeric-field[id='OrganizationRepresentativeIDField']";
    String ApplicantNationalIDShadowRoot = "input[placeholder='Applicant National ID']";
    ArrayList<String> ApplicantNationalIDShadowRoots = new ArrayList<>();

    String ApplicantPhoneNumberLocatorHost = "dga-field[id='OrganizationRepresentativePhoneField']";
    String ApplicantPhoneNumberShadowRoot = "input[placeholder='512345678']";
    ArrayList<String> ApplicantPhoneNumberShadowRoots = new ArrayList<>();

    String ApplicantJobTitleLocatorHost = "dga-field[formcontrolname='applicantPosition']";
    String ApplicantJobTitleShadowRoot = "input[placeholder='Applicant Job Title']";
    ArrayList<String> ApplicantJobTitleShadowRoots = new ArrayList<>();

    String FoundationDateLocatorHost = "dga-date-field[id='FoundationDateField']";
    String FoundationDateShadowRoot = "input[placeholder='DD/MM/YYYY']";
    ArrayList<String> FoundationDateShadowRoots = new ArrayList<>();

    String DomainFieldLocatorHost = "dga-field[id='DomainField']";
    String DomainFieldShadowRoot = "input[placeholder='@example.com']";
    ArrayList<String> DomainFieldShadowRoots = new ArrayList<>();

    String LogoPictureLocatorHost = "dga-upload[id='OrganizationSloganButton']";
    String LogoPictureShadowRoot = "input[type='file']";
    ArrayList<String> LogoPictureShadowRoots = new ArrayList<>();

    String EmailDomainFieldLocatorHost = "dga-field[id='EmailDomainField']";
    String EmailDomainFieldShadowRoot = "input[placeholder='someone@example.com']";
    ArrayList<String> EmailDomainFieldShadowRoots = new ArrayList<>();

//    String RegisterButtonLocatorHost = "dga-field[id='EmailDomainField']";
//    String RegisterButtonShadowRoot = "input[id='RegisterButton']";
//    ArrayList<String> RegisterButtonShadowRoots = new ArrayList<>();

    String SMSCode0LocatorHost = "dga-sms-code-field[id='VerificationCodeField']";
    String SMSCode0ShadowRoot = "input[id='-0']";
    ArrayList<String> SMSCode0ShadowRoots = new ArrayList<>();

    String SMSCode1LocatorHost = "dga-sms-code-field[id='VerificationCodeField']";
    String SMSCode1ShadowRoot = "input[id='-1']";
    ArrayList<String> SMSCode1ShadowRoots = new ArrayList<>();

    String SMSCode2LocatorHost = "dga-sms-code-field[id='VerificationCodeField']";
    String SMSCode2ShadowRoot = "input[id='-2']";
    ArrayList<String> SMSCode2ShadowRoots = new ArrayList<>();

    String SMSCode3LocatorHost = "dga-sms-code-field[id='VerificationCodeField']";
    String SMSCode3ShadowRoot = "input[id='-3']";
    ArrayList<String> SMSCode3ShadowRoots = new ArrayList<>();

    String SuccessMessageShadowRoot = "dga-text[class='content dga_body_l_regular success_strong hydrated']";
    String SuccessMessageShadowRootHost1 = "dga-message[class='alert-content hydrated']";
    String SuccessMessageShadowRootHost2 = "dga-alert[class='alert hydrated']";
    ArrayList<String> SuccessMessageShadowRoots = new ArrayList<>();

    public void enterArabicName(String arabicName) throws InterruptedException {
        ArabicNameShadowRoots.add(ArabicNameLocatorHost);
        ArabicNameShadowRoots.add(ArabicNameLocatorShadowRoot);
        try {
            getShadowRootElement(ArabicNameShadowRoots).sendKeys(arabicName);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            getShadowRootElement(ArabicNameShadowRoots).sendKeys(arabicName);
        }
    }

    public void enterEnglishName(String englishName) throws InterruptedException {
        EnglishNameShadowRoots.add(EnglishNameLocatorHost);
        EnglishNameShadowRoots.add(EnglishNameLocatorShadowRoot);
        try {
            getShadowRootElement(EnglishNameShadowRoots).sendKeys(englishName);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            getShadowRootElement(EnglishNameShadowRoots).sendKeys(englishName);
        }
    }

    public void enterUnifiedNationalNumber(String unifiedNationalID) throws InterruptedException {
        UnifiedNationalNumberShadowRoots.add(UnifiedNationalNumberLocatorHost);
        UnifiedNationalNumberShadowRoots.add(UnifiedNationalNumberShadowRoot);
        try {
            getShadowRootElement(UnifiedNationalNumberShadowRoots).sendKeys(unifiedNationalID);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            getShadowRootElement(UnifiedNationalNumberShadowRoots).sendKeys(unifiedNationalID);
        }
    }

    public void selectOrganizationSector(String organizationsector) throws InterruptedException {
        OrganizationSectorShadowRoots.add(OrganizationSectorLocatorHost);
        OrganizationSectorShadowRoots.add(OrganizationSectorShadowRoot);
        try {
            getShadowRootElement(OrganizationSectorShadowRoots).sendKeys(organizationsector);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            getShadowRootElement(OrganizationSectorShadowRoots).sendKeys(organizationsector);
        }
    }

    public void logoUpload(String picturePath) throws InterruptedException {
        LogoPictureShadowRoots.add(LogoPictureLocatorHost);
        LogoPictureShadowRoots.add(LogoPictureShadowRoot);
        try {
            getShadowRootElement(LogoPictureShadowRoots).sendKeys(picturePath);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            getShadowRootElement(LogoPictureShadowRoots).sendKeys(picturePath);
        }
    }

    public void enterOrganizationPhone(String organizationPhone) throws InterruptedException {
        OrganizationPhoneShadowRoots.add(OrganizationPhoneLocatorHost);
        OrganizationPhoneShadowRoots.add(OrganizationPhoneShadowRoot);
        try {
            getShadowRootElement(OrganizationPhoneShadowRoots).sendKeys(organizationPhone);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(OrganizationPhoneShadowRoots).sendKeys(organizationPhone);
        }
    }

    public void enterApplicantName(String applicantName) throws InterruptedException {
        ApplicantNameShadowRoots.add(ApplicantNameLocatorHost);
        ApplicantNameShadowRoots.add(ApplicantNameShadowRoot);
        try {
            getShadowRootElement(ApplicantNameShadowRoots).sendKeys(applicantName);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(ApplicantNameShadowRoots).sendKeys(applicantName);
        }
    }

    public void enterApplicantNationalId(String applicantNationalID) throws InterruptedException {
        ApplicantNationalIDShadowRoots.add(ApplicantNationalIDLocatorHost);
        ApplicantNationalIDShadowRoots.add(ApplicantNationalIDShadowRoot);
        try {
            getShadowRootElement(ApplicantNationalIDShadowRoots).sendKeys(applicantNationalID);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(ApplicantNationalIDShadowRoots).sendKeys(applicantNationalID);
        }
    }

    public void enterApplicantPhoneNumber(String ApplicantPhoneNumber) throws InterruptedException {
        ApplicantPhoneNumberShadowRoots.add(ApplicantPhoneNumberLocatorHost);
        ApplicantPhoneNumberShadowRoots.add(ApplicantPhoneNumberShadowRoot);
        try {
            getShadowRootElement(ApplicantPhoneNumberShadowRoots).sendKeys(ApplicantPhoneNumber);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(ApplicantPhoneNumberShadowRoots).sendKeys(ApplicantPhoneNumber);
        }
    }

    public void enterApplicantJobTitle(String jobTitle) throws InterruptedException {
        ApplicantJobTitleShadowRoots.add(ApplicantJobTitleLocatorHost);
        ApplicantJobTitleShadowRoots.add(ApplicantJobTitleShadowRoot);
        try {
            getShadowRootElement(ApplicantJobTitleShadowRoots).sendKeys(jobTitle);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(ApplicantJobTitleShadowRoots).sendKeys(jobTitle);
        }
    }

    public void enterFoundationDate(String foundationDate) throws InterruptedException {
        FoundationDateShadowRoots.add(FoundationDateLocatorHost);
        FoundationDateShadowRoots.add(FoundationDateShadowRoot);
        try {
            getShadowRootElement(FoundationDateShadowRoots).sendKeys(foundationDate);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(FoundationDateShadowRoots).sendKeys(foundationDate);
        }
    }

    public void enterDomain(String domain) throws InterruptedException {
        DomainFieldShadowRoots.add(DomainFieldLocatorHost);
        DomainFieldShadowRoots.add(DomainFieldShadowRoot);
        try {
            getShadowRootElement(DomainFieldShadowRoots).sendKeys(domain);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(DomainFieldShadowRoots).sendKeys(domain);
        }
    }

    public void enterEmailDomain(String emailDomain) throws InterruptedException {
        EmailDomainFieldShadowRoots.add(EmailDomainFieldLocatorHost);
        EmailDomainFieldShadowRoots.add(EmailDomainFieldShadowRoot);
        try {
            getShadowRootElement(EmailDomainFieldShadowRoots).sendKeys(emailDomain);
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException | InterruptedException e) {
            getShadowRootElement(EmailDomainFieldShadowRoots).sendKeys(emailDomain);
        }
    }

    public void enterSMSCode(String code) throws InterruptedException {
        SMSCode0ShadowRoots.add(SMSCode0LocatorHost);
        SMSCode0ShadowRoots.add(SMSCode0ShadowRoot);

        SMSCode1ShadowRoots.add(SMSCode1LocatorHost);
        SMSCode1ShadowRoots.add(SMSCode1ShadowRoot);

        SMSCode2ShadowRoots.add(SMSCode2LocatorHost);
        SMSCode2ShadowRoots.add(SMSCode2ShadowRoot);

        SMSCode3ShadowRoots.add(SMSCode3LocatorHost);
        SMSCode3ShadowRoots.add(SMSCode3ShadowRoot);

        getShadowRootElement(SMSCode0ShadowRoots).sendKeys(String.valueOf(code.charAt(0)));
        getShadowRootElement(SMSCode1ShadowRoots).sendKeys(String.valueOf(code.charAt(1)));
        getShadowRootElement(SMSCode2ShadowRoots).sendKeys(String.valueOf(code.charAt(2)));
        getShadowRootElement(SMSCode3ShadowRoots).sendKeys(String.valueOf(code.charAt(3)));

        click(driver.findElement(SubmitButton));
    }

    public void clickRegisterButton() {
        waitForClickability(driver.findElement(SignUpButton));
        scrollIntoView(driver.findElement(SignUpButton));
        jsClick(driver.findElement(SignUpButton));
    }

    public boolean GetSuccessMessage() throws InterruptedException {
        try {
            WebElement msgElement = locateElementInNestedShadowRoots(
                    SuccessMessageShadowRootHost2,
                    SuccessMessageShadowRootHost1,
                    SuccessMessageShadowRoot
            );

            scrollIntoView(msgElement);

            String actualText = msgElement.getText();
            System.out.println("Found Message Text: " + actualText);

            return actualText.contains("An email ");

        } catch (Exception e) {
            System.out.println("Timeout or error waiting for message. Taking screenshot...");
            takeScreenshot("SuccessMessageFailure");
            throw new RuntimeException("Success message verification failed.", e);
        }
    }

    public void fillOrganizationRegistrationForm(
            String arabicName,
            String englishName,
            String UNF,
            String sector,
            String picturePath,
            String organizationPhone,
            String applicantName,
            String applicantNationalID,
            String applicantJobTitle,
            String applicantPhoneNumber,
            String foundationDate,
            String domain,
            String emailDomain
    ) throws InterruptedException {

        enterArabicName(arabicName);
        enterEnglishName(englishName);
        enterUnifiedNationalNumber(UNF);
        selectOrganizationSector(sector);

        logoUpload(picturePath);
        enterOrganizationPhone(organizationPhone);

        enterApplicantName(applicantName);
        enterApplicantNationalId(applicantNationalID);
        enterApplicantPhoneNumber(applicantPhoneNumber);
        enterApplicantJobTitle(applicantJobTitle);

        enterFoundationDate(foundationDate);
        enterDomain(domain);
        enterEmailDomain(emailDomain);

        clickRegisterButton();
    }
}
