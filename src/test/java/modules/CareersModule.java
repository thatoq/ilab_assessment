package modules;

import org.testng.Assert;
import page_objects.CareersPage;

public class CareersModule {
    private CareersPage careersPage;

    public CareersModule(CareersPage careersPage) {
        this.careersPage = careersPage;
    }

    public void validateCareesrsPageFields() {
        boolean isCareersPage = careersPage.isClickCountry();

        Assert.assertTrue(isCareersPage, "Failed to validate that country was clicked successfully.");
    }

}
