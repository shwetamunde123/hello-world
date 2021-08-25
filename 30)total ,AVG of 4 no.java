import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1,n2,n3,n4;
        int total;
        float avg;
        

        System.out.println("Compute  the total and average of four numbers:");
        System.out.println("- - - - - - - - - - - -- - - - - - - - - - - - ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 1st two numbers:");
        n1= in.nextInt();
        n2=in.nextInt();
        System.out.println("Input last two numbers is:");
        n3 = in.nextInt();
        n4=in.nextInt();

       
        total=n1+n2+n3+n4;

       
        avg=total/4;

        System.out.println("The total of the number is: " + total);
        System.out.println("The average of the number is: " + avg);
    }
} 