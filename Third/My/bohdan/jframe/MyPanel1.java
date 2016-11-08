package bohdan.jframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel1 extends JPanel {
	
	MyPanel1() {
		setBackground(Color.black);
		JLabel l = new JLabel("Again Soft engineering");
		l.setFont(new Font(null, Font.BOLD, 40));
		l.setForeground(Color.red);
		add(l);
	}
}
