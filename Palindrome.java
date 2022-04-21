package week1.day2.assignment;

public class Palindrome {
	public static void main(String[] args) {
		String str="hello";
		String revStr="";
		int strLen=str.length();
		for(int i=(strLen-1);i>=0;--i)
		{
			revStr=revStr+str.charAt(i);
		}
		if(str.toLowerCase().equals(revStr.toLowerCase())) 
		{
			System.out.println(str + " is a palindrome String.");
		}
		else
		{
			System.out.println(str = "is not a palindrome String.");
			
		}
		
	}

}
