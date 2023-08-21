package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/* Utility Base class
 * Only part where driver must initialized
*/
public class UtilityBase {

    private static WebDriver _driver;

    /* Get method of the _driver
     * returns _driver
     */
    public static WebDriver getDriver() {
        return _driver;
    }
    
    /* Set-up and initialize the browser
     * Set-up of the implicit wait applied in _driver
    */
    public static void InitializeBrowser(ChromeOptions chromeOptions)
    {
        _driver = new ChromeDriver(chromeOptions);
        _driver.navigate().to("https://www.saucedemo.com/");
        _driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); // 1 sec = 1000 ms
    }

}
