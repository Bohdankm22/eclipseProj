package Harpreet.assignment3;

import java.awt.Toolkit;

import javax.swing.JFrame;


public class FrameClass extends JFrame{ 
	FrameClass(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Welcome to My Frame");	
		
		int maxHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int minHeight = 100;
		int minWidth = 100;
		int maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int randHeight = (int)(Math.random() * ((maxHeight - minHeight) + 1));
		int randWidth = (int)(Math.random() * ((maxWidth - minWidth) + 1));
		setSize(randWidth, randHeight);
		setLocation(randWidth, randHeight);
		PanelClass panel = new PanelClass(randWidth);
		getContentPane().add(panel);
		setVisible(true);
	}
}
