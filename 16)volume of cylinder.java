import java.util.Scanner;
class VolumeOfCylinder 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
        System.out.println("Input the radius:");
         double r=s.nextDouble();
         System.out.println("Input the height:");
         double h=s.nextDouble();
      double  volume=((22*r*r*h)/7);
  System.out.println("The volume of Cylinder is: " +volume);
         }
}
