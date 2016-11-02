package MidTerm;

import java.io.*;
import java.util.Arrays;

public class Huffman {

	public static void main(String[] args) throws IOException {
		
		//1. Letter array Start
		//Array of alphabet chars with space included in the end
		
		char[] Letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
		    
		//1. End
		
		//2  ASCII array Start
		
		String str_letter = String.valueOf(Letter);
		byte[] ASCII = str_letter.getBytes("US-ASCII");
		System.out.println(Arrays.toString(ASCII)); //for test
		
		//2. End
		
		//3. Occurrence array Start
		//File IronHeel.txt needs to be put in working directory
		
		File file1 = new File("IronHeel.txt");
		BufferedReader in = new BufferedReader(new FileReader(file1));
		System.out.println("Letter Frequency");

		int nextChar;
		char ch;

		int[] Occurrence = new int[26];
		

		while ((nextChar = in.read()) != -1) {
			
			ch = ((char) nextChar);
			ch = Character.toLowerCase(ch);
			if (ch >= 'a' && ch <= 'z')
				Occurrence[ch - 'a']++;
				
		}

		for (int i = 0; i < 26; i++) {
			
			System.out.printf("%c = %d\n", i + 'A', Occurrence[i]);
			

		}

		in.close();
		
		//3. End
		
		//4. Frequency array Start
		
		double[] Frequency = new double[26];
		
		Double sum = 0.0;
		
		for( int i : Occurrence) {
		    sum += i;
		}
		
		
		
		for (int i = 0; i <26; i++) {
			double freq = Occurrence[i] / sum;
			Frequency[i] = freq;
			
		}
		
		
		
		//4. End
		
		//5. Ordered_Frequency array Start
		
		Arrays.sort(Frequency);
		System.out.println(Arrays.toString(Frequency)); //for test
		
		//5. End
	}

}
