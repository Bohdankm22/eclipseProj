package Harpreet.assignment3;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelClass extends JPanel{
	PanelClass(int frameWidth){
		setBackground(Color.black);
		JLabel l = new JLabel("Software Engineering");
		int stringWidth = l.getFontMetrics(l.getFont()).stringWidth(l.getText());
		int labelWidth = frameWidth;
		int fontSize = (int) l.getFont().getSize() * (labelWidth/stringWidth);
		l.setFont(new Font("Serif", Font.BOLD|Font.ITALIC,fontSize));
		l.setForeground(Color.red);
		add(l);
	}
}
