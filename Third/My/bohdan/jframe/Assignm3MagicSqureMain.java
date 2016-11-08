package bohdan.jframe;

import java.awt.Button;

import javax.swing.JOptionPane;

public class Assignm3MagicSqureMain {

	public static void main(String[] args) {
		int numb = numb();
		AssigmJFMagSc frame = new AssigmJFMagSc(numb);
		int[][] arr = getArrWithNumb(numb);
		for (int i = 0; i < numb; i++) {
			for (int j = 0; j < numb; j++) {
				frame.add(new Button(Integer.toString(arr[i][j])));
			}
		}
		frame.pack();
		frame.setVisible(true);
	}
	
	private static int numb(){
		while(true) {
			try {
				int res = Integer.parseInt(JOptionPane.showInputDialog("Provide an odd number"));
				if (res % 2 != 0) {
					return res;
				}
			} catch (Exception e) {
				System.err.println("ENTER THE NUMBER!");
			}
		}
	}
	
	private static int[][] getArrWithNumb(int o) {
			int[][] board = new int[o][o];
			int r = 0;
	        int c = o/2;
	        int n = 1;
        	while ( n <= o*o ){
        		board[r][c] = n;
        		n++;
        		int tempC = (c + 1)%o;
        		int tempR = (r - 1) >= 0 ? r-1 : o-1;
        		if( board[tempR][tempC] != 0 ){
        			r = (r+1) % o;
        		}
        		else{
        			r = tempR;
        			c = tempC;
        		}
        	}
        	return board;
	}

}
