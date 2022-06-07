package com.generatedata;

import org.testng.annotations.Test;

import driver.BrowserFactory;
import driver.DriverFactory;
import pageModel.HomeGD;
import pageModel.GeneratorGD;

import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class generatedataTest {

	WebDriver driver;
	String URL = "https://generatedata.com/";
	DriverFactory df = null;
	BrowserFactory bf = null;
	HomeGD hg = null;
	GeneratorGD gg = null;
	int numero;
	int[] botones;

	@Test
	public void datatest() throws InterruptedException {
		hg = new HomeGD(driver);
		hg.navegar(URL);
		hg.esperarWeb();
		hg.idiomaES();
		hg.esperarWeb();
		hg.clickAceptarCookies();
		Thread.sleep(2000);

		botones = new int[3];

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				numero = numeroRandom(1, 12);
			} else if (i == 1) {
				numero = numeroRandom(1, 12);
				while (botones[0] == numero) {
					numero = numeroRandom(1, 12);
				}
			} else if (i == 2) {
				numero = numeroRandom(1, 12);
				while (numero == botones[0] || numero == botones[1]) {
					numero = numeroRandom(1, 12);
				}
			}
			botones[i] = numero;
			System.out.println(botones[i]);
			hg.clickTodosDatos(botones[i]);
		}
		hg.clickSql();
		
		Thread.sleep(2000);
		
		hg.clickGenerar();
		hg.esperarWeb();
		
		Thread.sleep(4000);
		gg = new GeneratorGD(driver);
		
		
		gg.clickPreview();
		gg.clickbtnGenerate();
		gg.clickDescargar();
		Thread.sleep(4000);
	}

	@BeforeClass
	public void beforeClass() {
	}

	@BeforeTest
	@Parameters({ "browser", "nodeUrl" })
	public void beforeTest(String browser, String nodeUrl) {
		try {
			bf = new BrowserFactory();
			DriverFactory.getInstance().setDriver(bf.setDriver(browser, nodeUrl));
			driver = DriverFactory.getInstance().getDriver();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		bf.removeDriver();
	}

	public int numeroRandom(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
