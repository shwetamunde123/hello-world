import java.util.Scanner;
class Main {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch; 
	System.out.println("Print code (ASCII code / Unicode code etc.) of a  given character:");
	System.out.println("-------------------------------------");
 	System.out.print("Input a character:");
 	  ch=sc.next().charAt(0);	
 	  System.out.println("The ASCII value of "+ch+" is: " +(int)ch); 
  System.out.println("The character for the ASCII value "+(int)ch+" is:"+(char)((int)ch) ); 
}
}