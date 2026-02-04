package Core;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String status, String testName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            String screenshotDir = System.getProperty("user.dir") + "/screenshots/";
            new File(screenshotDir).mkdirs();

            String filePath = screenshotDir + status + "_" + testName + ".png";
            Files.copy(src.toPath(), new File(filePath).toPath());

            return "../screenshots/" + status + "_" + testName + ".png";

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
