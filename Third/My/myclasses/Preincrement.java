package myclasses;

public class Preincrement {

	public static void main(String[] args) {
		int x;
		int y;
		x = 10;
		y = 50 + (++x);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
