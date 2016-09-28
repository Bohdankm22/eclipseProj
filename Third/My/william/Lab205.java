package william;

import javax.swing.JOptionPane;

public class Lab205 {
	public static void main(String [] args){
		int a,b,c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Provide 'a'"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Provide 'b'"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Provide 'c'"));
		double x1 = calQ1(a,b,c);
		double x2 = calQ2(a,b,c);
		System.out.println("The results are "+x1+" and "+x2);
	}
	public static int calD(int a, int b, int c){
		int d;
		d=(b*b)-(4*a*c);
		return d;
	}
	public static double calQ1(int d, int b, int a){
		double x1;
		x1=((-b+(Math.sqrt(d)))/2*a);
		return x1;
	}
	public static double calQ2(int d, int b, int a){
		double x2;
		x2=((-b-(Math.sqrt(d)))/2*a);
		return x2;
	}
}
