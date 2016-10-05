package classwork.work;

import java.util.Random;

public class LabWork {

	public static void main(String[] args) {
		int [] A = new int[10], B = new int[10], C = new int[10];
		Random random = new Random();
		for (int i = 0; i < A.length; i++) {
			A[i] = random.nextInt(101);
			B[i] = random.nextInt(101);
			C[i] = A[i] + B[i];
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(String.format("%3d + %3d = %3d", A[i], B[i], C[i]));
		}
	}

}
