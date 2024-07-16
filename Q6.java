//  Write a method that finds the number of occurrences of a specified character in a string using 
//  the following header:
//  public static int count(String str, char a)
//  For example, count ("Welcome", 'e') returns 2. 
//  Write a java program that prompts the user to enter a string followed by a character and 
//  displays the number of occurrences of the character in the string


import java.util.Scanner;
public class Q6 {

	public static int count(String str,char a) {
		int f=0;
		for(int i=0;i<str.length();i++) {
			if(a==str.charAt(i))
				f++;
		}
		return f;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String s=sc.nextLine();
		System.out.print("Enter the character:");
		char ch=sc.next().charAt(0);
		int result=count(s,ch);
		System.out.println(result);
	}
}
