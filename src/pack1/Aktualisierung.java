package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Aktualisierung {

	Timer time;
	
	public Aktualisierung()
	{
		time = new Timer();
		time.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				Gui.screenWidth = Gui.jf.getWidth();
				Gui.screenHeight = Gui.jf.getHeight();
				
				Gui.draw.setBounds(0,0,Gui.screenWidth,Gui.screenHeight);
				
				Var.x[0] = (int) (Gui.screenWidth * (1.0/3.0) - (Gui.screenWidth * (1.0/3.0) / 2));
				Var.x[1] = (int) (Gui.screenWidth * (2.0/3.0) - (Gui.screenWidth * (1.0/3.0) / 2));
				Var.x[2] = (int) (Gui.screenWidth - (Gui.screenWidth * (1.0/3.0) / 2));
				
				Var.y = Gui.screenHeight - 100;
				
			}
		}, 0, 100);
	}
	
}
