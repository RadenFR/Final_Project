package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TrainingPage extends BasePage {
    public TrainingPage(WebDriver driver) {
        super(driver);
    }

    //HALAMAN AWAL TRAINING
    By searchbarTraining = By.id("search-training-input");
    By buttonAddTraining = By.id("add-training-button");
    By successMessage = By.xpath("//*[contains(text(),'Success') or contains(text(),'Berhasil')]");


    //HALAMAN TAB ASSIGNED EMPLOYEE
    By buttonAddAssignEmployee = By.id("assign-employee-button");
    By searchAssignedEmployee = By.xpath("//input[@placeholder='Search name, ID...']");
    By addEmployeeBtn = By.xpath("//td[text()='Raden Tiga']/following-sibling::td//button");
    By startDateInput = By.xpath(
            "//p[normalize-space()='Start Date']/following-sibling::input[@type='date']"
    );
    By deadlineDateInput = By.xpath(
            "//p[normalize-space()='Deadline Date']/following-sibling::input[@type='date']"
    );
    By btnAssignEmployee = By.xpath(
            "//button[normalize-space()='Assign Employee']"
    );


    //FORM TAMBAH TRAINING
    By inputTitle = By.id("title");
    By inputDescription = By.id("description");
    By submitAddTraining = By.id("add-training-submit-button");

    //HALAMAN DETAIL TRAINING
    By buttonUpdateTraining = By.id("update-training-button");
    By tabContentChapter = By.id("tabs-training-detail--tab-0");
    By tabAssignedEmployee = By.id("tabs-training-detail--tab-1");
    By iconButtonAddChapter = By.id("add-chapter-icon-button");
    By buttonAddContent = By.id("add-content-button--Infinity");
    By buttonEditChapter = By.id("update-chapter-button-1");


    //FORM UPDATE TRAINING
    By inputEditTitle = By.id("title");
    By inputEditDescription = By.id("description");
    By buttonConfirmUpdate = By.id("update-training-submit-button");

    //FORM CHAPTER
    By inputChapterName = By.id("title");
    By inputChapterDescription = By.id("description");
    By buttonAddChapter = By.id("add-chapter-submit-button");
    By updateChapter = By.id("update-chapter-button-1");
    By updateTitleChapter = By.id("title");
    By updateDescriptionChapter = By.id("description");
    By submitUpdateChapter = By.id("update-chapter-submit-button-1");

    //FORM CONTENT
    By inputTitleContent = By.id("input-title--Infinity");
    By contentDescriptionEditor = By.xpath(
            "//div[@contenteditable='true' and contains(@class,'ck-editor__editable')]"
    );
    By buttonAddMedia = By.id("button-upload-media");
    By selectMedia1 = By.xpath("//*[text()='Intro QA']");
    By selectMedia2 = By.xpath("//*[text()='Video']");
    By buttonChooseMedia = By.xpath("//button[normalize-space()='Choose Media']");
    By inputEstimated = By.id("input-estimated-video-duration--Infinity");
    By buttonSubmitContent = By.id("submit-button--Infinity");


    //NOTIFICATION
    public boolean isSuccessToastDisplayed() {
        try {
            return waitForVisibility(successMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    //HALAMAN TRAINING
    public void inputSearchBarTraining(String training) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchbarTraining));

        click(searchbarTraining);
        type(searchbarTraining, training);
    }

    public void clickButtonAddTraining() {
        click(buttonAddTraining);
    }

    public void clickDetailTrainingTop() {
        By topDetailButton = By.xpath(
                "(//button[contains(@id,'button-detail-training')])[1]"
        );
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(topDetailButton)).click();
    }



    //HALAMAN DETAIL
    public void clickIconAddChapter() {
        click(iconButtonAddChapter);
    }

    public void clickTabAssignedEmployee() {
        click(tabAssignedEmployee);
    }

    public void clickAddAssign() { click(buttonAddAssignEmployee);}

    public void searchAssignEmployee(String ae) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchAssignedEmployee));

        WebElement searchField = driver.findElement(searchAssignedEmployee);
        searchField.clear();
        searchField.sendKeys(ae);
    }


    public void clickAddEmployeeByName1(String employeeName1) {
        By btnPlus = By.xpath(
                "//td[normalize-space(text())='" + employeeName1 + "']" +
                        "/following-sibling::td//button[@type='button']"
        );
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnPlus)).click();
    }


    public void clickAddEmployeeByName2(String employeeName2) {
        By btnPlus = By.xpath(
                "//td[normalize-space()='" + employeeName2 + "']" +
                        "/following-sibling::td//button"
        );
        wait.until(ExpectedConditions.elementToBeClickable(btnPlus)).click();
    }

    public void inputStartDate(String date) {
        By startDate = By.xpath(
                "//p[normalize-space()='Start Date']/following-sibling::input[@type='date']"
        );
        wait.until(ExpectedConditions.elementToBeClickable(startDate)).sendKeys(date);
    }

    public void inputDeadlineDate(String date) {
        By deadlineDate = By.xpath(
                "//p[normalize-space()='Deadline Date']/following-sibling::input[@type='date']"
        );
        wait.until(ExpectedConditions.elementToBeClickable(deadlineDate)).sendKeys(date);
    }

    public void clickAssignEmployee() {
        By btnAssignEmployee = By.xpath(
                "//button[normalize-space()='Assign Employee']"
        );
        wait.until(ExpectedConditions.elementToBeClickable(btnAssignEmployee)).click();
    }


    //FORM TRAINING
    public void setInputTitleTraining(String nameTraining) {
        type(inputTitle, nameTraining);
    }

    public void setInputDescriptionTraining(String descriptionTraining) {
        type(inputDescription, descriptionTraining);
    }

    public void clickSubmitTraining() {
        click(submitAddTraining);
    }

    public void clickButtonUpdateTraining() {
        click(buttonUpdateTraining);
    }

    //FORM UPDATE TRAINING
    public void inputTitleUpdate(String updateTitle) {
        edit(inputEditTitle, updateTitle);
    }

    public void inputDescriptionUpdate(String updateDescription) {
        edit(inputEditDescription, updateDescription);
    }

    public void clickSubmitUpdate() {
        click(buttonConfirmUpdate);
    }

    //FORM CHAPTER
    public void inputChapterName(String chapterName) {
        type(inputChapterName, chapterName);
    }

    public void inputChapterDescription(String descriptionChapter) {
        type(inputChapterDescription, descriptionChapter);
    }

    public void clickFirstChapter() {
        By firstChapter = By.xpath("(//div[contains(@id,'chapter-item')])[1]");
        wait.until(ExpectedConditions.elementToBeClickable(firstChapter)).click();
    }

    public void clickSubmitButtonAddChapter() {
        click(buttonAddChapter);
    }

    public void clickUpdateCaphapter() { click(updateChapter); }

    public void inputUpdateTitleChapter(String utc) {
        type(updateTitleChapter, utc);
    }

    public void inputUpdateDescriptionChapter(String udc) {
        type(updateDescriptionChapter, udc);
    }

    public void clickSubmitUpdateChapter() { click(submitUpdateChapter); }

    //FORM CONTENT
    public void clickButtonAddContent() {
        click(buttonAddContent);
    }

    public void setInputTitleContent(String tc) {
        type(inputTitleContent, tc);
    }

    public void setInputDescriptionContent(String dc) {
        type(contentDescriptionEditor, dc);
    }

    public void setUploadMedia() { click(buttonAddMedia); }

    public void clickMedia1() { click(selectMedia1); }

    public void clickMedia2() { click(selectMedia2); }

    public void clickChooseMedia() {click(buttonChooseMedia);}

    public void setInputEstimated(String estimated) {
        type(inputEstimated, String.valueOf(estimated));
    }

    public void clickSubmitContent() {click(buttonSubmitContent);}

    public void clickDetailContent() {
        By detailButton = By.xpath(
                "//button[normalize-space()='Detail']"
        );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(detailButton)).click();
    }

    public void clickUpdateContent() {
        By updateContent = By.id("button-update-content");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(updateContent)).click();
    }

    public void clickDeleteContent() {
        By buttonDelete = By.xpath(
                "//button[normalize-space()='Delete']"
        );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(buttonDelete)).click();
    }

    public void clickSubmitDeleteContent() {
        By buttonSubmitDelete = By.xpath(
                "//button[normalize-space()='Delete']"
        );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(buttonSubmitDelete)).click();
    }

    public void clickUpdateMedia() {
        By updateMedia = By.id("button-edit-media");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(updateMedia)).click();
    }

    public void clickSaveChangesContent() {
        By saveChangesContent = By.id("modal-update-content-save-button");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveChangesContent)).click();
    }





}
