import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercise_4_1 extends JPanel{
	public Exercise_4_1(){
		//public constructor
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		for (int i = 0, j=h; i <=w; i+=15, j-=15)
		{
				g.drawLine(0, 0, i, j);
		}
		for (int i = 0, j=0; i <=w; i+=15, j+=15)
		{
				g.drawLine(0, h, i, j);
		}
		for (int i = 0, j=0; i <=w; i+=15, j+=15)
		{
				g.drawLine(w, 0, i, j);
		}
		for (int i = 0, j=h; i <=w; i+=15, j-=15)
		{
				g.drawLine(w, h, i, j);
		}
		// for (int i = 0, j=h; i <=w; i+=15, j-=15)
		// {
		// 		g.drawLine(0, 0, i, j);
		// }
		
	}
}
