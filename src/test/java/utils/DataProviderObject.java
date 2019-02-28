package utils;

import org.testng.annotations.DataProvider;

public class DataProviderObject {

    /*
     * Data could easily come from an external file like excel spreadsheet.
     * For the purpose of this demonstration, will keep it simple by hardcoding it :)
     */

    @DataProvider(parallel = true)
    public Object[][] Data() {
        return new Object[][] {
                {"chrome", "thato", "thatoqhusheka@gmail.com","career growth"}
        };
    }


}
