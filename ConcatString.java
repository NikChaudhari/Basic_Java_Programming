import java.util.Scanner;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String One");
		String str = sc.next();
		
		System.out.println("Enter the String Two");
		String str1 = sc.next();
		
		System.out.println("String after concat << "+str.concat(str1));
	}

}
