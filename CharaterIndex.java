// Write a Java program to get the character at the given index within the String.

import java.util.Scanner;

public class CharaterIndex{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println("Enter the index in string to get character");
		int index = scan.nextInt();
		char ch;
		//while(!str){
			ch = str.charAt(index);
		//}
		System.out.println("The Character at index " +index+ " is "+ch);
		
	}
	
}