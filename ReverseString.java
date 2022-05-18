import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = scan.nextLine();
		String nstr = new String();
		char ch ;
		for(int  i = 0 ;i< str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		System.out.println("Reverse String is <<  "+nstr);

	}

}
