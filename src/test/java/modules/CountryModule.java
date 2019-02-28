package modules;

import org.testng.Assert;
import page_objects.CareersPage;
import page_objects.CountryPage;

public class CountryModule {
    private CountryPage countryPage;

    public CountryModule(CountryPage countryPage) { this.countryPage = countryPage;
    }

    public void validateCountryPageFields() {
        boolean isCountryPage = countryPage.isClickJob();

        Assert.assertTrue(isCountryPage, "Failed to validate that job was clicked successfully.");
    }
}
