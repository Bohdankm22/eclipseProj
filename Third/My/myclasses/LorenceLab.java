package myclasses;

public class LorenceLab {

	public static void main(String[] args) {
		int height, weight;
		String firstName, lastName;
		height = 182;
		firstName = "Bohdan";
		lastName = "Sharipov";
		weight = (int) ((height - 100) - (height - 150) / 4);;
		System.out.println("The ideal weight for you is " + weight);
	}

}
