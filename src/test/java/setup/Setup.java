package setup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeTest;

public class Setup {

    public WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
}
