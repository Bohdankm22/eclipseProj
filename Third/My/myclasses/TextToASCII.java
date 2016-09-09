package myclasses;
import javax.swing.JOptionPane;

public class TextToASCII {
	
	//private static final String TEXT = "Software Engineering";
	
	private static final String TEXT = JOptionPane.showInputDialog("Please input a text:");

	public static void main(String[] args) {
		String asciiResult = String.format("ASCII result of [%s] : ", TEXT);
		for (char a : TEXT.toCharArray()) {
			asciiResult += convertCharToASCII(a) + " ";
		}
		System.out.println(asciiResult);
	}
	
	public static int convertCharToASCII(char let) {
		return (int) let;
	}

}
