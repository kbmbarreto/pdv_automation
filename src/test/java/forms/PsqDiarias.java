package forms;

import org.openqa.selenium.winium.WiniumDriver;

public class PsqDiarias {
	
	public void clicarPesquisar(WiniumDriver driver) {
		driver.findElementById("btnPesquisar").click();
	}
	
	public void clicarNovo(WiniumDriver driver) {
		driver.findElementById("btnNovo").click();
	}
	
	public void preencherPesquisa(WiniumDriver driver) {
		driver.findElementById("txtPesquisa").sendKeys("Teste");
	}
	
	public void selecionarPesquisa(WiniumDriver driver) {
		driver.findElementByName("FERIADO Row 0").click();
	}
	
	public void excluirPesquisa(WiniumDriver driver) {
		driver.findElementByName("Row 0").click();
	}
}