package week1.day2.assignment;

public class ReverseString {
	public static void main(String[] args) {
		String str="Hello World";
		System.out.println("Original string: "+ str);
		StringBuilder revStr=new StringBuilder(str);
		revStr.reverse();
		String result=revStr.toString();
		System.out.println("Reversed string: " + result);
	}

}
