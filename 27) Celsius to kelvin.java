import java.util.Scanner;
class Convert
{
    public static void main(String args[])
    {
    	
    Double kel, cel;
	System.out.println(  "Convert temperature in Celsius to Kelvin:");
		System.out.println("---------------------------------------");
		Scanner sc=new Scanner(System.in);
    System.out.println("Input the temperature in Celsius : ");
    cel=sc.nextDouble();
    kel=(cel+273.15);
    System.out.println("The temperature in Celsius:" +cel);
    System.out.println("The temperature in Kelvin:" +kel);
}
} 