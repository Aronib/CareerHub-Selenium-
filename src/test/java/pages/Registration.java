package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {

    WebDriver driver;

    @FindBy (xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[2]/a")
    WebElement joinButton;

    @FindBy (xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[2]/div/a[1]")
    WebElement participantButton;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/input")
    WebElement fullNameField;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div[2]/form/div[2]/input")
    WebElement emailField;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/input")
    WebElement confirmEmailField;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/input")
    WebElement mobileField;

    @FindBy (xpath = "//*[@id=\"color\"]/div/div[1]/div[2]")
    WebElement viewDistrictButton;

    @FindBy (xpath = "//*[@id=\"react-select-2-input\"]")
    WebElement selectDistrict;
    @FindBy (xpath = "//*[@id=\"color\"]/div/div[1]/div[2]")
    WebElement viewEducationStatusButton;

    @FindBy (xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[2]/div/a[1]")
    WebElement participantButton;

    @FindBy (xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[2]/div/a[1]")
    WebElement participantButton;

    @FindBy (xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[2]/div/a[1]")
    WebElement participantButton;

    @FindBy (xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[2]/div/a[1]")
    WebElement participantButton;
}
