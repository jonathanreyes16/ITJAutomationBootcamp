package tests;

import org.testng.annotations.Test;

import steps.HomeSteps;



public class HomeTests extends BaseTest {
    HomeSteps homeSteps = new HomeSteps(driver);

    @Test
    public void CategoriesDisplayed(){
        homeSteps.categoriesDisplayed(3);

    }


}
