package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddJobTitlePage {
    private WebDriver driver;

    public AddJobTitlePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clikJobTitle() {
    	WebElement Job = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Job ')]"));
    	Job.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement JobTitles = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Job Titles']"));
    	JobTitles.click();

        	
        		
       // jobTitle.click();
    }
    
    public void clickAddJob() {
        WebElement addJobButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
        addJobButton.click();
    }

    public void enterJobTitle(String title) {
        WebElement titleField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
        titleField.sendKeys("QA Engineer01");
    }

    public void enterJobDescription(String description) {
        WebElement descriptionField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"));
        descriptionField.sendKeys("A QA engineer creates tests that identify issues with software before a product launch");
    }

   /* public void attachJobSpecification(String filePath) {
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[1]"));
        fileInput.sendKeys(filePath);
    }*/

    public void enterJobNote(String note) {
        WebElement noteField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea"));
        noteField.sendKeys("We are looking for a Quality Assurance (QA) engineer who will manage exploratory and automated tests to ensure product quality");
    }

    public void clickSave1() {
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]"));
        saveButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    
    
    public void PayGrades() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Job = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Job ')]"));
    	Job.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement JobTitles = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Pay Grades']"));
    	JobTitles.click();	
        		
       // jobTitle.click();
    }
    
    public void clickAddPay() {
        WebElement addPay = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
        addPay.click();
    }
    public void enterName(String Name) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
        NameField.sendKeys("Lisa A");
    }
    
    public void SaveBtn() {
        WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        saveBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    public void EmploymentStatus() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Job = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Job')]"));
    	Job.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement JobTitles = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Employment Status']"));
    	JobTitles.click();	
        		
       // jobTitle.click();
    }
    
    public void AddEmploymentStatus() {
        WebElement addEmploymentStatus = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
        addEmploymentStatus.click();
    }
    public void enterEmpName(String Name) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
        NameField.sendKeys("Lisa A");
    }
    
    public void SaveBttn() {
        WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        saveBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
 
    public void JobCategories() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Job = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Job')]"));
    	Job.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement JobTitles = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Job Categories']"));
    	JobTitles.click();	
        		
       // jobTitle.click();
    }
    
    public void AddJobCategories() {
        WebElement addJobCategories = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
        addJobCategories.click();
    }
    public void enterEmpName1(String Name) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
        NameField.sendKeys("Lisa A");
    }
    
    public void SaveBttn1() {
        WebElement SaveBttn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        SaveBttn1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    public void WorkShifts() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Job = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Job')]"));
    	Job.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement JobTitles = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Work Shifts']"));
    	JobTitles.click();	
        		
       // jobTitle.click();
    }
    
    public void AddWorkShifts() {
        WebElement addWorkShifts = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
        addWorkShifts.click();
    }
    
    public void enterShiftName(String Name) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
        NameField.sendKeys("Morning Shift");
    }
    
    public void enterStartWorkingHours (String Number) {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement workShiftPage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
        workShiftPage.sendKeys("9:00 AM");
    }
    public void enterEndWorkingHours (String Number) {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement workShiftPage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input"));
        workShiftPage.sendKeys("6:00 PM");
    }
    
    
    
    public void AddSftBtn() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement SaveBttn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]"));
        SaveBttn1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
        
    
}

