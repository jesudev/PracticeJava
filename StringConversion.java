/**
Convert from String to
Int,Byte ,Float ,Double
*/
 
import java.util.Scanner;

public class StringConversion{
	public static void main(String args[]){
System.out.println("Enter a number for conversion test");
Scanner s=new Scanner(System.in);
String stringInput=s.nextLine();

//Explicit conversion Non-Primitive to Primitive

int intInput= Integer.parseInt(stringInput);
byte byteInput= Byte.parseByte(stringInput);
float floatInput= Float.parseFloat(stringInput);
double doubleInput=Double.parseDouble(stringInput);


 System.out.println("\n String casted to int :" + intInput);
 System.out.println("\n String casted to byte:" + byteInput);
 System.out.println("\n String casted to float:" + floatInput);
 System.out.println("\n String casted to double:" + doubleInput);
}
}