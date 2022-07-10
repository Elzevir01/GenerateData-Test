package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class GeneratorGD extends pageModel.Base{
	
	//WebDriver driver = null;
	//------PREVIEW------//
	private By preview = By.xpath("//span[contains(text(), 'Avance')]");
	
	//-------NOMBRE------//
	private By btnNombresOcci = By.xpath("//span[contains(@title, 'Nombres occidentales')]");
	private By btnNomRegionales = By.xpath("//span[contains(text(), 'regionales')]");
	private By btnNomSeleccione = By.xpath("//div[contains(text(), 'Seleccione')]");
	private By btnNomChile = By.xpath("//*[contains(text(), 'Chile')]");
	private By btnNomCerrar = By.xpath("//span[contains(text(), 'Cerrar')]");
	//-------GENERATE------//
	private By btnGenerate = By.xpath("//span[contains(text(), 'Generar')]");
	private By cancelar = By.xpath("//span[contains(text(), 'cancelar')]");
	//repetido usar localizador relativo
	private By generar = By.xpath("//span[contains(text(), 'Generar')]");
	//------CONFIRMACION Y DESCARGA------//
	private By confirmacion = By.xpath("//div[contains(text(), 'Datos generados.')]");
	private By descargar = By.xpath("//span[contains(text(), 'Descargar')]");
	
	
	/////-- CONSTRUCTOR --/////
	public GeneratorGD(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/////-- METODOS --/////
	public void exNombres() {
		findElemento(btnNombresOcci).click();
		esperarElemento(btnNomRegionales);
		findElemento(btnNomRegionales).click();
		esperarElemento(btnNomSeleccione);
		findElemento(btnNomSeleccione).click();
		findElemento(btnNomChile).click();
		findElemento(btnNomCerrar).click();
	}
	public void clickbtnGenerate() {
		findElemento(btnGenerate).click();
		esperarElemento(cancelar);
		findElemento(with(generar).toRightOf(cancelar)).click();;
	}
	public void clickPreview() {
		esperarElemento(preview);
		findElemento(preview).click();
	}
	public void clickDescargar() {
		esperarElemento(confirmacion);
		findElemento(descargar).click();
	}
	
}
