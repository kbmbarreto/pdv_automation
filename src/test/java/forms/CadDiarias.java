package forms;

import org.openqa.selenium.winium.WiniumDriver;

public class CadDiarias {
	
	public void clicarSalvar(WiniumDriver driver) {
		driver.findElementById("btnSalvar").click();
	}
	
	public void clicarCancelar(WiniumDriver driver) {
		driver.findElementById("btnCancelar").click();
	}
	
	public void preencherTitulo(WiniumDriver driver) {
		driver.findElementById("txtTitulo").sendKeys("TESTE");
	}
	
	public void preencherValor(WiniumDriver driver) {
		driver.findElementById("txtValor").sendKeys("20");
	}
	
	public void preencherQtdeDias(WiniumDriver driver) {
		driver.findElementById("txtQtdeDias").sendKeys("1");
	}
	
	public void preencherTipoVeiculo(WiniumDriver driver) {
		driver.findElementById("MÉDIO").click();
	}
}