package oopclasses.second;

public class QuadrEqWithMethods {
	
	private double a;
	private double b;
	private double c;
	
	public QuadrEqWithMethods(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calculateDelta() {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double calculateX(boolean isFirst) {
		return isFirst ? (-b + Math.sqrt(calculateDelta())) / (2 * a) : (-b - Math.sqrt(calculateDelta())) / (2 * a);
	}
}
