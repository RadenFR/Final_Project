package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class EmployeePage extends BasePage{

    public EmployeePage(WebDriver driver) {
        super(driver);
    }

    //HALAMAN AWAL MENU EMPLOYEE
    By buttonSearchBar = By.id("input-admin-employee-search");
    By inputSearchBar = By.xpath("//input[@placeholder='Search name, e-mail, phone...']");
    By buttonAddEmployee = By.id("button-add-employee");
    By buttonDetailEmployee = By.id("button-detail-employee-0");
    By successMessage = By.xpath("//*[contains(text(),'Success') or contains(text(),'Berhasil')]");
    By failedMessage = By.xpath("//*[contains(text(),'Failed') or contains(text(),'Gagal')]");

    //FORM TAMBAH EMPLOYEE
    By inputNameEmployee = By.id("name");
    By inputEmployeeId = By.id("employeeId");
    By inputEmail = By.id("email");
    By inputPhoneNumber = By.id("phoneNumber");
    By clickDivision = By.id("division");
    By selectDivision = By.xpath("//option[contains(text(),'Business')]");
    By inputEmployeeRole = By.id("employeeRole");
    By clickAngkatan = By.id("menu-button-:rae:");
    By selectAngkatan = By.xpath("//option[contains(text(),'2024 Ganjil')]");
    By clickGenderMale = By.id("add-employee-gender-radio-male");
    By clickGenderFemale = By.id("add-employee-gender-radio-female");
    By inputBirthDate = By.id("date");
    By inputAddress = By.id("address");
    By inputNIK = By.id("nik");
    By inputNPWP = By.id("npwp");
    By buttonSubmitEmployee = By.id("button-add-employee-submit");


    //FORM EDIT EMPLOYEE
    By buttonEditEmployee = By.id("edit-employee-button");
    By inputEditNameEmployee = By.id("edit-employee-name-input");
    By inputEditEmployeeId = By.id("edit-employee-employee-id-input");
    By inputEditEmail = By.id("edit-employee-email-input");
    By inputEditPhoneNumber = By.id("edit-employee-phone-number-input");
    By clickEditDivision = By.id("edit-employee-division-select");
    By selectEditDivision = By.xpath("//option[contains(text(),'Implementator')]");
    By editEmployeeRole = By.id("edit-employee-employee-role-input");
    By editAngkatan = By.id("menu-button-:r47:");
    By selectEditAngkatan = By.xpath("//option[contains(text(),'2025 Genap')]");
    By selectEditGenderMale = By.id("edit-employee-gender-radio-male");
    By selectEditGenerFemale = By.id("edit-employee-gender-radio-female");
    By inputEditBirthDate = By.id("edit-employee-birth-date-input");
    By inputEditAddress = By.id("edit-employee-address-textarea");
    By inputEditNIK = By.id("edit-employee-nik-input");
    By inputEditNPWP = By.id("edit-employee-npwp-input");
    By buttonSaveChanges = By.id("edit-employee-save-changes-button");

    //FORM HAPUS EMPLOYEE
    By buttonDelete = By.id("delete-employee-button");
    By submitDelete = By.id("confirm-delete-button");



    //MENU EMPLOYEE
    public void clickSearchBar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(buttonSearchBar));

        click(buttonSearchBar);
    }

    public void inputSearchBar(String ib) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(inputSearchBar));

        type(inputSearchBar, ib);
    }

    public void setButtonAddEmployee() {
        click(buttonAddEmployee);
    }

    public void setButtonDetail() {
        click(buttonDetailEmployee);
    }

    //NOTIFICATION
    public boolean verifyErrorToastDisplayed() {
        Assert.assertTrue(
                waitForVisibility(failedMessage).isDisplayed(),
                "Error toast is not displayed"
        );
        return false;
    }
    public void verifySuccessToastDisplayed() {
        Assert.assertTrue(
                waitForVisibility(successMessage).isDisplayed(),
                "Success toast is not displayed"
        );
    }




    //FORM TAMBAH EMPLOYEE
    public void setInputNameEmployee(String nameEmployee) {
        type(inputNameEmployee, nameEmployee);
    }

    public void setInputEmployeeId(String employeeId) {
        type(inputEmployeeId, employeeId);
    }

    public void setInputEmail(String email) {
        type(inputEmail, email);
    }

    public void setInputPhoneNumber(String phoneNumber) {
        type(inputPhoneNumber, phoneNumber);
    }

    public void setClickDivision() {
        click(clickDivision);
    }

    public void setSelectDivision() {
        click(selectDivision);
    }

    public void setInputEmployeeRole(String employeeRole) {
        type(inputEmployeeRole, employeeRole);
    }

    public void clickSelectAngkatan() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clickAngkatan)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectAngkatan)).click();

    }

    public void clickGenderMale() { click(clickGenderMale); }

    public void clickGenderFemale() { click(clickGenderFemale); }

    public void inputBirthDate (String bd) { type(inputBirthDate, bd); }

    public void inputAddress(String ad) { type(inputAddress, ad); }

    public void inputNIK(String nik) { type(inputNIK, nik);}

    public void setInputNPWP(String npwp) { type(inputNPWP, npwp); }

    public void clickSubmitEmployee() {
        click(buttonSubmitEmployee);
    }

    //EDIT FORM EMPLOYEE
    public void clickButtonEditEmployee() {
        click(buttonEditEmployee);
    }

    public void setInputEditNameEmployee(String editEmployeeName) {
        edit(inputEditNameEmployee, editEmployeeName);
    }

    public void setInputEditEmployeeId(String editEmployeeId) {
        edit(inputEditEmployeeId, editEmployeeId);
    }

    public void setInputEditEmail(String editEmail) {
        edit(inputEditEmail, editEmail);
    }

    public void setInputEditPhoneNumber(String editPhoneNumber) {
        edit(inputEditPhoneNumber, editPhoneNumber);
    }

    public void clickEditDivision() {
        click(clickEditDivision);
    }

    public void setSelectEditDivision() {
        click(selectEditDivision);
    }

    public void setInputEditEmployeeRole(String editRole) {
        edit(editEmployeeRole, editRole);
    }

    public void clickEditAngkatan() {
        click(editAngkatan);
    }

    public void setSelectEditAngkatan() {
        click(selectEditAngkatan);
    }

    public void clickEditGenderMale() {
        click(selectEditGenderMale);
    }

    public void clickEditGenderFemale() {
        click(selectEditGenerFemale);
    }

    public void setInputEditBirthDate(String editDate) {
        edit(inputEditBirthDate, editDate);
    }

    public void setInputEditAddress(String editAddress) {
        edit(inputEditAddress, editAddress);
    }

    public void setInputEditNIK(String editNIK) {
        edit(inputEditNIK, editNIK);
    }

    public void setInputEditNPWP(String editNPWP) {
        edit(inputEditNPWP, editNPWP);
    }

    public void clickButtonSaveChanges() {
        click(buttonSaveChanges);
    }


    //DELETE EMPLOYEE
    public void clickButtonDelete() {
        click(buttonDelete);
    }

    public void submitButtonDelete() {
        click(submitDelete);
    }
}
