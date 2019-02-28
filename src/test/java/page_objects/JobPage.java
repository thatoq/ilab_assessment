package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ReadPageElementsFile;
import utils.SeleniumWaitHelper;

import java.io.IOException;
import java.util.Properties;

public class JobPage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By applyButton = By.xpath(prop.getProperty("applyButton"));
    By name = By.id(prop.getProperty("firstName"));
    By email = By.id(prop.getProperty("email"));
    By phone = By.id(prop.getProperty("phone"));
    By motivation = By.id(prop.getProperty("motivation"));
    By submit = By.id(prop.getProperty("submitButton"));


    public JobPage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isClickApplyButton() {
        try {
            // Verify visibility of these elements from the jobe page
             WebElement applyButtonElement= seleniumWaitHelper.waitForElementVisibility(applyButton);
             applyButtonElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputName(String Fname) {
        try {
            // Verify visibility of these elements from the jobe page
            WebElement nameElement= seleniumWaitHelper.waitForElementVisibility(name);
            nameElement.sendKeys(Fname);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputEmail(String emailAdd) {
        try {
            // Verify visibility of these elements from the jobe page
            WebElement emailElement= seleniumWaitHelper.waitForElementVisibility(email);
            emailElement.sendKeys(emailAdd);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputPhone(String phoneNumber) {
        try {
            // Verify visibility of these elements from the jobe page
            WebElement phoneElement= seleniumWaitHelper.waitForElementVisibility(phone);
            phoneElement.sendKeys(phoneNumber);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputMotivation(String message) {
        try {
            // Verify visibility of these elements from the jobe page
            WebElement motivationElement= seleniumWaitHelper.waitForElementVisibility(motivation);
            motivationElement.sendKeys(message);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isClickSubmitButton() {
        try {
            // Verify visibility of these elements from the jobe page
            WebElement submitButtonElement= seleniumWaitHelper.waitForElementVisibility(submit);
            submitButtonElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
