package stepDefination;

import commonFunctions.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

public class LoginPageStepDefination extends CommonMethods {


    @Given("User open browser and then enter KareHealth URL")
    public void navigateToURL() {
        initDriver("CHROME");
        driver.get("http://karehealth.menpaniproducts.com/admin/auth/login");

    }

    @When("User enter correct username")
    public void enterCorrectUsername() {
        enterValues(By.name("username"), "admin");
    }

    @Then("User enter correct Password")
    public void enterUserName() {
        enterValues(By.name("password"), "admin");

    }

    @Then("User click on Submit Button")
    public void clickSubmitButton() {
        click(By.className("btn"));
    }

    @When("^User enter Incorrect username$")
    public void userEnterIncorrectUsername() {
        enterValues(By.name("username"), "Ashish");
    }

    @Then("^Verify the Error Message$")
    public void verifyTheErrorMessage() throws IOException {
        String actualErrorMessage = extractData(By.className("control-label"));
        System.out.println("Error Message = "+actualErrorMessage);
        Assert.assertEquals(actualErrorMessage, "These credentials do not match our records.");
        takeScreenshot();

        String s= "Ashish";
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("s","a"));
        System.out.println(s.equals("ashish"));
        System.out.println(s.contains("sh"));
    }
}
