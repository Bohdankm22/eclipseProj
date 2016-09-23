package oopclasses;

public class NestedControlStrLab18 {

	public static void main(String[] args) {
		System.out.println("Task A: ");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Task B: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Task C: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i + 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
