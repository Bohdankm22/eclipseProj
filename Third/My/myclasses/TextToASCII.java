package myclasses;
import javax.swing.JOptionPane;

public class TextToASCII {
	
	//private static final String TEXT = "Software Engineering";
	
	private static final String TEXT = JOptionPane.showInputDialog("Please input a text:");

	public static void main(String[] args) {
		System.out.println(performThroughLambda(String.format("ASCII result of [%s] : ", TEXT)));
	}
	
	private static String performThroughLoop(String string) {
		for (char a : TEXT.toCharArray()) {
			string += convertCharToASCII(a) + " ";
		}
		return string;
	}
	
	private static String performThroughLambda(String string) {
		StringBuilder asciiResult = new StringBuilder(string);
		TEXT.chars().mapToObj(i -> (char) i).forEach(a -> asciiResult.append(convertCharToASCII(a)).append(" "));
		return asciiResult.toString();
	}
	
	public static int convertCharToASCII(char let) {
		return (int) let;
	}

}
