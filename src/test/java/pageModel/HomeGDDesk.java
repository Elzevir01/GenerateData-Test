package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeGDDesk extends pageModel.HomeGD {

	//WebDriver driver = null;

	///// -- 0 Seleccion de idioma --/////
	private By idioma = By.xpath("//span[contains(@title, 'Select Language')]");
	private By español = By.xpath("//span[contains(text(), 'Español')]");
	///// -- CONTRUCTOR --/////
	public HomeGDDesk(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	///// -- METODOS --/////
	public void idiomaES() {	
		findElemento(idioma).click();
		esperarElemento(español);
		findElemento(español).click();
	}
	
	
}