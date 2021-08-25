import java.util.Scanner;
class Convert
{
    public static void main(String args[])
    {
    	
    Double kel, cel;
	System.out.println(  "Convert temperature in Kelvin to celsius:");
		System.out.println("---------------------------------------:");
		Scanner sc=new Scanner(System.in);
    System.out.println("Input the temperature in Kelvin : ");
    kel=sc.nextDouble();
    cel=(kel-273.15);
    System.out.println("The temperature in kelvin:" +kel);
    System.out.println("The temperature in celsius:" +cel);
}
} 