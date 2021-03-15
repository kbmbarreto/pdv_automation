package forms;

import org.openqa.selenium.winium.WiniumDriver;

public class CadFeriado {
	
	public void clicarSalvar(WiniumDriver driver) {
		driver.findElementByName("btnSalvar").click();
	}
	
	public void clicarCancelar(WiniumDriver driver) {
		driver.findElementByName("btnCancelar").click();
	}
	
	public void preencherFeriado(WiniumDriver driver) {
		driver.findElementById("txtTitulo").sendKeys("Dia de s�o Klebinho");
	}
	
	public void preencherData(WiniumDriver driver) {
		driver.findElementByName("dtFeriado").sendKeys("08");
	}
}
