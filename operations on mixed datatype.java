import java.util.*;
class DataTypeOperations { 
public static void main (String[] args)
{
int M1=7,M2=9;
double D1= 4.5 , D2=9.0;
System.out.println(" Display arithmetic operations with mixed data type" );
System.out.println(" ........................................................");
System.out.println("7+9= "+(M1+M2));
System.out.println(" 4.5+9.0= "+(D1+D2));
System.out.println("7+9.0=" +(M1+D2));
System.out.println(" 7-9= "+(M1-M2));
System.out.println(" 4.5-9.0= "+(D1-D2));
System.out.println(" 7-9.0=" +(M1-D2));
System.out.println("7*9= "+(M1*M2) );
System.out.println(" 4.5*9.0= "+(D1*D2));
System.out.println(" 7*9.0=" +(M1*D2));
System.out.println(" 7/9= "+(M1/M2));
System.out.println( "4.5/9.0= "+(D1/D2));
System.out.println(" 7/9.0=" +(M1/D2));
}
}