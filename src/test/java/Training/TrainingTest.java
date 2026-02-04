package Training;

import Core.BaseTest;
import Core.DriverManager;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.TrainingPage;
import org.apache.poi.ss.formula.functions.T;
import org.testng.annotations.Test;

public class TrainingTest extends BaseTest {

    @Test
    public void TC_TRG_001() {

        test.info("Add New Training");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.clickButtonAddTraining();
        trainingPage.setInputTitleTraining("contoh pelatihan 5");
        trainingPage.setInputDescriptionTraining("Ini descripsi training");
        trainingPage.clickSubmitTraining();
        trainingPage.isSuccessToastDisplayed();
    }

    @Test
    public void TC_TRG_002() {

        test.info("Update Training");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.inputSearchBarTraining("contoh pelatihan 5");
        trainingPage.clickDetailTrainingTop();
        trainingPage.clickButtonUpdateTraining();
        trainingPage.inputTitleUpdate("QA 5");
        trainingPage.inputDescriptionUpdate("Pelatihan Quality Assurance");
        trainingPage.clickSubmitUpdate();
        trainingPage.isSuccessToastDisplayed();

    }


    @Test
    public void TC_TRG_003() {

        test.info("Create Chapter");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.inputSearchBarTraining("QA 5");
        trainingPage.clickDetailTrainingTop();
        trainingPage.clickIconAddChapter();
        trainingPage.inputChapterName("SDLC");
        trainingPage.inputChapterDescription("Materi SDLC");
        trainingPage.clickSubmitButtonAddChapter();
        trainingPage.isSuccessToastDisplayed();
    }

    @Test
    public void TC_TRG_004() {

        test.info("Update Chapter");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.inputSearchBarTraining("QA 5");
        trainingPage.clickDetailTrainingTop();
        trainingPage.clickFirstChapter();
        trainingPage.clickUpdateCaphapter();
        trainingPage.inputUpdateTitleChapter("Introduction SDLC");
        trainingPage.inputDescriptionUpdate("Materi Awal SDLC");
        trainingPage.clickSubmitUpdateChapter();
        trainingPage.isSuccessToastDisplayed();
    }

    @Test
    public void TC_TRG_005() {

        test.info("Create Content");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.inputSearchBarTraining("QA 5");
        trainingPage.clickDetailTrainingTop();
        trainingPage.clickFirstChapter();
        trainingPage.clickButtonAddContent();
        trainingPage.setInputTitleContent("test content");
        trainingPage.setInputDescriptionContent("Tester");
        trainingPage.setUploadMedia();
        trainingPage.clickMedia1();
        trainingPage.clickChooseMedia();
        trainingPage.setInputEstimated("4");
        trainingPage.clickSubmitContent();
        trainingPage.isSuccessToastDisplayed();
    }

    @Test
    public void TC_TRG_006() {

        test.info("Update Content");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.inputSearchBarTraining("QA 5");
        trainingPage.clickDetailTrainingTop();
        trainingPage.clickFirstChapter();
        trainingPage.clickDetailContent();
        trainingPage.clickUpdateContent();
        trainingPage.clickUpdateMedia();
        trainingPage.clickMedia2();
        trainingPage.clickChooseMedia();
        trainingPage.clickSaveChangesContent();
    }

    @Test
    public void TC_TRG_007() {

        test.info("Delete Content");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.inputSearchBarTraining("QA 5");
        trainingPage.clickDetailTrainingTop();
        trainingPage.clickFirstChapter();
        trainingPage.clickDetailContent();
        trainingPage.clickUpdateContent();
        trainingPage.clickDeleteContent();
        trainingPage.clickSubmitDeleteContent();
        trainingPage.isSuccessToastDisplayed();
    }

    @Test
    public void TC_TRG_008() {

        test.info("Assign Employee");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        TrainingPage trainingPage = new TrainingPage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuTraining();

        trainingPage.inputSearchBarTraining("QA 5");
        trainingPage.clickDetailTrainingTop();
        trainingPage.clickTabAssignedEmployee();
        trainingPage.clickAssignEmployee();
        trainingPage.searchAssignEmployee("Tiga");
        trainingPage.clickAddEmployeeByName1("Raden Tiga");
        trainingPage.inputDeadlineDate("02022026");
        trainingPage.clickAssignEmployee();
        trainingPage.isSuccessToastDisplayed();
    }
}