import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        
        float height, width, area, perimeter;

        
        Scanner in = new Scanner(System.in);


       
        System.out.print("Input height of rectangle: ");
        height = in.nextFloat();
        
        System.out.print("Input width of rectangle: ");
        width  = in.nextFloat();

        
        
        perimeter = 2 * (height + width);

      
        area = height* width;

        
       
        System.out.println("Perimeter of rectangle is " + perimeter + " units.");
        System.out.println("Area of rectangle is " + area + " sq. units.");
    }
}
