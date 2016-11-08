package bohdan.jframe;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyMainJF extends JFrame {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int w = (int)d.getWidth();
		JFrame f = new MyFrame(w / 5, 100, 2 * w /3, 0);
		f.setVisible(true);
		
//		System.out.println("Width: " + d.width);
//		System.out.println("Heith: " + d.height);
	}

}
