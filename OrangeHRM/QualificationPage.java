package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QualificationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public QualificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickQualificationPage() {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	//return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.oxd-topbar-body-nav-tab-item:contains('Qualifications')")));
    	//WebElement Skills = driver.findElement(By.cssSelector("span.oxd-topbar-body-nav-tab-item:contains('Qualifications')"));
    	//Skills.click();
    	
    	WebElement qualificationDropdown = driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item'][text()='Qualifications']"));
    	
    	qualificationDropdown.click(); 

        // Select the "Education" tab from the dropdown options
        WebElement educationTab = driver.findElement(By.xpath("//a[@href='#'][text()='Education']"));
        educationTab.click();
    }
    
    public void AddSkills() {
        WebElement addSkills = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
        addSkills.click();
    }
    
    public void enterName3(String Name) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
        NameField.sendKeys("Manual Testing");
    }
    
    public void enterDescription(String Name1) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"));
        NameField.sendKeys("QA manually tester");
    }
    public void SaveBttn3() {
        WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
        saveBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

