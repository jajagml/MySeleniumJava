package utilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/*Test superclass
 * Handles the Test Initialize and Test Clean up
 */
public class TestBase {
    
    /* Responsible for Initializing the test
     * Consist of chromeOptions arguments
    */
    @BeforeTest
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
    @AfterTest
    public void CleanUp()
    {
        UtilityBase.getDriver().quit();
    }
}
