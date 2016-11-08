package bohdan.jframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameNew extends JFrame {
	
	public MyFrameNew (int width, int height, int i, int j) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My JF");
		setSize(width, height);
		setLocation(i, j);
		
		JLabel label = new JLabel("Software Engineering");
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, height / 2));
		label.setForeground(Color.RED);
		getContentPane().add(label);
	}
}
