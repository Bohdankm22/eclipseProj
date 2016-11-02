package MidTerm;

import java.io.*;

public class Huffman {

	public static void main(String[] args) throws IOException {

		//3. Occurence array Start
		File file1 = new File("IronHeel.txt");
		BufferedReader in = new BufferedReader(new FileReader(file1));
		System.out.println("Letter Frequency");

		int nextChar;
		char ch;

		int[] Occurence = new int[26];
		

		while ((nextChar = in.read()) != -1) {
			
			ch = ((char) nextChar);
			ch = Character.toLowerCase(ch);
			if (ch >= 'a' && ch <= 'z')
				Occurence[ch - 'a']++;
				
		}

		for (int i = 0; i < 26; i++) {
			
			System.out.printf("%c = %d\n", i + 'A', Occurence[i]);
			

		}

		in.close();
		//3. End
	}

}
