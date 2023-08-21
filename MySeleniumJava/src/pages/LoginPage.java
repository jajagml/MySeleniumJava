package pages;

import org.openqa.selenium.By;
import utilities.PageBase;

/* Page object for Login Page */
public class LoginPage extends PageBase {

    private final By userNameTextField = By.id("user-name");
    private final By passwordTextField = By.id("password");
    private final By loginButton = By.id("login-button");

    public boolean IsUserNameTextFieldDisplayed()
    {
        return IsElementDisplayed(userNameTextField);
    }

    public boolean IsPasswordTextFieldDisplayed()
    {
        return IsElementDisplayed(passwordTextField);
    }

    public void UserLogin(String username, String password)
    {
        SendKeys(userNameTextField, username);
        SendKeys(passwordTextField, password);
        ClickElement(loginButton);
    }
}
