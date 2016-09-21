package william;

import javax.swing.JOptionPane;

public class Lab1017 {
	public static void main(String args[]){
		int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		for(int i=2;i<x;i++){
			for(int j=2;j<=i;j++){
				if(j==i){
					System.out.println(i);
				}
				if(i%j==0){
					break;
				}
			}
		}
	}
}
