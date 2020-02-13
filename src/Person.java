import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Person {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 200;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_WIDTH/4;
	private static final int EYE_X = HEAD_WIDTH/4;
	private static final int EYE_SEPARATION = HEAD_WIDTH/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 35;
	private static final int EYE_WIDTH = 35;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_WIDTH/2;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_WIDTH/7 * 2;
	private static final int MOUTH_Y = HEAD_WIDTH/4 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int manX, int manY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=manX;
		int y=manY;
		// Draw the head
		g2.setColor(Color.orange);
		g2.fillOval(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		// Draw the eyes
		g2.setColor(Color.green);
		x = manX + EYE_X; 
		y = manY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = manX + MOUTH_X;
		y = manY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Hey", manX, manY+HEAD_WIDTH+10);	
	}
}
