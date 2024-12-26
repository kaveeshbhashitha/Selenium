package part2.com.sourcedemo.Test.part3.com.demoQa.base;
import com.demoQa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static com.base.BasePage.delay;
import static utillities.Utility.setUtilityDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMO_QA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMO_QA_URL);
        basePage = new BasePage();
        basePage.setDrive(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}
