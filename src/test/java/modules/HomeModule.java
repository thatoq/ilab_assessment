package modules;

import org.testng.Assert;
import page_objects.HomePage;

public class HomeModule {
    private HomePage homePage;

    public HomeModule(HomePage homePage) {
        this.homePage = homePage;
    }

    public void validateHomePageFields() {
        boolean isHomepage = homePage.isClickCareers();

        Assert.assertTrue(isHomepage, "Failed to validate that careers link was clicked successfully.");
    }

}
