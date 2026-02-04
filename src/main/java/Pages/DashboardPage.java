package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DashboardPage extends BasePage {

    By menuDashboard = By.id("layout-desktop-menu-item-box-dashboard");
    By menuEmployee = By.id("layout-desktop-menu-item-box-employee");
    By menuTraining = By.id("layout-desktop-menu-item-box-training");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuDashboard() {
        click(menuDashboard);
    }

    public void clickMenuEmployee() {
        click(menuEmployee);
    }

    public void clickMenuTraining() {
        click(menuTraining);
    }
}
