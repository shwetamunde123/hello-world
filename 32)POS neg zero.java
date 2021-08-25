//Java program to check number is positive, negative or zero.
 
import java.util.*;
 
class PosNegZero
{
    public static void main(String []s)
    {
        int num;
        
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Input a number: ");
        num=sc.nextInt();
         
        
        if(num>0)
            System.out.println(" The Enterd Number is Positive ." +num);
        else if(num<0)
            System.out.println( " The Enterd Number is Negative "+num);
        else
            System.out.println("The Enterd Number is  Zero");
         
    }
}
