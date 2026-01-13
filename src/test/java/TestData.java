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
    public String OrganizationNameArabic = "فالكون لخدمات الأمن و الحراسة";
    public String OrganizationNameEnglish = "Falcon Security Services";
    public String UnifiedNationalID = UNI.toString();
    public String OrganizationSector = "خاص";
    public String OrganizationLogo = "C:\\Users\\sabdelnaby\\IdeaProjects\\HRSDPortalTesting\\src\\test\\java\\FalconSecurityServices.png";
    public String organizationPhone = telNum.toString();
    public String ApplicantName = "محمد";
    public String ApplicantNationalID = ApplicantNatID.toString();
    public String ApplicantPhoneNumber = telNum.toString();
    public String ApplicantJobTitle = "محامي";
    public String FoundationDate = "02042000";
    public String Domain = "@" + getRandomString(5) + ".com";
    public String EmailDomain = "admin" + Domain;
    public String SMSCode = "5555";
}
