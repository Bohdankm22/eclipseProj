package Harpreet.MP1_5;

import javax.swing.*;

import bohdan.Databases.ProjDataAccess;

public class Scores extends JFrame{
	
	public Scores(){
		ProjDataAccess data = new ProjDataAccess();
		int score = data.getUserScore("adsfas");
		JPanel panel = new JPanel();
		setSize(500,500);
		JLabel lbl = new JLabel("Your Score is: ");
		JLabel lbl2 = new JLabel("" + score);
		panel.add(lbl);
		panel.add(lbl2);
		setContentPane(panel);
		setVisible(true);
		
	}
	
}
