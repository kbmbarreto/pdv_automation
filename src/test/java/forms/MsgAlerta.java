package forms;

import org.openqa.selenium.winium.WiniumDriver;

public class MsgAlerta {

	public void clicarOk(WiniumDriver driver) {
		driver.findElementByName("btnOk").click();
	}
}
