import java.util.*; 
public class Main
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1=sc.nextInt();
        System.out.println("Input the second number:");
        int num2=sc.nextInt();
       int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping first Number is :"+num1);
        System.out.println("After Swapping second Number is: "+num2);
     }
}
