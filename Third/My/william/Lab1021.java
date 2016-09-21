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
			for(int i=1;i<=10;i++){
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100, you have "+(11-i)+" tries"));
				if(n2 == n1){
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, "Congratulation you won, you have "+(nt-(10*(i-1)))+" points","Game",JOptionPane.INFORMATION_MESSAGE);
					w=true;
					break;
				}
				else if(n2>n1){
					JOptionPane.showMessageDialog(null, "Your number is too high");
				}
				else if(n2<n1){
					JOptionPane.showMessageDialog(null, "Your number is too low");
				}
			}
			if (w==false){
				JOptionPane.showMessageDialog(null, "Game Over");
			}
			System.out.println("The game is restarted");
			a=JOptionPane.showInputDialog("Play again?");
			while(!(((a.equals("Y"))||(a.equals("y")))||((a.equals("N"))||(a.equals("n")))))
				a=JOptionPane.showInputDialog("incorrect");
		}
		while (a.equals("Y")||a.equals("y"));
		JOptionPane.showMessageDialog(null, "GAME OVER");
		System.exit(0);
	}
}
