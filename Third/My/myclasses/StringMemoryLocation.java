package myclasses;

public class StringMemoryLocation {

	public static void main(String[] args) {
		String str = new String("Hello");
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str1 == str2);

	}

}
