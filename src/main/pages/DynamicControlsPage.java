package src.main.pages;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends BasePage{
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkbox-example > button")
    private WebElement addRemoveButton;

    @FindBy(css = "#checkbox-example #checkbox")
    private WebElement checkBox;

    @FindBy(css = "#input-example > button")
    private WebElement enableDisableButton;

    @FindBy(css = "#input-example > input")
    private WebElement textField;

    public void clickAddRemoveButtonAndWaitUntilFinish(){
        clickButtonAndWaitUntilFinish(addRemoveButton);
    }

    public boolean isCheckBoxPresent() {
        boolean found = false;
        try {
            found = checkBox.isDisplayed();
        } catch(NoSuchElementException ex) {
            found = false;
        }
        return found;
    }

    public void clickEnableDisableButtonAndWaitUntilFinish() {
        clickButtonAndWaitUntilFinish(enableDisableButton);
    }

    public boolean isFieldEnabled() {
        return textField.isEnabled();
    }

}
