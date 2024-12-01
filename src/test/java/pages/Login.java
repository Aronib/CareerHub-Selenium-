package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[1]/a")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/input")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/input")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div[2]/form/div[5]/button")
    WebElement loginSubBtn;

    public void login(String email, String password) throws InterruptedException {
        Thread.sleep(5000);
        loginBtn.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginSubBtn.click();
    }
}
