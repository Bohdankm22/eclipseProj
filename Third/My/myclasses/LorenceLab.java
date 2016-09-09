package myclasses;

public class LorenceLab {

	public static void main(String[] args) {
		int height, weight, weight1;
		String firstName, lastName;
		height = 182;
		firstName = "Bohdan";
		lastName = "Sharipov";
		weight = (int) ((height - 100) - (height - 150) / 4);
		weight1 = (int) ((height - 100) - (height - 150) / 2.5);
		System.out.println("The ideal weight for man is " + weight);
		System.out.println("The ideal weight for weman is " + weight1);
	}

}
