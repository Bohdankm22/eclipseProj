package bohdan.jframe;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame(int width, int height, int i, int j) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My JF");
		setSize(width, height);
		setLocation(i, j);
		
		
		MyPanel1 p = new MyPanel1();
		setContentPane(p);
	}
}
