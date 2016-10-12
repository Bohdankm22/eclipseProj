package william;

import javax.swing.JOptionPane;

public class Assigment3 {
	
	public static void main(String[] args){
		int o;
		o = Integer.parseInt(JOptionPane.showInputDialog("Provide an odd number"));
        int[][] board = new int[o][o];

        int r = 0;
        int c = o/2;
        int n = 1;
        if (o % 2 == 0){
        	o = Integer.parseInt(JOptionPane.showInputDialog("Provide an odd number"));
        }
        else{
        	while ( n <= o*o ){
        		board[r][c] = n;
        		n++;
        		int tempC = (c + 1)%o;
        		int tempR = (r - 1) >= 0 ? r-1 : o-1;
        		if( board[tempR][tempC] != 0 ){
        			r = (r+1)%o;
        		}
        		else{
        			r = tempR;
        			c = tempC;
        		}
        	}
        	for( int i = 0 ; i < o ; i++)
        	{
        		for( int j = 0 ; j < o ; j++)
        		{
        			System.out.printf("%2d ", board[i][j]);
        		}
        		System.out.println();
        	}
        }
    }
}
