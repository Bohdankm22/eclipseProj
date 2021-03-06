package bohdan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ProjectMT {

	private static final char[] LETTER = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
			'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	private static final byte[] ASCII = { ',', ':', ';' };
	private static int CHARACTERS_AMOUNT;
	private static int ALL_CHAR_AMOUNT;

	private static int[] OCCURRENCE = new int[LETTER.length];
	private static final String FILE_NAME = "/Users/bohdansharipov/Documents/Java/repositories/Third/My/bohdan/IronHeel.txt";

	public static void main(String[] args) {
		File file = new File("IronHeel.txt");
		readFileByBytesAndCalculateIntoOccurrence(file.getAbsoluteFile().toString());
		double[] frequency = calculateFrequancy(OCCURRENCE);
		double[] sortedFrequency = new double[frequency.length];
		char[] sortedLetter = new char[LETTER.length];
		System.arraycopy(frequency, 0, sortedFrequency, 0, frequency.length);
		System.arraycopy(LETTER, 0, sortedLetter, 0, sortedLetter.length);
		sort(sortedFrequency, sortedLetter);

		int[] text = getCipheredText(file.getAbsoluteFile().toString(), sortedLetter);
		displayCipherText(text, true);
		System.out.println("Letter: " + Arrays.toString(LETTER));
		System.out.println();
		buildCodingTable(sortedLetter);
		System.out.println();
		System.out.println(Arrays.toString(OCCURRENCE));
		 System.out.println(Arrays.toString(frequency));
		 
		 System.out.println("Sorted frequency: " + Arrays.toString(sortedFrequency));

		 System.out.println("Sorted letters: " + Arrays.toString(sortedLetter));

		 System.out.println("______________________________________________________");
		 System.out.println("Comprassion rate = " +
		 calculateComprassionRate(OCCURRENCE));

		 decoded(text, sortedLetter);
	}

	private static void decoded(int[] text, char[] sortedLet) {
		if (wouldLikeToSee()) {
			displayCipherText(decodeText(text, sortedLet), false);
		}
	}

	private static int[] decodeText(int[] text, char[] sortedLet) {
		int[] res = new int[CHARACTERS_AMOUNT];
		int posit = 0;
		label1: for (int g = 0; g < text.length; g++) {
			for (int i = 1; i <= sortedLet.length; i++) {
				if (text[g] == i) {
					res[posit] = sortedLet[i - 1];
					posit++;
					continue label1;
				}
			}
			res[posit] = text[g];
			posit++;
		}
		return res;
	}


	private static boolean wouldLikeToSee() {
		String ans = JOptionPane.showInputDialog("Enter 'y' to see decoded text");
		return ans.equals("y") || ans.equals("Y") ? true : false;
	}

	private static void displayCipherText(int[] text, boolean isEncode) {
		int numberSymbInLine = 100;
		int modula = text.length % numberSymbInLine;
		int i = 0;
		for (; i < (text.length / numberSymbInLine); i++) {
			for (int j = 0; j < numberSymbInLine; j++) {
				if (isEncode) {
					System.out.print(Integer.toBinaryString(text[i * numberSymbInLine + j]));
				} else {
					System.out.print(Character.toUpperCase((char)text[i * numberSymbInLine + j]));
				}				
			}
			System.out.println();
		}
		for (int j = 0; j < modula; j++) {
			if (isEncode) {
				System.out.print(Integer.toBinaryString(text[i * numberSymbInLine + j]));
			} else {
				System.out.print(Character.toUpperCase((char)text[i * numberSymbInLine + j]));
			}
		}
	}

	private static int[] getCipheredText(String fileName, char[] sortedLet) {
		int[] res = new int[CHARACTERS_AMOUNT];
		try (FileInputStream in = new FileInputStream(fileName)) {
			int c;
			int posit = 0;
			label1: 
			while ((c = in.read()) != -1) {
				if (c == 10 || c == 13)
					continue;
				for (int j = 0; j < ASCII.length; j++) {	
					if ((byte)c == (byte)ASCII[j]) {
						//System.err.println("adkjfalskdgjklasdkjgklsdajg");
						res[posit] = 32;
						posit++;
						continue label1;
					}
				}
				for (int i = 1; i <= sortedLet.length; i++) {
					if (Character.toLowerCase((char) c) == (byte) sortedLet[i - 1]) {
						res[posit] = i;
						posit++;
						continue label1;
					}
				}
				res[posit] = c;
				posit++;
			}
		} catch (IOException e) {
			System.err.println("ERROR READING FILE!");
			e.printStackTrace();
		}
		return res;
	}

	private static void buildCodingTable(char[] sortedLetter) {
		System.out.println("__________________________________");
		System.out.println("Coding Table");
		System.out.println(String.format("%6s | %6s", "Letter", "Code"));
		for (int i = 0; i < sortedLetter.length; i++) {
			System.out.println(String.format("   %1s   |   %s  ", Character.toString(sortedLetter[i]),
					Integer.toBinaryString(i + 1)));
		}
		System.out.println("__________________________________");
	}

	private static double calculateComprassionRate(int[] occur) {
		int[] memory = fillCipherMemory(occur.length);
//		long expCons = calculateTotal(occur)  * 8 ;
		long expCons = ALL_CHAR_AMOUNT * 8 ;
		long cons = 0;
		for (int i = 0; i < occur.length; i++) {
			cons += occur[i] * memory[i];
		}
		cons = cons + (ALL_CHAR_AMOUNT - calculateTotal(occur)) * 8;
		System.out.println("Cons: " + cons + " and exp: " + expCons);
		return 100 - ((double) cons / expCons * 100);
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
		for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
			// exchange the first and last
			double temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		return arr;
	}

	private static double[] calculateFrequancy(int[] occurrence) {
		double[] result = new double[occurrence.length];
		int total = calculateTotal(occurrence);
		System.out.println("Total: " + total);
		for (int i = 0; i < occurrence.length; i++) {
			result[i] = (double) occurrence[i] / total;
		}
		return result;
	}

	private static int calculateTotal(int[] occurrence) {
		int result = 0;
		for (int i : occurrence) {
			result += i;
		}
		return result;
	}

	private static void readFileByBytesAndCalculateIntoOccurrence(String fileName) {
		try (FileInputStream in = new FileInputStream(fileName)) {
			int c;
			int length = 0;
			int dif_char_am = 0;
			while ((c = in.read()) != -1) {
				if (c == 10 || c == 13) {
					dif_char_am++;
					continue;
				}
				addCharacterIntoAccurance(c);
				length++;
			}
			CHARACTERS_AMOUNT = length;
			ALL_CHAR_AMOUNT = length + dif_char_am;
		} catch (IOException e) {
			System.err.println("ERROR READING FILE!");
			e.printStackTrace();
		}
	}

	private static void addCharacterIntoAccurance(int c) {
		for (int i = 0; i < LETTER.length; i++) {
			if (Character.toLowerCase((char) c) == (byte) LETTER[i]) {
				OCCURRENCE[i]++;
				break;
			}
		}

	}

}
