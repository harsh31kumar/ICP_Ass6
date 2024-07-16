//  Write a java method to check a string is palindrome or not


import java.util.Scanner;
public class Q8 {

	public static String palindrome (String str) {
		String a=" ";
		for(int i=str.length()-1;i>=0;i--) {
			a+=str.charAt(i);	
		}
		System.out.println("reverse:"+a);
		return a;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String b=sc.nextLine();
		String result=palindrome(b);
		if((b).equals(result))
		    System.out.println("yes");
		else
			System.out.println("no");
	}
}
