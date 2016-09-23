package william;

import javax.swing.JOptionPane;

public class Lab1016 {
	public static void main(String args[]){
		int x, i = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
	      while(x != 0)
	      {
	          i = i * 10;
	          i = i + x%10;
	          x = x/10;
	      }
	      JOptionPane.showMessageDialog(null, "Reverse of the number is "+i,"Reverse",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
	   }
}
