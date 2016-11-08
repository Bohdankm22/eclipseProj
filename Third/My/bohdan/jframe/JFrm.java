package bohdan.jframe;


import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JFrm extends JFrame {
	
	public JFrm(String pctName) {
		setSize(200, 200);
		JLabel login = new JLabel("Login");
		JTextField lg = new JTextField();
		JLabel pass = new JLabel("Password");
		JTextField ps = new JTextField();
		
	}
}
