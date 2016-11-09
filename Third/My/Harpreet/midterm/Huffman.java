package Harpreet.midterm;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Huffman {

	public static void main(String[] args) throws IOException {
		
		//Processing 1
		//Step 1. Letter array 	
		char[] Letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
		    
		//Step 2.  ASCII array		
		String str_letter = String.valueOf(Letter);
		byte[] ASCII = str_letter.getBytes("US-ASCII");
		
		//Step 3. Occurrence array		
		File file1 = new File("https:\\github.com\\Bohdankm22\\eclipseProj\\tree\\master\\Third\\My\\Harpreet\\midterm\\IronHeel.txt");
		BufferedReader in = new BufferedReader(new FileReader(file1));

		int nextChar;
		char ch;
		int[] Occurrence = new int[Letter.length];
		while ((nextChar = in.read()) != -1) {			
			ch = ((char) nextChar);
			ch = Character.toLowerCase(ch);
			if (ch >= 'a' && ch <= 'z'){
				Occurrence[ch - 'a']++;
			}else if(ch == ' ' || ch == ';' || ch == ',' || ch == ':'){
				Occurrence[Occurrence.length - 1]++;
			}
		}
		in.close();
		
		//4. Frequency array		
		double[] Frequency = new double[Letter.length];		
		Double sum = 0.0;		
		for( int i=0; i< Occurrence.length; i++) {
		    sum += Occurrence[i];
		}			
		for (int i = 0; i <27; i++) {
			double freq = Math.round((Occurrence[i]/sum)*1000.00)/1000.00;
			Frequency[i] = freq;			
		}		
	
		//5. Ordered_Frequency array	
		double[] ordered_Frequency = Arrays.copyOf(Frequency, Frequency.length);
		char[] ordered_Letters = Arrays.copyOf(Letter, Letter.length);
		sortFrequency(ordered_Frequency,ordered_Letters);
		
		// Step 6 Coding table
		String[] CodingTable = {"100","0010","0011","1111","1110","1100","1011","1010","0110","0101","11011","01111","01001","01000","00011","00010","00001","00000","110101","011101","011100","1101001","110100011","110100001","110100000","1101000101","11010001000"};
		String[][] Huffman_Code = new String[27][2];
		for(int i=0; i<ordered_Letters.length; i++){
			Huffman_Code[i][0] = ordered_Letters[i] + "";
			Huffman_Code[i][1] = CodingTable[i];
		}
	
	//Processing 2
	//Step 7
	String cipheredText = "";
	in = new BufferedReader(new FileReader(file1));
	HashMap<String, String> map = new HashMap<String, String>();
	for(int i=0; i<Huffman_Code.length;i++){
		map.put(Huffman_Code[i][0], Huffman_Code[i][1]);
	}
	while ((nextChar = in.read()) != -1) {		
		ch = ((char) nextChar);
		ch = Character.toLowerCase(ch);
		if(map.get(ch + "")!=null){
			cipheredText += map.get(ch + "");
		}
	}
	in.close();
	
	double compressionRate = calculateCompressionRate(cipheredText,Occurrence);
	
	String input = JOptionPane.showInputDialog("Choose one of the following: \n1. Display ciphered text. \n 2. Display all 6 arrays alongwith compression rate.");
    int choice = 0;
    try{
        choice = Integer.parseInt(input);
    }catch(NumberFormatException nfe){
        System.err.println("Invalid Format!");
    }
   
    switch(choice){
    //Step 7.1 Ciphered Text Display
    case 1: System.out.println("Ciphered Text: \n");
    		String subCipher = cipheredText;
		    while(subCipher.length() > 1000) {
		        System.out.println(subCipher.substring(0, 1000));
		        subCipher = subCipher.substring(1000);
		    }
		    if(subCipher.length() >0){
		    	System.out.println(subCipher);
		    }
		    //Step 8. Display Deciphered Text
		    String resp = JOptionPane.showInputDialog("Would you like to see the deciphered text?\nY \nN");
		    if(resp.toUpperCase().equals("Y")){
		    	System.out.println("Deciphered Text: \n");
		    	String decipheredText = getKeyByValue(map, cipheredText);
		    	while(decipheredText.length() > 1000) {
			        System.out.println(decipheredText.substring(0, 1000).toUpperCase());
			        decipheredText = decipheredText.substring(1000);
			    }	
		    	if(decipheredText.length() >0){
			    	System.out.println(decipheredText.toUpperCase());
			    }
		    }else;
    	break;
    	//Step 7.2 Arrays Display
    case 2: System.out.println("Arrays: \n");
    		System.out.printf("%s%7s%12s","Letters",  "ASCII", "Occurrence","Frequency");
    		System.out.println("\n");
    		for(int i=0;i<Letter.length;i++){
    			System.out.printf("%s%12s%7s",Letter[i] , ASCII[i] ,  Occurrence[i] ,  Frequency[i] );
    			System.out.println("\n");
    		}
    		System.out.printf("%5s%25s%15s", "Ordered Letters","Ordered_Frequency", "Huffman_Code");
    		System.out.println("\n");
    		for(int i=0;i<ordered_Frequency.length;i++){
    			System.out.printf("%s%25s%15s", ordered_Letters[i],ordered_Frequency[i] ,  Huffman_Code[i][1]);
    			System.out.println("\n");
    		}
    		System.out.println("\n");
    		System.out.println("Compression Rate: " + compressionRate);
    		break;
    default: System.out.println("Please choose either 1 or 2.");
    }
    
	}
	public static String getKeyByValue(Map<String, String> map, String cipheredText) {
		int index = 0;
		String value = "";
		String decipheredText = "";
	    while(index<cipheredText.length()){
	    	value += cipheredText.charAt(index) + "";
	    	for (Entry<String, String> entry : map.entrySet()) {
	 	       if(entry.getValue().equals(value)){
	 	    	  decipheredText += entry.getKey();
	 	    	  value = "";
	 	    	  break;
	 	       }
	 	    }
	    	index++;
	    }		
	    return decipheredText;
	}
	public static double calculateCompressionRate(String encryptedText, int[] originalText){
		double compRate;
		long sizeCipheredText = encryptedText.length();
		long sizeOriginalText = calculateSizeOriginalText(originalText) * 8;
		compRate = 100 - ((double) sizeCipheredText / sizeOriginalText * 100);
		return compRate;
	}
	private static int calculateSizeOriginalText(int[] originalText) {
		int result = 0;
		for (int i : originalText) {
			result += i;
		}
		return result;
	}
	private static void sortFrequency(double[] arr, char[] fr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					double temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					char tmp = fr[j];
					fr[j] = fr[i];
					fr[i] = tmp;
				}
			}
		}
	}

}