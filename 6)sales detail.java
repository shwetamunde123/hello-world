import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

int prc,qt=2,i,n,total=0;

System.out.println("\n Enter the number of sales product: ");

n=sc.nextInt();

for(i=1;i<=n;i++)

{

System.out.println("\n\n Enter the details of the "+i+" No. product");

System.out.println("\n Enter the unit price of the sales product (between 0 to 1000): ");
      prc=sc.nextInt();

System.out.println("Enter the quantity of the sales product (between 0 t0 1000): ");

qt=sc.nextInt();

total=(total+(prc*qt));

}

for(i=1;i<=n;i++)

{

System.out.println("\n\n The details of the "+i+" No. product");

System.out.println("\n The unit price of the sales product is: ");

System.out.println("\n The quantity of the sales product is: ");

System.out.println("\n\n");

}

System.out.println("\n The total sales amount is: "+total);

}
	}
