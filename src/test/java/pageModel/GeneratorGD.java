package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneratorGD extends pageModel.Base{
	public GeneratorGD(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver = null;
	
	private By txtName = By.xpath("//input[contains(@value, 'name')]");
	private By txtPhone = By.xpath("//input[contains(@value, 'phone')]");
	private By txtEmail = By.xpath("//input[contains(@value, 'email')]");
	private By txtAddress = By.xpath("//input[contains(@value, 'address')]");
	private By txtPostalZip = By.xpath("//input[contains(@value, 'postalZip')]");
	private By txtRegion = By.xpath("//input[contains(@value, 'region')]");
	private By txtCountry = By.xpath("//input[contains(@value, 'country')]");
	private By txtList = By.xpath("//input[contains(@value, 'list')]");
	private By txtAlphanumeric = By.xpath("//input[contains(@value, 'alphanumeric')]");
	private By txtMoneda = By.xpath("//input[contains(@value, 'currency')]");
	private By txtNumberrange = By.xpath("//input[contains(@value, 'numberrange')]");
	private By txtText = By.xpath("//input[contains(@value, 'text')]");

}
