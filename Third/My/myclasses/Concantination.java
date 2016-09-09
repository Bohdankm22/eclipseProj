package myclasses;

public class Concantination {

	public static void main(String[] args) {
		print(operation("The sum of " + 10 + " and " + 20 + " = " + (10 + 20)));
	}
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static String operation(String arg) {
		return "Answer is " + arg;
	}

}
