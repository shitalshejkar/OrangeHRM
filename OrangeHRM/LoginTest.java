package OrangeHRM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class LoginTest   {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shital\\Downloads\\chromedriver-win64 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        AdminUserManagementPage AdminUserMgmt=new AdminUserManagementPage(driver);
        
        AddJobTitlePage addJobTitlepg=new AddJobTitlePage(driver);
        
       LocationsPage locationsPage = new LocationsPage(driver);
        
        QualificationPage qualificationPage=new QualificationPage(driver);
       
        nationalities Nationalities = new nationalities(driver);
        
        configuration Config= new configuration(driver);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage LoginPage = new LoginPage(driver);

        // Step 2: Enter the username
        loginPage.enterUsername("admin");

        // Step 3: Enter the password
        loginPage.enterPassword("admin123");

        // Step 4: Click the "Login" button
        loginPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //ADMIN MODULE
        AdminUserMgmt.clickAdminModuleLink();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdminUserMgmt.clickUserManagementDropdown();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdminUserMgmt.enterUsername("Lisa A");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //AdminUserMgmt.selectUserRole("Admin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdminUserMgmt.enterEmployeeName("3llawi 7abibGalbi");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //AdminUserMgmt.selectStatus();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdminUserMgmt.clickSearch();
        
        //jOB MODULE
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.clikJobTitle();
  
        addJobTitlepg.clickAddJob();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterJobTitle("QA Engineer01");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterJobDescription("A QA engineer creates tests that identify issues with software before a product launch");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // addJobTitlepg.attachJobSpecification("path_to_spec_file.pdf");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//
        addJobTitlepg.enterJobNote("We are looking for a Quality Assurance (QA) engineer who will manage exploratory and automated tests to ensure product quality");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.clickSave1();
        
        //PAY GRADE MODULE
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.PayGrades();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.clickAddPay();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterName("Lisa A");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.SaveBtn();
        
        //EMPLOYMENT STATUS
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.EmploymentStatus();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.AddEmploymentStatus();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterEmpName("Lisa A");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.SaveBttn();
        
        //JOB CATEGORIES
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.JobCategories();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.AddJobCategories();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterEmpName1("Lisa A");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.SaveBttn1();
        
        
        //WORK SHIFT
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.WorkShifts();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.AddWorkShifts();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterShiftName("Morning shift");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterStartWorkingHours("09:00 AM");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.enterEndWorkingHours("6:00 PM");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addJobTitlepg.AddSftBtn();
        
        
        
       //ORGANIZATION
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        locationsPage.clickOrganization();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.enterName("Lisa A");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.enterCity("Mumbai");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //locationsPage.selectCountry();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.clickSearch();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //STRUCTURE
        
        locationsPage.clickStructure();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.EnableInputSwitchTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.AddStructure();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.enterUnitId("Engineering");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.enterName2("QA Enginee225");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        locationsPage.SaveBttn2();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        
        //QUALIFICATIONS
        
        qualificationPage.clickQualificationPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        qualificationPage.AddSkills();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        qualificationPage.enterName3("Manual Testing");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        qualificationPage.enterDescription("QA manually tester");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        qualificationPage.SaveBttn3();
        
        
        //Nationality
        Nationalities.clickNationalities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Nationalities.AddNationality();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Nationalities.enterName("India");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Nationalities.SaveBttn3();
        
        //Configuration
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Config.clickConfigurationDropdown();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Config.selectEmailConfigurationTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Config.saveEmailConfiguration();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Config.selectLocalizationTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Config.saveLocalization();
        
    }
        
  
   
            
               
        
        //driver.quit();
    }

