package william;

import javax.swing.JOptionPane;

public class Lab1014 {
	public static void main(String[] args){
		String a;
		do{
			int x,temp;
	        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
	        temp = x;
	        int f = 1;
	        while (x > 0)
	        {
	          f = f * x;
	          x--;
	        }
	        JOptionPane.showMessageDialog(null, "The factorial of "+ temp +" is "+ f ,"Factorial",JOptionPane.INFORMATION_MESSAGE);
			System.out.println("The game is restarted");
			a=JOptionPane.showInputDialog("Play again?");
			while(!(((a.equals("Y"))||(a.equals("y")))||((a.equals("N"))||(a.equals("n")))))
				a=JOptionPane.showInputDialog("Incorrect! Please provide Correct input(Y/N)");
		}
		while (a.equals("Y")||a.equals("y"));
		JOptionPane.showMessageDialog(null, "GAME OVER");
		System.exit(0);
	}
}
