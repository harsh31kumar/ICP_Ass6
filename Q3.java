//  Write the methods with the following headers 
//  Return the reversal of an integer. Example: reverse (456), returns 654



import java.util.Scanner;
public class Q3 {

		public static boolean isPalindrome(int number)
		{
			int rev=reverse(number);
			if(number==rev)
				return true;
			else
				return false;
		}
		public static int reverse(int n)
		{
			int rev=0;
			while(n>0)
			{
				rev=rev*10+n%10;
				n=n/10;
			}
			return rev;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Input a number:");
				int num=sc.nextInt();
				if(isPalindrome(num))
					System.out.println("A Pallindrome number");
				else
					System.out.println("Not a Pallindrome number");

			}
}
