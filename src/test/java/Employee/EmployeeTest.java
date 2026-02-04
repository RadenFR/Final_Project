package Employee;

import Core.BaseTest;
import Core.DriverManager;
import Pages.DashboardPage;
import Pages.EmployeePage;
import Pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(EmployeeTest.class);

    @Test
    public void TC_EMP_001() {

        test.pass("input data with mandatory fields");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());

        loginPage.loginDefaultUser();

        dashboardPage.clickMenuEmployee();

        employeePage.setButtonAddEmployee();
        employeePage.setInputNameEmployee("Raden Tiga");
        employeePage.setInputEmployeeId("QA01");
        employeePage.setInputEmail("raden@gmail.com");
        employeePage.setInputPhoneNumber("89511214411");
        employeePage.setClickDivision();
        employeePage.setSelectDivision();
        employeePage.setInputEmployeeRole("Member");
        employeePage.clickSubmitEmployee();
        employeePage.verifySuccessToastDisplayed();
    }

//    @Test
//    public void TC_EMP_002() {
//
//        test.info("input data with incorrect email format");
//
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.setButtonAddEmployee();
//        employeePage.setInputNameEmployee("Raden Dyna");
//        employeePage.setInputEmployeeId("QA02");
//        employeePage.setInputEmail("dyna");
//        employeePage.setInputPhoneNumber("89511214412");
//        employeePage.setClickDivision();
//        employeePage.setSelectDivision();
//        employeePage.setInputEmployeeRole("Member");
//        employeePage.clickSubmitEmployee();
//        employeePage.verifySuccessToastDisplayed();
//    }
//
//    @Test
//    public void TC_EMP_003() {
//
//        test.info("input data with the registered email");
//
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.setButtonAddEmployee();
//        employeePage.setInputNameEmployee("Raden Gaia");
//        employeePage.setInputEmployeeId("QA03");
//        employeePage.setInputEmail("gaia@gmail.com");
//        employeePage.setInputPhoneNumber("");
//        employeePage.setClickDivision();
//        employeePage.setSelectDivision();
//        employeePage.setInputEmployeeRole("Member");
//        employeePage.clickSubmitEmployee();
//        Assert.assertTrue(
//                employeePage.verifyErrorToastDisplayed(),
//                "Expected error toast but it was not displayed"
//        );
//    }
//
//    @Test
//    public void TC_EMP_004() {
//
//        test.info("input data with the registered phone number");
//
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.setButtonAddEmployee();
//        employeePage.setInputNameEmployee("Raden Gaia");
//        employeePage.setInputEmployeeId("QA01");
//        employeePage.setInputEmail("gaia@gmail.com");
//        employeePage.setInputPhoneNumber("89511214412");
//        employeePage.setClickDivision();
//        employeePage.setSelectDivision();
//        employeePage.setInputEmployeeRole("Member");
//        employeePage.clickSubmitEmployee();
//        employeePage.verifySuccessToastDisplayed();
//    }
//
//    @Test
//    public void TC_EMP_005() {
//
//        test.info("update data by changing mandatory fields");
//
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.clickSearchBar();
//        employeePage.inputSearchBar("Tiga");
//        employeePage.setButtonDetail();
//        employeePage.clickButtonEditEmployee();
//        employeePage.setInputEditNameEmployee("Raden Tiga Pratama");
//        employeePage.setInputEditEmployeeId("QA-001");
//        employeePage.setInputEditEmail("tiga@dibimbing.id");
//        employeePage.setInputEditPhoneNumber("897665551111");
//        employeePage.clickEditDivision();
//        employeePage.setSelectEditDivision();
//        employeePage.setInputEditEmployeeRole("Staff");
//        employeePage.clickButtonSaveChanges();
//        employeePage.verifySuccessToastDisplayed();
//    }
//
//    @Test
//    public void TC_EMP_006() {
//
//        test.info("update data by changing mandatory fields");
//
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.clickSearchBar();
//        employeePage.inputSearchBar("Dyna");
//        employeePage.setButtonDetail();
//        employeePage.clickButtonEditEmployee();
//        employeePage.setInputEditNameEmployee("Raden Dyna Putri");
//        employeePage.setInputEditEmployeeId("QA-002");
//        employeePage.setInputEditEmail("dyna@dibimbing.id");
//        employeePage.setInputEditPhoneNumber("897665551112");
//        employeePage.clickEditDivision();
//        employeePage.setSelectEditDivision();
//        employeePage.setInputEditEmployeeRole("Staff");
//        employeePage.clickButtonSaveChanges();
//        employeePage.verifySuccessToastDisplayed();
//    }
//
//    @Test
//    public void TC_EMP_007() {
//
//        test.info("update data by changing mandatory fields");
//
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.clickSearchBar();
//        employeePage.inputSearchBar("Gaia");
//        employeePage.setButtonDetail();
//        employeePage.clickButtonEditEmployee();
//        employeePage.setInputEditNameEmployee("Raden Gaia Ramzy");
//        employeePage.setInputEditEmployeeId("QA-003");
//        employeePage.setInputEditEmail("gaia@dibimbing.id");
//        employeePage.setInputEditPhoneNumber("897665551113");
//        employeePage.clickEditDivision();
//        employeePage.setSelectEditDivision();
//        employeePage.setInputEditEmployeeRole("Staff");
//        employeePage.clickButtonSaveChanges();
//        employeePage.verifySuccessToastDisplayed();
//    }
//
//    @Test
//    public void TC_EMP_008(){
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.clickSearchBar();
//        employeePage.inputSearchBar("Tiga");
//        employeePage.setButtonDetail();
//        employeePage.clickButtonDelete();
//        employeePage.submitButtonDelete();
//        employeePage.verifySuccessToastDisplayed();
//    }
//
//    @Test
//    public void TC_EMP_009(){
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.clickSearchBar();
//        employeePage.inputSearchBar("Dyna");
//        employeePage.setButtonDetail();
//        employeePage.clickButtonDelete();
//        employeePage.submitButtonDelete();
//        employeePage.verifySuccessToastDisplayed();
//    }
//
//    @Test
//    public void TC_EMP_010(){
//        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
//        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
//        EmployeePage employeePage = new EmployeePage(DriverManager.getDriver());
//
//        loginPage.loginDefaultUser();
//
//        dashboardPage.clickMenuEmployee();
//
//        employeePage.clickSearchBar();
//        employeePage.inputSearchBar("Gaia");
//        employeePage.setButtonDetail();
//        employeePage.clickButtonDelete();
//        employeePage.submitButtonDelete();
//        employeePage.verifySuccessToastDisplayed();
//    }
}
