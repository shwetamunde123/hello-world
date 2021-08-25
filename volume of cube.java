import java.util.Scanner;
class VolumeOfCube 
{
     public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
        System.out.println("Input the side of cube:");
            double side=s.nextDouble();
            double  volume=side*side*side;
            System.out.println("The volume of Cube is: " +volume);
      }
} 
