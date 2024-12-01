package setup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import java.time.Duration;


public class Setup {

    public WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //@FindBy(xpath = "/html/body/div[8]/div/div[2]/div/div[2]/div/div/button")
        //WebElement closePopUP;
        driver.get("https://careerhub-frontend.bracits.com/");
        PageFactory.initElements(driver, this);

        try {
            // Wait for the pop-up and close it if present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement closePopUp = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div/div/button")
            ));
            closePopUp.click();
        } catch (TimeoutException e) {
            System.out.println("Pop-up not displayed. Proceeding with test.");
        }
    }
}
