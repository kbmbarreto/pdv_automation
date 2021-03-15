package testcases;

import org.junit.Test;
import org.openqa.selenium.winium.WiniumDriver;

import forms.CadDiarias;
import forms.MenuPrincipal;
import forms.MsgAlerta;
import forms.PsqDiarias;
import forms.Submenu;
import pdv_automation.ScreenShot;

public class MenuAdmin {
	
	CadDiarias cadDiarias = new CadDiarias();
	MenuPrincipal menuPrincipal = new MenuPrincipal();
	MsgAlerta msgAlerta = new MsgAlerta();
	PsqDiarias psqDiarias = new PsqDiarias();
	Submenu submenu = new Submenu();
	ScreenShot screenShot = new ScreenShot();
	
	@Test
	public void cadastroDiariaCancelar(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
			submenu.clicarSubmenuCadastroDiaria(driver);
			Thread.sleep(5000);
			psqDiarias.clicarNovo(driver);
			Thread.sleep(5000);
			cadDiarias.clicarCancelar(driver);
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste cadastroDiariaCancelar: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void cadastroDiaria(WiniumDriver driver) {
		try {
			Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
			submenu.clicarSubmenuCadastroDiaria(driver);
			psqDiarias.clicarNovo(driver);
			Thread.sleep(5000);
			cadDiarias.preencherTitulo(driver);
			cadDiarias.preencherValor(driver);
			cadDiarias.preencherQtdeDias(driver);
			cadDiarias.clicarSalvar(driver);
			msgAlerta.clicarOk(driver);
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste cadastroDiaria: " + ex);
			screenShot.screenShot();
		}		
	}
	
	@Test
	public void pesquisarDiaria(WiniumDriver driver) {
		try {
	        Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
			submenu.clicarSubmenuCadastroDiaria(driver);
			psqDiarias.preencherPesquisa(driver);
			psqDiarias.clicarPesquisar(driver);
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste pesquisarDiaria: " + ex);
			screenShot.screenShot();
		}
	}
	
	@Test
	public void excluirDiariaCancelar(WiniumDriver driver) {
		try {
            Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
			submenu.clicarSubmenuCadastroDiaria(driver);
			psqDiarias.preencherPesquisa(driver);
			psqDiarias.clicarPesquisar(driver);
			psqDiarias.selecionarPesquisa(driver);
            driver.findElementByName("Linha 0").click();
            driver.findElementById("btnNao").click();
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste excluirDiariaCancelar: " + ex);
			screenShot.screenShot();
		}
	}
	
	@Test
	public void excluirDiaria(WiniumDriver driver) {
		try {
            Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
			submenu.clicarSubmenuCadastroDiaria(driver);
            driver.findElementByName("txtPesquisa").sendKeys("TESTE");
            driver.findElementByName("btnPesquisar").click();
            driver.findElementByName("Linha 0").click();
            driver.findElementById("btnSim").click();
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste excluirDiaria: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void cadastrarFeriadoCancelar(WiniumDriver driver) {
		try {
            Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
            submenu.clicarSubmenuFeriados(driver);
            driver.findElementById("btnNovo").click();
            driver.findElementByName("txtTitulo").sendKeys("Dia de São Klebinho");
            driver.findElementByName("btnCancelar").click();
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste cadastrarFeriadoCancelar: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void cadastrarFeriado(WiniumDriver driver) {
		try {
            Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
            submenu.clicarSubmenuFeriados(driver);
            driver.findElementById("btnNovo").click();
            driver.findElementByName("txtTitulo").sendKeys("Dia de São Klebinho");
            driver.findElementByName("btnSalvar").click();
            driver.findElementById("btnOk").click();
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste cadastrarFeriado: " + ex);
			screenShot.screenShot();
		}
	}

	@Test
	public void pesquisarFeriado(WiniumDriver driver) {
		try {
            Thread.sleep(10000);
			menuPrincipal.clicarMenuAdmin(driver);
            submenu.clicarSubmenuFeriados(driver);
            driver.findElementByName("txtTitulo").sendKeys("Dia de São Klebinho");
            driver.findElementById("btnPesquisar").click();
            driver.findElementByName("DATA Linha 0").click();
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste pesquisarFeriado: " + ex);
			screenShot.screenShot();
		}
	}
}
