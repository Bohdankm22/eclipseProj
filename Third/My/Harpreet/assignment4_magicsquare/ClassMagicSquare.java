package Harpreet.assignment4_magicsquare;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClassMagicSquare extends JFrame{
	public ClassMagicSquare(int rc){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout layout = new GridLayout(rc,rc);
		JPanel p = new JPanel();
		p.setLayout(layout);
		setContentPane(p);
	}
}
