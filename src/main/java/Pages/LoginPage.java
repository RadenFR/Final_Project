package Pages;

import Core.EnvConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By inputUsername = By.id("input-username-or-email");
    By inputPassword = By.id("input-password");
    By buttonLogin = By.id("button-sign-in");

    public void inputUsername(String username) {
        type(inputUsername, username);
    }

    public void inputPassword(String password) {
        type(inputPassword, password);
    }

    public void clickButtonLogin() {
        click(buttonLogin);
    }

    public void loginDefaultUser() {
        inputUsername(EnvConfig.get("EMAIL"));
        inputPassword(EnvConfig.get("PASSWORD"));
        clickButtonLogin();
    }
}
