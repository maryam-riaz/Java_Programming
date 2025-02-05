import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel { // inheritance (keyword: extends) (superclass: JPanel) (subclass: DrawPanel)
    public void paintComponent(Graphics g) { // everyJPanel has a paintComponent called automatically when DrawPanel is displayed 
        super.paintComponent(g);            // must be the fist statement in all paintComponent method you create 
        int width = getWidth();             // getWidth() and getHeight() are methods defined in the superclass 
        int height = getHeight();
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
}
