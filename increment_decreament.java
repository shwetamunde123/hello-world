import java.util.Scanner;
public class Increment_Decrement
{
    public static void main(String[] args) 
    {
        int a, b, c, d, e;
        Scanner s = new Scanner(System.in);
System.out.print("The number is:");
        a = s.nextInt();
        b = ++a;
 System.out.println(" after Pre Increment by 1 the number is:"+b);
        c = a++;
System.out.println(" after Post Increment by 1 the number is:"+c);
        d = --a;
System.out.println(" after Pre Decrement by 1 the number is:"+d);
        e = a--;
 System.out.println(" after Post Decrement by 1 the number is:"+e);
    }   
}