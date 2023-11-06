package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LocationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrganization() {
    	WebElement Organization = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Organization')]"));
    	Organization.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Locations = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Locations']"));
    	Locations.click();
    }
    	
    public void enterName(String name) {
        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
        nameField.sendKeys("Lisa A");
    }

    public void enterCity(String city) {
        WebElement cityField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
        cityField.sendKeys("Mumbai");
    }
/*
    public void selectCountry() {
        //WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
        //countryDropdown.sendKeys("India");
    	String option="Afghanistan";
    	WebElement dropdown = driver.findElement(By.cssSelector("div.oxd-select-text-input"));

        //Click to open the dropdown options
        dropdown.click();
        /*
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //WebElement Option = driver.findElement(By.cssSelector("div.oxd-select-text-input:contains('Afghanistan')"));
        //Option.click();
        Select interestDropdown = new Select(driver.findElement(By.cssSelector("div.oxd-select-text-input"))); // Replace with the actual element locator
        interestDropdown.selectByVisibleText(option);
    }
*/

    public void clickSearch() {
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    
    public void clickStructure() {
    	WebElement Organization = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Organization')]"));
    	Organization.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Structure = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Structure']"));
    	Structure.click();
    }
    
    public void EnableInputSwitchTest() {
    	 WebElement inputSwitch = driver.findElement(By.cssSelector("span.oxd-switch-input"));

         // Click on the input switch to enable it
         inputSwitch.click();
    	
    }
    
    public void AddStructure() {
        WebElement addStructure = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/button"));
        addStructure.click();
    }
    
    public void enterUnitId(String Name) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[1]/div/div[2]/input"));
        NameField.sendKeys("Engineering");
    }
    
    public void enterName2(String Name) {
        WebElement NameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[2]/input"));
        NameField.sendKeys("QA Enginee225");
    }
    public void SaveBttn2() {
        WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[4]/button[2]"));
        saveBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
  
}

