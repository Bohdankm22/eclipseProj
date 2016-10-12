package assignment2;

import java.nio.CharBuffer;

import javax.swing.JOptionPane;

public class SubstitutionCode {
	
	private static char abc[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private static char code[]={'d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c'};
	
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
		char[] hd = input.toLowerCase().toCharArray();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < abc.length; j++){
				if (abc[j] == hd[i]) {
					sb.append(code[j]);
					break;
				}	
			}
		}
		return sb.toString();
	}
	
	static String decodeString(String input) {
		StringBuilder sb = new StringBuilder();
		char[] hd = input.toLowerCase().toCharArray();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < code.length; j++){
				if (code[j] == hd[i]) {
					sb.append(abc[j]);
					break;
				}	
			}
		}
		return sb.toString();
	}
	
	public String getEncoded() {
		return this.encoded;
	}
	
	public String getUserInput() {
		return this.userInput;
	}
}
