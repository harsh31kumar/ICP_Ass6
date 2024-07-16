//  Some websites impose certain rules for passwords. 
//  Write a method that checks whether a string is a valid password. Suppose the password rules 
//  are as follows:
//   A password must have at least eight characters.
//   A password consists of only letters and digits.
//   A password must contain at least two digits. 
//  Write a program that prompts the user to enter a password and displays Valid Password if the 
//  rules are followed or Invalid Password otherwise


import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			boolean valid=false;
	
			//Ask user to input password
			System.out.print("Enter password and press enter:");
			String password=sc.nextLine();
			
			//check length of password
			if(password.length()<8) {
				valid =false;
			    System.out.print("Sorry!!,Your password must have atleast 8 character.");
			    return;
			}
			//to check each character
			for(int i=0;i<password.length();i++) {
				char c=password.charAt(i);
				if(('a'<=c&&c<='z')||('A'<=c&&c<='Z')||('0'<=c&&c<='9')) {
					valid =true;}
				else {
					System.out.println("Sorry!!,Only letters & digits are acceptable.");
				    valid=false;return;
				    }
			}
			System.out.println("Thanks,Your Password is correct.");
	}           
}
