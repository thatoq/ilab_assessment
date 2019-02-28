package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ReadPageElementsFile;
import utils.SeleniumWaitHelper;

import java.io.IOException;
import java.util.Properties;

public class CareersPage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By country = By.xpath(prop.getProperty("country"));


    public CareersPage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isClickCountry() {
        try {
            // Verify visibility of these element from careers page.
         WebElement countryElement= seleniumWaitHelper.waitForElementVisibility(country);
         countryElement.click();


            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
