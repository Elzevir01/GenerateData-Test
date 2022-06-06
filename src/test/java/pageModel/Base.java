package pageModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	WebDriver driver;
	WebElement elemento;

	String expectedTitle = "";

	///// CONSTRUCTOR/////
	public Base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	//// METODOS/////
	
	public WebElement findElemento(By elemento) {
		return driver.findElement(elemento);
	}
	

	public void sendKey(WebDriver driver, WebElement elemento, String texto) {
		elemento.sendKeys(texto);
	}

	public void cursorTo(By elemento) {
		new Actions(driver).moveToElement(findElemento(elemento)).perform();
	}

	public boolean checkElement(WebElement elemento) {
		try {
			if (elemento.isDisplayed()) {
				System.out.println("Elemento: [ " + elemento.getText() + " ] Existe");
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Elemento: [ " + elemento.getText() + " ]X NO Existe");
			return false;
		}
	}

	public void navegar(String url) {
		driver.get(url);
	}

	public String titulo(WebDriver driver) {
		return driver.getTitle();
	}

	
	public void clearText(WebElement elemento) {
		elemento.clear();
	}
	public void esperarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));	
	}
	public void esperarWeb() {
	}
	public void confirmarTitulo(String titulo) {
		ExpectedConditions.titleIs(titulo);
	}
	/*
	 * if (!driver.getTitle().equals("Home Page of logged in user")) {
      throw new IllegalStateException("This is not Home Page of logged in user," +
            " current page is: " + driver.getCurrentUrl());
    }
	 */
	 
}
