package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeGD extends pageModel.Base {
	public HomeGD(WebDriver driver) {
		super(driver);
	}

	WebDriver driver = null;

	///// -- 0 Seleccion de idioma --/////
	private By idioma = By.xpath("//span[contains(@title, 'Select Language')]");
	private By español = By.xpath("//span[contains(text(), 'Español')]");

	///// -- 1 Elija los tipos de datos que desee--/////
	private By nombre = By.xpath("//div[contains(text(), 'Nombre')]");
	private By telefono = By.xpath("//div[contains(text(), 'Teléfono')]");
	private By email = By.xpath("//div[contains(text(), 'Email')]");
	private By direccion = By.xpath("//div[contains(text(), 'Dirección')]");
	private By postal = By.xpath("//div[contains(text(), 'Postal')]");
	private By region = By.xpath("//div[contains(text(), 'Región')]");
	private By pais = By.xpath("//div[contains(text(), 'País')]");
	private By lista = By.xpath("//div[contains(text(), 'Lista')]");
	private By palabra = By.xpath("//div[contains(text(), 'Palabra')]");
	private By numero = By.xpath("//div[contains(text(), 'Número')]");
	private By moneda = By.xpath("//div[contains(text(), 'Moneda')]");
	private By alfanumerica = By.xpath("//div[contains(text(), 'Alfanumérica')]");

	///// -- 2 Elija un formato de datos--/////
	private By sql = By.xpath("//div[contains(text(), 'SQL')]");

	///// -- 3 Generar --/////
	private By btnGenerar = By.xpath("//div[@class='Homepage__button--xs_']");

	

	

	public void idiomaES() {
		findElemento(idioma).click();
		esperarElemento(español);
		findElemento(español).click();
	}

	public void clickTodosDatos(int i) {

	switch (i) {
		case 1:
			findElemento(nombre).click();
			break;
		case 2:
			findElemento(telefono).click();
			break;
		case 3:
			findElemento(email).click();
			break;
		case 4:
			findElemento(direccion).click();
			break;
		case 5:
			findElemento(postal).click();
			break;
		case 6:
			findElemento(region).click();
			break;
		case 7:
			findElemento(pais).click();
			break;
		case 8:
			findElemento(lista).click();
			break;
		case 9:
			findElemento(palabra).click();
			break;
		case 10:
			findElemento(numero).click();
			break;
		case 11:
			findElemento(moneda).click();
			break;
		case 12:
			findElemento(alfanumerica).click();
			break;
		default:
			findElemento(nombre).click();
		}
	}

	public void clickDato(By dato) {
		findElemento(dato).click();
	}

	public void clickTelefono() {
		findElemento(telefono).click();
	}

	public void clickEmail() {
		findElemento(email).click();
	}

	public void clickDireccion() {
		findElemento(direccion).click();
	}

	public void clickPostal() {
		findElemento(postal).click();
	}

	public void clickRegion() {
		findElemento(region).click();
	}

	public void clickPais() {
		findElemento(pais).click();
	}

	public void clickLista() {
		findElemento(lista).click();
	}

	public void clickPalabra() {
		findElemento(palabra).click();
	}

	public void clickNumero() {
		findElemento(numero).click();
	}

	public void clickMoneda() {
		findElemento(moneda).click();
	}

	public void clickAlfanumerica() {
		findElemento(alfanumerica).click();
	}

	public void clickGenerar() {
		esperarElemento(btnGenerar);
		findElemento(btnGenerar).click();
	}
	
	public void clickSql() {
		findElemento(sql).click();
	}

}