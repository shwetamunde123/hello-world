import java.util.Scanner;
class Convert
{
    public static void main(String args[])
    {
    	
    Double kel, frh;
	System.out.println(  "Convert temperature in Kelvin to Fahrenheit:");
		System.out.println("---------------------------------------:");
		Scanner sc=new Scanner(System.in);
    System.out.println("Input the temperature in Kelvin : ");
    kel=sc.nextDouble();
    frh = (9.0 / 5) * (kel - 273.15) + 32;
    System.out.println("The temperature in kelvin:" +kel);
    System.out.println("The temperature in Fahrenheit:" +frh);
}
}
