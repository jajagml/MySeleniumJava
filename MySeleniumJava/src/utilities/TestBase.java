package utilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

/*Test superclass
 * Handles the Test Initialize and Test Clean up
 */
public class TestBase {
    
    /* Responsible for Initializing the test
     * Consist of chromeOptions arguments
    */
    @BeforeMethod
    public void OverallInit()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");

        UtilityBase.InitializeBrowser(options);
    }

    /* Responsible for test clean-up
     * driver wait
    */
    @AfterMethod
    public void CleanUp()
    {
        UtilityBase.getDriver().quit();
    }
}
