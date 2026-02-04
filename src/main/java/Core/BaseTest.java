package Core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void startReport() {
        extent = ReportManager.getReportInstance();
    }

    @BeforeMethod
    public void setUp(Method method) {
        DriverManager.initDriver();
        driver = DriverManager.getDriver();
        driver.get(EnvConfig.get("BASE_URL"));

        // CREATE TEST DI REPORT
        test = extent.createTest(method.getName());

        test.info("Navigate to URL: " + EnvConfig.get("BASE_URL"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        String status;

        if (result.getStatus() == ITestResult.SUCCESS) {
            status = "SUCCESS";
            test.pass("Test Passed");
        }
        else if (result.getStatus() == ITestResult.FAILURE) {
            status = "FAILED";
            test.fail(result.getThrowable());
        }
        else {
            status = "SKIPPED";
            test.skip("Test Skipped");
        }

        // SCREENSHOT
        String screenshotPath = ScreenshotUtil.takeScreenshot(
                DriverManager.getDriver(),
                status,
                result.getName()
        );

        if (screenshotPath != null) {
            test.addScreenCaptureFromPath(screenshotPath);
        }

        // OPTIONAL WAIT (UX)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DriverManager.quitDriver();
    }

    @AfterSuite
    public void endReport() {
        extent.flush();
    }
}
