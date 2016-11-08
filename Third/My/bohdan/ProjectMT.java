package bohdan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class ProjectMT {
	
	private static final char[] LETTER = {' ', 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
			'p','q','r','s','t','u','v','w','x','y','z'};
	private static final byte[] ASCII = {0x20, ',', ':', ';'};
	
	private static int[] OCCURRENCE = new int[LETTER.length];
	private static final String FILE_NAME = "/Users/bohdansharipov/Documents/Java/repositories/Third/My/bohdan/IronHeel.txt"; 

	public static void main(String[] args) {
		readFileByBytesAndCalculateIntoOccurrence(FILE_NAME);		
		double[] frequency = calculateFrequancy(OCCURRENCE);
		double[] sortedFrequency = new double[frequency.length];
		char[] sortedLetter = new char[LETTER.length];
		System.arraycopy(frequency, 0, sortedFrequency, 0, frequency.length );
		System.arraycopy(LETTER, 0, sortedLetter, 0, sortedLetter.length );
		
		System.out.println(Arrays.toString(OCCURRENCE));
		System.out.println(Arrays.toString(frequency));
		sort(sortedFrequency, sortedLetter);
		System.out.println(Arrays.toString(sortedFrequency));
		System.out.println(Arrays.toString(sortedLetter));
		
		System.out.println("Comprassion rate = " + calculateComprassionRate(OCCURRENCE));
	}
	
	private static double calculateComprassionRate(int[] occur) {
		double res = 0;
		int[] memory = fillCipherMemory(occur.length);
		long expCons = calculateTotal(occur) * 8;
		long cons = 0;
		for (int i = 0; i < occur.length; i++) {
			cons += occur[i] * memory[i];
		}
		System.out.println("Cons: " + cons + " and exp: " + expCons);
		return 100 - ( (double)cons / expCons * 100);
	}

	private static int[] fillCipherMemory(int i) {
		int[] res = new int[i];
		for (int j = 1; j <= i; j++) {
			res[j - 1] = Integer.toBinaryString(j).length();
		}
		return res;		
	}

	private static void sort(double[] arr, char[] fr) {		
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
	
	private static double[] inverseArr(double[] arr) {
		for (int left=0, right=arr.length-1; left<right; left++, right--) {
		    // exchange the first and last
		    double temp = arr[left]; 
		    arr[left]  = arr[right]; 
		    arr[right] = temp;
		}
		return arr;
	}

	private static double[] calculateFrequancy(int[] occurrence) {
		double[] result = new double[occurrence.length];
		int total = calculateTotal(occurrence);
		System.out.println("Total: " + total);
		for (int i = 0; i < occurrence.length; i++) {
			result[i] = (double)occurrence[i] / total;
		}
		return result;
	}

	private static int calculateTotal(int[] occurrence) {
		int result = 0;
		for (int i: occurrence) {
			result += i;
		}
		return result;
	}

	private static void readFileByBytesAndCalculateIntoOccurrence(String fileName) {
        try (FileInputStream in = new FileInputStream(fileName)){
            int c;
            while ((c = in.read()) != -1) {
                addCharacterIntoAccurance(c);
            }
        } catch (IOException e) {
			System.err.println("ERROR READING FILE!");
			e.printStackTrace();
		}
	}

	private static void addCharacterIntoAccurance(int c) {
		for (int i = 0; i < LETTER.length; i++) {
			if (Character.toLowerCase((char)c) == (byte)LETTER[i]) {
				OCCURRENCE[i]++;
				break;
			}
		}
		
	}

}
