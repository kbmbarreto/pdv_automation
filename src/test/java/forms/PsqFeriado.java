package forms;

import org.openqa.selenium.winium.WiniumDriver;

public class PsqFeriado {
	
	public void clicarPesquisar(WiniumDriver driver) {
		driver.findElementByName("btnPesquisar").click();
	}
	
	public void clicarNovo(WiniumDriver driver) {
		driver.findElementByName("btnNovo").click();
	}
	
	public void preencherPesquisa(WiniumDriver driver) {
		driver.findElementByName("txtPesquisa").sendKeys("Dia de São Klebinho");
	}
	
	public void selecionarPesquisa(WiniumDriver driver) {
		driver.findElementByName("FERIADO Row 0").click();
	}
	
	public void excluirPesquisa(WiniumDriver driver) {
		driver.findElementByName("Row 0").click();
	}
}