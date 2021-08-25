import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        float r;
        double area, circum;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input Radius of Circle : ");
        r = scan.nextFloat();
		
        area = 3.14*r*r;
        circum = 2*3.14*r;
		
        System.out.print(" The Area of Circle = " +area);
		
        System.out.print("\n The Circumference of Circle = " +circum);
    }
}
