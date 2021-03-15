package pdv_automation;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ScreenShot {
	
	public void screenShot() {
		try {
			Robot robot = new Robot();
			Integer i =1;
			
			BufferedImage bi = robot.createScreenCapture(new Rectangle(1366,768));
			ImageIO.write(bi, "jpg", new File("C:\\Users\\Admin\\Desktop\\screenShot"+ i +".jpg"));
			i++;
		} catch(Exception ex) {
			System.out.println("Erro na criação do snapshot: " + ex);
		}
	}
}