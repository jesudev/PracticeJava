/**
Convert from int to
Float ,Double ,Byte
*/
 
import java.util.Scanner;

public class IntConversion{
	public static void main(String args[]){
System.out.println("Enter a number for conversion test");
Scanner s=new Scanner(System.in);
int intInput=s.nextInt();

//Widening
float floatInput= intInput;
double doubleInput= intInput;
//Narrowing
Byte byteInput= (byte) intInput;

 
 System.out.println("\n Integer casted to byte:" + byteInput);
 System.out.println("\n Integer casted to float:" + floatInput);
 System.out.println("\n Integer casted to double:" + doubleInput);
}
}