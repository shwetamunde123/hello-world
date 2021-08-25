import java.util.Scanner;
public class Area_Perimeter 
{
    public static void main(String[] args) 
    {
        int l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Input length of rectangle:");
        l = s.nextInt();
        System.out.print("Input breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println(" The Perimeter of rectangle:"+perimeter);
        area = l * b;
        System.out.println("The Area of rectangle:"+area);
    }
} 