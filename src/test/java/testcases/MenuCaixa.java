package testcases;

import org.junit.Test;
import org.openqa.selenium.winium.WiniumDriver;

import forms.MenuPrincipal;
import forms.Submenu;
import pdv_automation.ScreenShot;

public class MenuCaixa {

	AbrirPDV abrirPDV = new AbrirPDV();
	MenuPrincipal menuPrincipal = new MenuPrincipal();
	Submenu submenu = new Submenu();
	ScreenShot screenShot = new ScreenShot();

	@Test
	public void abrirCaixaSemFundos(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuAberturaFechamentoCaixa(driver);
			driver.findElementByName("OK").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste abrirCaixaSemFundos: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void fecharCaixaCancelar(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuAberturaFechamentoCaixa(driver);
			driver.findElementByName("CANCELAR").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste fecharCaixaCancelar: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void fecharCaixaManual(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuAberturaFechamentoCaixa(driver);
			driver.findElementByName("OK").click();
			Thread.sleep(5000);
			driver.findElementById("btnOk").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste fecharCaixaManual: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void abrirCaixaFundoNegativo(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuAberturaFechamentoCaixa(driver);
			driver.findElementByName("0,00").sendKeys("-20");
			driver.findElementByName("OK").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste abrirCaixaFundoNegativo: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void abrirCaixaFundoPositivo(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuAberturaFechamentoCaixa(driver);
			driver.findElementById("txtFundo").sendKeys("20");
			driver.findElementByName("OK").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste abrirCaixaFundoPositivo: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void validarMovimento(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuMovimento(driver);
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste validarMonitorDeServico: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void validarMobileConect(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuMobileConnect(driver);
			driver.findElementById("txtPortaMobile").sendKeys("123456");
			driver.findElementByName("ATIVAR MOBILE").click();
			driver.findElementByName("OK").click();
			Thread.sleep(5000);
			driver.findElementByName("OK").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste validarMobileConect: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void validarRPS(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuRPS(driver);
			driver.findElementById("txtPesquisa").sendKeys("DEV-QA-KLEBER");
			driver.findElementById("radBtnPesquisar").click();
			Thread.sleep(5000);
			driver.findElementByName("Row 0").click();
			Thread.sleep(5000);
			driver.findElementByName("DESCRIÇÃO Row 0").click();
			// driver.findElementById("btnSalvar").click();
			// driver.findElementById("btnOk").click();
			// driver.findElementById("btnCancelar").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste validarRPS: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void validarSangria(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuCaixa(driver);
			submenu.clicarSubmenuSangria(driver);
			driver.findElementById("btnConfirma").click();
			driver.findElementById("txtUsuario").sendKeys("ENCARREGADO");
			driver.findElementById("txtSenha").sendKeys("ENCARREGADO");
			driver.findElementById("btnConfirma").click();
			Thread.sleep(5000);
			driver.findElementById("btnOk").click();
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste validarSangria: " + ex);
			screenShot.screenShot();
		}
	}

}