import java.util.*;
class DistancebtPoints {
	public static void main(String args[]) {
		double d, la1, la2, lo1, lo2, er, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the the distance between two points on the surface of earth:");
		System.out.println("-------------------------------------");
		System.out.println("\nInput the latitude of coordinate 1:");
		la1 = sc.nextDouble();
		System.out.println("Input the longitude of coordinate 1:");
		lo1 = sc.nextDouble();
		System.out.println("Input the latitude of coordinate 2:");
		la2 = sc.nextDouble();
		System.out.println("Input the longitude of coordinate 2:");
		lo2 = sc.nextDouble();
		r = 0.01745327; //Pi/180=3.14159/180
		la1 = la1 * r;
		la2 = la2 * r;
		lo1 = lo1 * r;
		lo2 = lo2 * r;
		er = 6371.01; //Kilometers
		d = er * Math.acos((Math.sin(la1) * Math.sin(la2)) + (Math.cos(la1) * Math.cos(la2) * Math.cos(lo1 - lo2)));
		System.out.print("The distance between those points is: " + d);
	}
}