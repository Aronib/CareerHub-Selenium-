package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    /*@FindBy(css = "#navbarSupportedContent1 > div > ul > li.text-right > a")
    WebElement loginBtn;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/nav/div/div/ul/li[2]/div")
    WebElement joinFFree;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/nav/div/div/ul/li[2]/div/div")
    WebElement participantBtn;

    @FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/div[2]/h3[2]/span/a")
    WebElement loginBtn2;*/

    @FindBy(css = "#root > div > div > div > div > div.col-lg-5.col-sm-8.right-item.login-col > div > div > div.login-card-content > form > div.input-group.mb-1 > input")
    WebElement emailField;

    @FindBy(css = "#root > div > div > div > div > div.col-lg-5.col-sm-8.right-item.login-col > div > div > div.login-card-content > form > div.input-group.mb-3.center > input")
    WebElement passwordField;

    @FindBy(css = "#root > div > div > div > div > div.col-lg-5.col-sm-8.right-item.login-col > div > div > div.login-card-content > form > div.mb-1.login-submit > button")
    WebElement loginSubBtn;

    @FindBy(css = "#root > div.participant-dashboard.trainer-dashboard > div > div:nth-child(1) > div > div > h2")
    WebElement pHeader;

    public String login(String email, String password) throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
        loginSubBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(pHeader));
        return pHeader.getText();
    }
}
