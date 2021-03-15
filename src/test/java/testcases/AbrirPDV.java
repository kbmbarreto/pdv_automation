package testcases;

import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import pdv_automation.ScreenShot;

public class AbrirPDV {

	public WiniumDriver Driver;
	
	public WiniumDriver getDriver() {
		return Driver;
	}

	ScreenShot screenShot = new ScreenShot();
	
	public void setUp() throws Exception {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\PDV\\PDV.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		this.Driver = driver;
	}
	
	@Test
	public void splashScreen() {
		try {
			Thread.sleep(10000, 0);
			Driver.findElementById("pcbBtnOk").click();
			Thread.sleep(10000, 0);
		} catch(Exception ex) {
			System.out.println("Erro no caso de teste splashScreen: " + ex);
			screenShot.screenShot();
		}
	}
	
	@Test
	public void loginValido() {
		try{
			Thread.sleep(10000);
			Driver.findElementById("txtUsuario").sendKeys("suportein");
			Driver.findElementById("txtSenha").sendKeys("sup1n1512");
			Driver.findElementByName("ENTRAR").click();
			Thread.sleep(10000);
		} catch (Exception ex) {
			System.out.println("Erro no caso de teste loginValido: " + ex);
			screenShot.screenShot();
		}
	}
}