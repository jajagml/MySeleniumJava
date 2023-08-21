package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/* Page object superclass
 * Consist of webdriver helpers
 */
public class PageBase {
    // to find element
    protected WebElement FindMyElement(By el)
    {
        return UtilityBase.getDriver().findElement(el);
    }

    // to click element
    protected void ClickElement(By el)
    {
        FindMyElement(el).click();
    }

    // to clear text field
    protected void ClearElement(By el)
    {
        FindMyElement(el).clear();
    }

    // to submit a submit button
    protected void SubmitElement(By el)
    {
        FindMyElement(el).submit();
    }
    
    // to select option from dropdown by value
    protected void SelectOptionByValue(By el, String value)
    {
        Select dropdown = new Select(FindMyElement(el));
        dropdown.selectByValue(value);
    }

    // to select option from dropdown by text
    protected void SelectOptionByText(By el, String text)
    {
        Select dropdown = new Select(FindMyElement(el));
        dropdown.selectByVisibleText(text);
    }

    // to sendkeys in the element
    protected void SendKeys(By el, String text)
    {
        FindMyElement(el).sendKeys(text);
    }

    // return true if the element is displayed
    protected boolean IsElementDisplayed(By el)
    {
        return FindMyElement(el).isDisplayed();
    }    

    // will make send keys to upper case
    protected void MakeTextUpperCase(By el, String text)
    {
        // String myName = "Janina";
        // String[] a;
        
        // a[0] = String.valueOf(myName.charAt(0));
        // a[1] = String.valueOf(myName.charAt(1));
        Actions actions = new Actions(UtilityBase.getDriver());

        var myEl = FindMyElement(el);
        actions.keyDown(myEl, Keys.SHIFT)
                .sendKeys(myEl, text)
                .keyUp(myEl, Keys.SHIFT)
                .perform();                
    }
    
    // to scroll to element
    protected void ScrollToElement(By el)
    {
        var myEl = FindMyElement(el);

        Actions actions = new Actions(UtilityBase.getDriver());
        actions.scrollToElement(myEl)
                .perform();
    }

    // get the text of the element
    protected String GetText(By el)
    {
        return FindMyElement(el).getText();
    }

    // get the tag name of the element
    protected String GetTagName(By el)
    {
        return FindMyElement(el).getTagName();
    }    
}
