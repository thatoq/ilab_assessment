package modules;

import org.testng.Assert;

import page_objects.HomePage;
import page_objects.JobPage;

public class JobModule {
    private JobPage jobPage;

    public JobModule(JobPage jobPage) {
        this.jobPage = jobPage;
    }

    public void validateJobPageFields(String name, String email, String phone, String motivation) {
        boolean isJobPage = jobPage.isClickApplyButton();
        Assert.assertTrue(isJobPage, "Failed to validate that apply button was clicked successfully.");

        boolean isName = jobPage.isInputName(name);
        Assert.assertTrue(isName, "Failed to validate that name was entered successfully.");

        boolean isEmail = jobPage.isInputEmail(email);
        Assert.assertTrue(isEmail, "Failed to validate that email was entered successfully.");

        boolean isPhone = jobPage.isInputPhone(phone);
        Assert.assertTrue(isPhone, "Failed to validate that phone was entered successfully.");

        boolean isMotivation = jobPage.isInputMotivation(motivation);
        Assert.assertTrue(isMotivation, "Failed to validate that motivation was entered successfully.");

        boolean isSubmit = jobPage.isClickSubmitButton();
        Assert.assertTrue(isSubmit, "Failed to validate that submit button was clicked successfully.");
    }
}
