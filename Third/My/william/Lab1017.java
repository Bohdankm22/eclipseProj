package william;

import javax.swing.JOptionPane;

public class Lab1017 {
	public static void main(String args[]){
		int x;
		String primeNumbers = "";
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		for(int i=2;i<x;i++){
			for(int j=2;j<=i;j++){
				if(j==i){
					primeNumbers += " " + i;
				}
				if(i%j==0){
					break;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Prime numbers below " +x + " are : " + primeNumbers, "Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
	}
}
