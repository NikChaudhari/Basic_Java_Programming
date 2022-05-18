import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String >> ");
		String str = scan.nextLine();
		String nstr = new String();
		//char ch ;
		for(int i = 0 ; i < str.length() ; i++ ) {
			
			//ch = str.charAt(i);
			nstr = str.charAt(i) + nstr;
			
		}
		if(str.equalsIgnoreCase(nstr)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String Not Palindrome");
		}
		

	}

}
