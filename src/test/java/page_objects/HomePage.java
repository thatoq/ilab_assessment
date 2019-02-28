package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ReadPageElementsFile;
import utils.SeleniumWaitHelper;

import java.io.IOException;
import java.util.Properties;

public class HomePage {

    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By careers = By.xpath(prop.getProperty("careers"));


    public HomePage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isClickCareers() {
        try {
            // Verify visibility of these elements from the home page
            WebElement careersElement=  seleniumWaitHelper.waitForElementVisibility(careers);
            careersElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
