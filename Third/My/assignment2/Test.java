package assignment2;

public class Test {

	public static void main(String[] args) {
		SubstitutionCode sc = SubstitutionCode.createWithInput();
		System.out.println(sc.getUserInput() + "+" + sc.getEncoded());
	}

}
