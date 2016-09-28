package william;

import javax.swing.JOptionPane;

public class Lab204 {
	public static void main(String [] args){
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Provide a number with two digits"));
		int r = reverse(x);
		System.out.println("the number is "+r);
	}
	public static int reverse(int x){
		int y, r=0;
		while(x != 0)
		  {
			y = x % 10;
            x = x / 10;
            r = r * 10 + y;
		  }
		return r;
	}
}
