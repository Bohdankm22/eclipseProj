package myclasses;

public class TextToASCII {
	
	private static final String TEXT = "Software Engineering";

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
