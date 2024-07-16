//  Write java method called count accepts a string as input and returns the number of vowels in 
//  it. The method header is given below.
//  public static int count(String str)
//  For example, count ("Welcome") returns 2.


import java.util.Scanner;
public class Q7 {

	public static int count(String str) {
		int f=0;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==('a'|'A')||str.charAt(i)==('e'|'E')||str.charAt(i)==('i'|'I')||
					str.charAt(i)==('o'|'O')||str.charAt(i)==('u'|'U'))
				f++;
		}
		return f;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=sc.nextLine();
		int result=count(s);
		System.out.println(result);																				
	}
}
