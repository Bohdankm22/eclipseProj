package william;

import javax.swing.JOptionPane;

public class Lab1015 {
	public static void main(String[] args){
		int x, i;
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

	    for(i=1; i<=10; ++i)
	    {
	    	System.out.println(x+"*"+i+"="+(x*i));
	    	
	    }
	    
	}
}
