import java.util.Random;

import static pages.BasePage.getRandomString;

public class TestData {

    Random rand = new Random();

    // Generating Random Data
    int ApplicantPhoneNumBase = 512000000;
    int ApplicantPhoneNumRandomPArt = rand.nextInt(100000);
    Integer ApplicantPhoneNum = ApplicantPhoneNumBase + ApplicantPhoneNumRandomPArt;

    long UNIBase = 7_000_000_000L;
    long UNIRandomPart = rand.nextInt(10_000_000);
    Long UNI = UNIBase + UNIRandomPart;

    int telNumBase = 520000000;
    int telNumRandomPArt = rand.nextInt(1000000);
    Integer telNum = telNumBase + telNumRandomPArt;

    long ApplicantNationalID_Base = 1_000_000_000L;
    long randomPart_NationalID = rand.nextInt(10_000_000);
    Long ApplicantNatID = ApplicantNationalID_Base + randomPart_NationalID;

    // Test Data
    public String organizationNameArabic = "فالكون لخدمات الأمن و الحراسة";
    public String organizationNameEnglish = "Falcon Security Services";
    public String unifiedNationalID = UNI.toString();
    public String organizationSector = "خاص";
    public String organizationLogo = "C:\\Users\\sabdelnaby\\IdeaProjects\\HRSDPortalTesting\\src\\test\\java\\FalconSecurityServices.png";
    public String organizationPhone = telNum.toString();
    public String applicantName = "صلاح";
    public String applicantNationalID = ApplicantNatID.toString();
    public String applicantPhoneNumber = telNum.toString();
    public String applicantJobTitle = "مهندس";
    public String foundationDate = "02042000";
    public String domain = "@" + getRandomString(5).toLowerCase() + ".com";
    public String emailDomain = "admin" + domain;
    public String smsCode = "5555";
}
