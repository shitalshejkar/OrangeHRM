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

	public class nationalities { 
	    private WebDriver driver;
	    private WebDriverWait wait;

	    public nationalities(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickNationalities() {
	    	WebElement Nationalities = driver.findElement(By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(text(), 'Nationalities')]"));
	    	Nationalities.click();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	    }
	    
	    public void AddNationality() {
	        WebElement addnationalities = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
	        addnationalities.click();
	    }
	    	
	    public void enterName(String name) {
	        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
	        nameField.sendKeys("India");
	    }
	    public void SaveBttn3() {
	        WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
	        saveBtn.click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

}
