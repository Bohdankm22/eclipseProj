package william;

import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lab1021 {
	public static void main (String[] args){
		String a;
		do{
			Random r =new Random();
			int n1 = r.nextInt(100);
			int nt = 100;
			int n2;
			boolean w = false;
			String ta;
			for(int i=10;i>1;i--){
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100, you have "+ i +" chances"));
				nt += i * 10;
				if(n2 == n1){
					
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Congratulation you won, you have "+ nt +" points","Game",JOptionPane.INFORMATION_MESSAGE);
					w=true;
					break;
				}
				else if(n2>n1){
					JOptionPane.showMessageDialog(null, "Your guessed number is higher than the number chosen by the program. \n Now you have " + (i-1) + " chances left. \n Your score till now is " + nt);
				}
				else if(n2<n1){
					JOptionPane.showMessageDialog(null, "Your guessed number is lower than the number chosen by the program. \n Now you have " + (i-1) + "chances left. \n Your score till now is " + nt);
				}
			}
			if (w==false){
				JOptionPane.showMessageDialog(null, "Game Over");
			}
			System.out.println("The game is restarted");
			a=JOptionPane.showInputDialog("Play again?");
			while(!(((a.equals("Y"))||(a.equals("y")))||((a.equals("N"))||(a.equals("n")))))
				a=JOptionPane.showInputDialog("Incorrect! Enter correct choice(Y/N)");
		}
		while (a.equals("Y")||a.equals("y"));
		JOptionPane.showMessageDialog(null, "GAME OVER");
		System.exit(0);
	}
}
