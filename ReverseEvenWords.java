package week1.day2.assignment;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String str="hello world";
		String[]n=str.split(" ");
		String newstr="";
		for(int i=0;i<n.length;i++)
		{
			if(i%2==1)
				newstr=newstr+new StringBuilder(n[i]).reverse() + " ";
			else
				newstr=newstr + n[i] + "";
		}
		System.out.println(newstr);
		}
	}
