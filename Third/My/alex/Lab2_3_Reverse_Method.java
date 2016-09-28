package alex;
import javax.swing.JOptionPane;

public class Lab2_3_Reverse_Method {

	public static void main(String[] args) {
		
		int n;
		while (true) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Please input 2 digit number: "));
			if (n < 10 || n >= 100) {
				JOptionPane.showMessageDialog(null, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, String.format("Revert number for %d is %s", n, reverse(n), JOptionPane.INFORMATION_MESSAGE));
//???
	   }
	   public static int reverse(int n) {
	       int result = 0;
	       int rem;
	       while (n > 0) {
	           rem = n % 10;
	           n = n / 10;
	           result = result * 10 + rem;
	       }
	       return result;
	}
}

