package driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BrowserFactory {
	DesiredCapabilities desiredCapability;
	AppiumDriver adriver;
	WebDriver driver;
	//String nodeURL = "";
	
	
	public BrowserFactory() {

	}
	public BrowserFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	private static DriverFactory instance = new DriverFactory();

	public static DriverFactory getInstance() {
		return instance;
	}

	public WebDriver setDriver(String browser, String nodeURL) throws MalformedURLException {
		System.getProperty("java.classpath");
		new DesiredCapabilities();

		switch (browser.toString().toUpperCase()) {
		case "CHROME":
			ChromeOptions capc = new ChromeOptions();
			driver = new RemoteWebDriver(new URL(nodeURL), capc);
			break;
		case "FIREFOX":
			FirefoxOptions capf = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL(nodeURL), capf);
			break;
		case "EDGE":
			EdgeOptions cape = new EdgeOptions();
			driver = new RemoteWebDriver(new URL(nodeURL), cape);
			break;
		case "ANCHROME":
			try {
				UiAutomator2Options options = new UiAutomator2Options()
						
						.setPlatformName("Android")
						.setDeviceName("SM-J71MN")
						//.setChromedriverDisableBuildCheck(true)
						//.setChromedriverUseSystemExecutable(true)
						//.setApp("com.android.chrome")
						.setAutomationName("UiAutomator2")
						.setAppPackage("com.android.chrome")
						.setNewCommandTimeout(Duration.ofSeconds(60))
						.setAdbExecTimeout(Duration.ofSeconds(60))
						.setUnlockKey("1526")
						.setAppActivity("com.google.android.apps.chrome.Main")
						.setUdid("52032936c0e08321")
						.setPlatformVersion("8.1.0");
						
				driver = new AppiumDriver(new URL(nodeURL),options);
				

			} catch (Exception exp) {
				System.out.println("Cause is : " + exp.getCause());
				System.out.println("Message is : " + exp.getMessage());
				exp.printStackTrace();
			}
				break;
			default:
				break;
		}
		if((browser)!="ANCHROME"){
		driver.manage().window().maximize();
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		}
		return driver;

	}
	public AppiumDriver ad() {
		return adriver;
	}
	public void removeDriver() {
		driver.close();
		driver.quit();

	}

}
