package commonFunctions;

import driver.DriverHandling;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class CommonMethods {

    public WebDriver driver;


    // Common function which is used in Page object for eg. click, entering data , scroll ,
    public void click(By element) {
        driver.findElement(element).click();
    }


    public void enterValues(By element, String data) {
        driver.findElement(element).sendKeys(data);
    }
    // Create function to check element is present or not

    public boolean isElementPresent(WebDriver driver, By element) {
        try {
            if (driver.findElement(element).isDisplayed()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public void initDriver(String browser) {
        driver = new DriverHandling().setupBrowser(browser);
    }

    public String extractData(By element) {
        return driver.findElement(element).getText();
    }

    public void takeScreenshot() throws IOException {
        String filePath = "src/main/java/report/screnshot/";
        File path = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(path, new File(filePath + "screenshot.jpg"));
    }
}
