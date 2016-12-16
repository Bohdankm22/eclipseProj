package Harpreet.mp1_3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class GuessingGame21 extends JFrame implements ActionListener{
	private int randomNumber = new Random().nextInt(101);
	private int userScore = 100;
	JPanel p = new JPanel();
	JFrame frame = new JFrame();
	JFrame frame2 = new JFrame();
	public static int drawNext = 10;;
	HangingMan hangMan = new HangingMan();
	JButton btnArray[]=new JButton[100];
	public GuessingGame21(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout fl = new GridLayout(10, 10,0,0);
		p.setLayout(fl);
		frame.setContentPane(p);
		
		
		int j=0;
		for(int i=0; i<100;i++){
			j=i+1;
			btnArray[i] = new JButton("" + j);
			btnArray[i].addActionListener(this);
			p.add(btnArray[i]);
		}
		
		frame.pack();
		
		frame2.setSize(500, 500);
		frame2.setLocation(700,0);
		frame2.setContentPane(hangMan);
		frame2.setVisible(true);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		JButton btn = (JButton)source;
		int number;
		String word="";
		number = Integer.parseInt(btn.getText());
		if(number>randomNumber){
			word = "greater";
			btn.setBackground(Color.red);
		}else if(number < randomNumber){
			word="less";
			btn.setBackground(Color.yellow);
		}
		else{
			btn.setBackground(Color.green);
		}
		if (number == randomNumber) {
			JOptionPane.showMessageDialog(null, String.format("Congradulations!\nYour score is %d", userScore), "Game", JOptionPane.INFORMATION_MESSAGE);
			//frame.setVisible(false);
		} else if (userScore <= 0) {
			drawNext = 0;
			hangMan.removeAll();
			//hangMan.paint(getGraphics());
			hangMan.repaint();
			
			//frame.setVisible(false);
		} else {
			userScore -= 10;
			drawNext = userScore/10;
			hangMan.removeAll();
			//hangMan.paint(getGraphics());
			hangMan.repaint();
			/*JOptionPane.showMessageDialog(null, String.format("The number you entered is %s than win number!\n"
					+ "Numbere of remaining chances is %d\nYour related score is %d", word, userScore / 10, userScore), "Game", JOptionPane.INFORMATION_MESSAGE);
			*/	
		}
		if(drawNext == 0){
			JOptionPane.showMessageDialog(null, String.format("Sorry, Game is over!"), "Game", JOptionPane.INFORMATION_MESSAGE);
			btn.removeActionListener(this);
			for(int i=0; i<100;i++){
				btnArray[i].removeActionListener(this);
			}
			
		}
	}
	

}