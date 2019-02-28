package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ReadPageElementsFile;
import utils.SeleniumWaitHelper;

import java.io.IOException;
import java.util.Properties;

public class CountryPage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By job = By.xpath(prop.getProperty("job"));


    public CountryPage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isClickJob() {
        try {
            // Verify visibility of these elements from the country page
            WebElement jobElement =seleniumWaitHelper.waitForElementVisibility(job);
            jobElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
