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

	public class configuration {
	    private WebDriver driver;

	    public configuration(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Locators for the "Configuration" dropdown and "Email Configuration" tab
	    private By configurationDropdown = By.cssSelector("a.oxd-topbar-body-nav-tab-link.--more");
	    private By emailConfigurationTab = By.xpath("//a[text()='Email Configuration']");

	    // Locators for the "Save" button
	    private By saveButtonEmailConfig = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]");

	    // Locators for the "Localization" tab
	    private By localizationTab = By.xpath("//a[text()='Localization']");

	    // Locators for the "Save" button in Localization
	    private By saveButtonLocalization = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button");

	    public void clickConfigurationDropdown() {
	        driver.findElement(configurationDropdown).click();
	    }

	    public void selectEmailConfigurationTab() {
	        driver.findElement(emailConfigurationTab).click();
	    }

	    public void saveEmailConfiguration() {
	        driver.findElement(saveButtonEmailConfig).click();
	    }

	    public void selectLocalizationTab() {
	        driver.findElement(localizationTab).click();
	    }

	    public void saveLocalization() {
	        driver.findElement(saveButtonLocalization).click();
	    }
	}
