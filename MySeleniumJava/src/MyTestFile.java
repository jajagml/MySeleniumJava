import org.testng.annotations.*;

import org.testng.Assert;
import utilities.TestBase;
import pages.*;

public class MyTestFile extends TestBase {
    
    LoginPage loginPage = new LoginPage();

    @Test
    /* Login test */
    public void TestLoginPage()
    {
        Assert.assertTrue(loginPage.IsUserNameTextFieldDisplayed(), "Username is not displayed.");
        Assert.assertTrue(loginPage.IsPasswordTextFieldDisplayed(), "Password is not displayed.");        
        
        loginPage.UserLogin("standard_user", "secret_sauce");
    }
}
