import modules.CareersModule;
import modules.CountryModule;
import modules.HomeModule;
import modules.JobModule;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page_objects.CareersPage;
import page_objects.CountryPage;
import page_objects.HomePage;
import page_objects.JobPage;
import utils.DataGenerator;
import utils.DataProviderObject;
import utils.DriverFactory;
import utils.GLOBAL_VARIABLES;

public class iLabTests {
    @Test(dataProvider = "Data", dataProviderClass = DataProviderObject.class)
    public void Test (String browser, String name, String email, String motivation) throws Exception {
        WebDriver driver = DriverFactory.getInstance().getBrowserInstance(browser);
        driver.get(GLOBAL_VARIABLES.ILABSITE_URL);

        HomeModule homeModule = new HomeModule(new HomePage(driver));
        homeModule.validateHomePageFields();
        CareersModule careersModule=new CareersModule(new CareersPage(driver));
        careersModule.validateCareesrsPageFields();
        CountryModule countryModule=new CountryModule(new CountryPage(driver));
        countryModule.validateCountryPageFields();

        String phone=DataGenerator.PhoneNumber();
        System.out.println(phone);

        JobModule jobModule=new JobModule(new JobPage(driver));
        jobModule.validateJobPageFields(name,email,phone,motivation);


    }


    @AfterMethod(alwaysRun = true)
    public void destroyDriver() {
        if(DriverFactory.getInstance().getDriver() != null) {
            DriverFactory.getInstance().quitDriver();
        }
    }
}
