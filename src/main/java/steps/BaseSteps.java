package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseSteps {
    WebDriver webDriver;
    Actions customActions;
    //Select customSelect;

    public BaseSteps (WebDriver webDriver) {
        this.webDriver = webDriver;
        this.customActions = new Actions(webDriver);

    }



}
