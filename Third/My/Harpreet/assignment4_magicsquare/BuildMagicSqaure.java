package Harpreet.assignment4_magicsquare;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BuildMagicSqaure {

	public static void main(String[] args) {		
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Provide an odd number"));
		if (num % 2 == 0){
        	num = Integer.parseInt(JOptionPane.showInputDialog("Provide an odd number"));
        }else{
        	int[][] board = buildMagicSqaure(num);
        	displayMagicSquare(board,num);
        }      
	}
	
	public static int[][] buildMagicSqaure(int num){
		int[][] square = new int[num][num];
		int r = 0;
	    int c = num/2;
	    int n = 1;
	    while ( n <= num*num ){
	    	square[r][c] = n;
	    	n++;
	    	int tempC = (c + 1)%num;
	    	int tempR = (r - 1) >= 0 ? r-1 : num-1;
	    	if( square[tempR][tempC] != 0 ){
	    		r = (r+1)%num;
	    	}
	    	else{
	    		r = tempR;
	    		c = tempC;
	    	}
	    }	        
		return square;
	}
	public static void displayMagicSquare(int[][] square, int num){
		ClassMagicSquare magic = new ClassMagicSquare(num);
		for( int i = 0 ; i < num ; i++)
    	{
    		for( int j = 0 ; j < num ; j++)
    		{
    			magic.add(new Button(square[i][j] + ""));
    		}
    	}
		magic.setVisible(true);
		magic.pack();
	}
}