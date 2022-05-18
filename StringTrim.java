import java.util.Scanner;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String which u want to trim ");
		String str = sc.nextLine();
		
		System.out.println("String Trimming"+str.trim());

	}

}
