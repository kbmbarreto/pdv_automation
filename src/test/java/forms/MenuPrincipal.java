package forms;

import org.openqa.selenium.winium.WiniumDriver;

public class MenuPrincipal {
	
	public void clicarMenuAdmin(WiniumDriver driver) {
		driver.findElementByName("ADMINISTRA��O").click();
	}
	
	public void clicarMenuCaixa(WiniumDriver driver) {
		driver.findElementByName("CAIXA").click();
	}
	
	public void clicarMenuClientes(WiniumDriver driver) {
		driver.findElementByName("CLIENTES").click();
	}
	
	public void clicarMenuConfig(WiniumDriver driver) {
		driver.findElementByName("CONFIGURA��ES").click();
	}
	
	public void clicarMenuPatio(WiniumDriver driver) {
		driver.findElementByName("P�TIO").click();
	}
	
	public void clicarMenuRelatorios(WiniumDriver driver) {
		driver.findElementByName("RELAT�RIOS").click();
	}
}