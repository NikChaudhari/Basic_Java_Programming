//Bitwise operator operats on bitwise level on int and boolean no other datatypes
//Logical operator operats on logical level on only boolean datatypes
public class BitwiseVsLogicalOpearator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;     //binary 1010
		int b = 8;      //binary 1000
		int result = a & b;               //Bitlevel Addition 
		System.out.println("Result of BitWIse " +result);  //1000 as and logic value
		
// 		int result2 = a && b;
// 		System.out.println("Result of Logical " +result2);  
//		compile time error as logical operator needs boolean value

	}

}
