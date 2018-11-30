package pack1;

import javax.swing.JFrame;

public class Gui {
	
	static JFrame jf;
	static Draw draw;
	static int screenWidth = 500, screenHeight = 700;

	public Gui() {
		
		jf = new JFrame();
		jf.setSize(screenWidth, screenHeight);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.addKeyListener(new KeyHandler());
		
		draw = new Draw();
		draw.setBounds(0,0,screenWidth, screenHeight);
		draw.setVisible(true);
		jf.add(draw);
		
		jf.setVisible(true);
		
	}

}
