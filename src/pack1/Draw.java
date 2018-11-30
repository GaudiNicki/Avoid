package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.GRAY);
		
		for(int i = 0; i < Var.x.length; i++)
		{
			g.drawLine(Var.x[i], 0, Var.x[i], Gui.screenHeight);
		}
		
		//draw Player
		
		g.setColor(Color.RED);
		
		switch(Var.playerPos)
		{
			case 1:
				g.fillRect(Var.x[0] - (Var.playerSize / 2), Var.y, Var.playerSize, Var.playerSize);
				break;
			case 2:
				g.fillRect(Var.x[1] - (Var.playerSize / 2), Var.y, Var.playerSize, Var.playerSize);
				break;
			case 3:
				g.fillRect(Var.x[2] - (Var.playerSize / 2), Var.y, Var.playerSize, Var.playerSize);
				break;
		}
		
		//Draw Enemies
		g.setColor(Color.BLACK);
		
		for(int i = 0; i < Var.gegnerY.length; i++)
		{
			switch(Var.r[i])
			{
				case 1:
					g.fillRect(Var.x[0] - (Var.playerSize / 2), Var.gegnerY[i], Var.playerSize, Var.playerSize);
					break;
				case 2:
					g.fillRect(Var.x[1] - (Var.playerSize / 2), Var.gegnerY[i], Var.playerSize, Var.playerSize);
					break;
				case 3:
					g.fillRect(Var.x[2] - (Var.playerSize / 2), Var.gegnerY[i], Var.playerSize, Var.playerSize);
					break;
			}
		}
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, Gui.screenWidth, 100);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.BOLD, 25));
		g.drawString("Leben: " + Var.leben, 25, 75);
		
		g.setFont(new Font("Arial", Font.BOLD, 50));
		g.drawString("" + (int)Var.score, Gui.screenWidth / 2 - 50, 50);
		
		if(ScoreFlash.blink && Var.verloren)
		{
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, Gui.screenWidth, 50);
		}
		
		if(Var.drawKollision)
		{
			g.setColor(new Color(255,0,0,50));
			g.fillRect(0, 100, Gui.screenWidth, Gui.screenHeight);
		}
		
		if(Var.verloren)
		{
			g.setColor(new Color(0,0,0,150));
			g.fillRect(0, Gui.screenHeight / 2 -50, Gui.screenWidth, 100);
			
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial", Font.BOLD, 50));
			g.drawString("Press Enter", Gui.screenWidth / 2 - 140, Gui.screenHeight / 2 + 15);
	
		}
		
		if(Var.pause == true)
		{
			g.setColor(new Color(0,0,0,150));
			g.fillRect(0, Gui.screenHeight / 2 - 50, Gui.screenWidth, 100);
			
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial", Font.BOLD, 50));
			g.drawString("Pause - Press ESC", Gui.screenWidth / 2 - 225, Gui.screenHeight / 2 + 15);
		}
		
		repaint();
	}

}
