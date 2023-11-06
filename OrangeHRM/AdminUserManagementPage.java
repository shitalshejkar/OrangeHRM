package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminUserManagementPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public AdminUserManagementPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); // 10 seconds timeout
    }

    public void clickAdminModuleLink() {
        //driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
    }

    
    
    public void clickUserManagementDropdown() {
        //driver.findElement(By.id("menu_admin_UserManagement")).click();
    	WebElement userManagementDropdown = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'User Management')]"));
    	userManagementDropdown.click();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement usersOption = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Users']"));

    	// Click the "Users" option
    	usersOption.click();
    
    }

    public void clickUserManagementOption() {
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li/a")).click();
    }

    public void enterUsername(String username) {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(username);
    }
/*
    public void selectUserRole(String role) {
    	WebElement selectUserRole = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'User Management')]"));
    	selectUserRole.click();
    	//selectUserRole.selectByVisibleText("Admin");
    }
*/
    public void enterEmployeeName(String name) {
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys(name);
    }

    /*
    public void selectStatus(String status) {
    	Select selectUserRole = new Select(driver.findElement(By.xpath("//div[(@class='oxd-select-text oxd-select-text--active')]"))); // Replace with the actual element locator
    	selectUserRole.selectByVisibleText(status);
    }
*/
    public WebElement getSearchButton() {
    	return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
    }
    
    public void clickSearch() {
    	getSearchButton().click();
    }
}