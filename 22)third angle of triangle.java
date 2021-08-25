import java.util.Scanner;

public class Demo {

    public static void main(String[] args)
    {
    	System.out.println("Find the third angle of a triangle:");
    	System.out.println("- - - - - - - - - - - - - - - - - ");
    	Scanner in = new Scanner(System.in);

        System.out.println("Input  the 1st angle of the triangle:");
        int p=in.nextInt();
        System.out.println("Input the 2nd angle of the triangle:");

        
        int q = in.nextInt();
        int r;

     

       
        r = 180 - (p + q);

       
        System.out.println("The 3rd  angle of the triangle is: " + r + "\n");
    }
} 