package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import setup.Setup;

import java.time.Instant;

public class LoginTestRunner extends Setup {

    Login objLogin = new Login(driver);;

   /* @BeforeTest
    public void visitUrl() throws InterruptedException {
        driver.get("https://careerhub-frontend.bracits.com/login");
        objLogin = new Login(driver);
        /*try {
            // Wait for the pop-up and close it if present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement closePopUp = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div/button/i")
            ));
            closePopUp.click();
        } catch (TimeoutException e) {
            System.out.println("Pop-up not displayed. Proceeding with test.");
        }

    }*/

    @Test
    public void doLogin() throws InterruptedException {

        String pageHeader = objLogin.login("sdp_c", "123456");
        String expectedTitle = "Today's Summary";
        Assert.assertEquals(pageHeader, expectedTitle, "Not matched");
    }
}
