package Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Login;
import pages.CreateSlot;
import setup.Setup;

public class CreateSlotTestRunner extends Setup {
    Login objLogin;

    /*@BeforeTest
    public void visitUrl(){
        driver.get("https://careerhub-frontend.bracits.com/");
    }*/

    @Test
    public void doLogin() throws InterruptedException {
        objLogin = new Login();

        objLogin.login("sdp_c", "123456");
        String expectedTitle = "Today's Summary";
        String pageHeader = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(pageHeader, expectedTitle, "Not matched");
    }
}
