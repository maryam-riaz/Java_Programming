import javax.swing.JFrame;

public class Exercise_4_1Test {
	public static void main(String[] args) {
		JFrame fr = new JFrame();
		Exercise_4_1 panel = new Exercise_4_1();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.add(panel);
		fr.setSize(250,250);
		fr.setVisible(true);
	}
}
