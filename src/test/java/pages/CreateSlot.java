package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateSlot {

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent1\"]/div/ul/li[3]/a" )
    WebElement mySlotBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/div[1]/ul/li/a" )
    WebElement createSlotBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[2]/div/div/input" )
    WebElement dateSelectBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[3]/div/div/div/div/input" )
    WebElement timeFromBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[5]/div/div/select" )
    WebElement counsellingTypeBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[5]/div/div/select/option[2]" )
    WebElement onboardingOption;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[6]/div/div/select" )
    WebElement sessionTypeField;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[6]/div/div/select/option[2]" )
    WebElement sessionTypeOn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[7]/div/div/input" )
    WebElement capacityField;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/form/div/div/div[9]/button" )
    WebElement submitBtn;

    public void createSlotPage(){
        mySlotBtn.click();
        createSlotBtn.click();
    }

    public void dateAndTime(String slotDate, String slotTime){
        dateSelectBtn.sendKeys(slotDate);
        timeFromBtn.sendKeys(slotTime);
    }

    public void createOnboarding(String capacity){
        counsellingTypeBtn.click();
        onboardingOption.click();
        sessionTypeField.click();
        sessionTypeOn.click();
        capacityField.sendKeys(capacity);
    }

    public void submitSlot(){
        submitBtn.click();
    }
}
