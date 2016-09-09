package myclasses;

public class LorenceLab {

	public static void main(String[] args) {
		int height, weight;
		String firstName, lastName;
		height = 182;
		firstName = "Bohdan";
		lastName = "Sharipov";
		boolean isMan = true;
		double koef = isMan ? 4 : 2.5;
		weight = calculateLorence(height, koef);
		System.out.println("The ideal weight for you is " + weight);
	}
	
	public static int calculateLorence(int height, double koef) {
		return (int) ((height - 100) - (height - 150) / koef);
	}

}
