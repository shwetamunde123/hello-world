import java.util.*;
 
class fahToCel
{
 public static void main(String args[])
 {
 	System.out.println("Convert temperature in Fahrenheit to Celsius:");
 	System.out.println("- - - - - - - - - - - - - - - - - - - ");
 int celsius,fahrenheit;
 Scanner sc = new Scanner(System.in);
     // Reads temperature in fahrenheit
 System.out.println("Input temperature in Fahrenheit :");
     fahrenheit=sc.nextInt();
     System.out.println("The temperature in Fahrenheit:" +fahrenheit);
     celsius=(fahrenheit - 32)*5/9;
     
     System.out.println("The temperature in Celsius:"+celsius);
 }
}
