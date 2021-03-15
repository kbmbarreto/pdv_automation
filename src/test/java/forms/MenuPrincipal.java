package forms;

import org.openqa.selenium.winium.WiniumDriver;

public class MenuPrincipal {
	
	public void clicarMenuAdmin(WiniumDriver driver) {
		driver.findElementByName("ADMINISTRAÇÃO").click();
	}
	
	public void clicarMenuCaixa(WiniumDriver driver) {
		driver.findElementByName("CAIXA").click();
	}
	
	public void clicarMenuClientes(WiniumDriver driver) {
		driver.findElementByName("CLIENTES").click();
	}
	
	public void clicarMenuConfig(WiniumDriver driver) {
		driver.findElementByName("CONFIGURAÇÕES").click();
	}
	
	public void clicarMenuPatio(WiniumDriver driver) {
		driver.findElementByName("PÁTIO").click();
	}
	
	public void clicarMenuRelatorios(WiniumDriver driver) {
		driver.findElementByName("RELATÓRIOS").click();
	}
}