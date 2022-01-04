package TestNG;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

// Top to bottom below are the TestNG Annotations Execution Flow order:
public class Annotations {
    // Soft assert example
    SoftAssert softassert = new SoftAssert();

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Chrome - Set Up System Property");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Open Chrome");
    }

    // BeforeClass and AfterClass annotations run before a test class starts and after all the test methods
    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Test Application");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Sign In");
    }

    @Test (priority = 1)
    // Example of groups attribute: @Test (groups = "initialize")
    // Example of dependsOnGroups attribute: @Test (dependsOnGroups = "groupName")
    public void searchCustomer() {
        // Hard asserts in this method, will skip other assertions in method/annotation if first one fails and move
        // on to the next annotation:
        System.out.println("Search For Customer");
        Assert.assertEquals(true, true, "Could not search for customer");
        System.out.println("Verify customer search");

        // Assertion below will pass if the condition returns false
        Assert.assertFalse(false, "Search tab not displayed on home page");
        System.out.println("Verify Search Tab");

        Assert.assertTrue(true, "The search bar is not correct on the home page");
        System.out.println("Verify Search Bar");
    }

    // Soft Assert example with Depends on Methods attribute for dependency:
    @Test (dependsOnMethods = "searchCustomer")
    // @Test (dependsOnMethods = { "searchCustomer", "anotherMethod" })
    public void searchProduct() {
        // Test execution will continue even after a fail and moves to the next assertion statement in line/annotation
        // even after a failed verification step:
        System.out.println("Search For Product");
        softassert.assertEquals(true, true, "Could not search for product");
        System.out.println("Verify product search");

        // Assertion below will pass if the condition returns false
        softassert.assertFalse(false, "Search product tab not displayed on home page");
        System.out.println("Verify Search Product Tab");

        softassert.assertTrue(true, "The search product bar is not correct on the home page");
        System.out.println("Verify Search Product Bar");

        softassert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Sign Out");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Close Test Application");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Close Chrome");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Chrome - Clean Up All Cookies");
    }

    // Data Driven Testing:
    // Data Provider Annotation example along with dataProvider attribute on test method:
    @Test(dataProvider = "logInData")
    // Parameter annotation example: @Parameters({ "paramNameInXmlFile", "paramName2InXmlFile" }) for cross browser test
    // and must match parameter names in xml file
    public void logIn(String email, String password, boolean success) {
        System.out.println("Log In Credentials: " + "\n" +
                " Email = " + email + "\n" +
                " Password = " + password + "\n" +
                " Successful Log In = " + success + "\n");
    }

    @DataProvider(name = "logInData")
    // JUnit5 annotation: @DisplayName("UserStory - TestCase - Description")
    // provides data to the logIn() test method with corresponding values to parameters as arguments
    // DataProvider annotation provides a way to pass an unlimited number of values of any data type to a test method
    // and allows test method to be invoked with different data sets (in this example below, 3 sets of data):
    public Object [][] logInData() {
        //2D matrix object
        Object [][] data = new Object [3][3];
        data [0][0] = "hi@hello.com";     data [0][1] = "123";        data [0][2] = true;
        data [1][0] = "hi2@hello.com";    data [1][1] = "test";       data [1][2] = false;
        data [2][0] = "hi3@hello.com";    data [2][1] = "welcome";    data [2][2] = true;

        return data;
    }
}

// Test Requirements determine which annotation to choose for testing