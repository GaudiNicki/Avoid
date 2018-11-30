package pack1;

public class Var {
	static int leben = 3;
	static double score = 0, scorecount = 1;
	
	static int x[] = new int[3];
	static int y;
	static int playerPos = 2, playerSize = 35;
	static int gegnerY[] = new int[12];
	static int r[] = new int[gegnerY.length];
	static int gegnerSpeed = 2;
	
	static boolean verloren = false, pause = false;
	static boolean drawKollision = false;

	public Var() {
		
		for(int i = 0; i < r.length; i++)
		{
			r[i] = (int)(Math.random()*3)+1;
		}
		
	}

}
