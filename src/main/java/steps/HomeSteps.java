package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.HomePage;
import verifications.CustomAssertions;

public class HomeSteps extends BaseSteps{

    HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);

    public HomeSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void categoriesDisplayed(int ExpectedCategories) {
       int totalCategories = homePage.getContainerCategories().findElements(By.xpath("//a[@id='itemc']")).size();
       Assert.assertEquals(totalCategories,ExpectedCategories,
                "The categories displayed are "+totalCategories+" instead of 3");
    }
}
