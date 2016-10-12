package assignment2;

import java.nio.CharBuffer;

import javax.swing.JOptionPane;

public class SubstitutionCode {
	
	private String userInput;
	private String encoded;
	
	public SubstitutionCode(String userInput) {
		this.userInput = userInput;
		this.encoded = encodeString(userInput);
	}
	
	public static SubstitutionCode createWithInput() {
		return new SubstitutionCode(JOptionPane.showInputDialog("Input line to code: "));
	}
	
	private static String encodeString(String input) {
		StringBuilder sb = new StringBuilder();
		CharBuffer.wrap(input.toUpperCase().toCharArray()).chars().mapToObj(ch -> 
			(char)ch).forEach(ch -> sb.append(ChipherKey.valueOf(Character.toString(ch)).value));
		return sb.toString();
	}
	
	private static String decodeString(String input) {
		StringBuilder sb = new StringBuilder();
		CharBuffer.wrap(input.toUpperCase().toCharArray()).chars().mapToObj(ch -> 
			(char)ch).forEach(ch -> sb.append(ChipherKey.valueOf(Character.toString(ch)).value));
		return sb.toString();
	}
	
	public String getEncoded() {
		return this.encoded;
	}
	
	public String getUserInput() {
		return this.userInput;
	}
	
	
	

}
