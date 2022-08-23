package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeGDMobil extends pageModel.HomeGD {
	///// -- 0 Seleccion de idioma --/////
	private By botonMenuMobil = By.xpath("//button[@aria-controls= 'nav-menu']");
	private By idiomaMobil = By.xpath("//li[text()= 'Select Language']");
	private By español = By.xpath("//span[contains(text(), 'Español')]");
	private By quitMenu = By.xpath("//div[@id='nav-menu']");
	
///// -- CONTRUCTOR --/////
	public HomeGDMobil(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void idiomaES() {
		esperarElemento(botonMenuMobil);
		findElemento(botonMenuMobil).click();
		esperarElemento(idiomaMobil);
		findElemento(idiomaMobil).click();
		esperarElemento(español);
		findElemento(español).click();
		findElemento(quitMenu).click();
	}
}