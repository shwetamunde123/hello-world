import java.util.Scanner;
class Circle {
	public static void main(String args[]) {
		float radius;
		double area, circum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the area and circumference of any circle :");
		System.out.println("-------------------------------------");
		System.out.println("Input the radius(1/2 of diameter) of a circle :");
		radius = sc.nextInt();
		circum = 2 * 3.14 * radius;
		area = 3.14 * (radius * radius);
		System.out.println("The area of the circle is :" + area);
		System.out.println("The circumference of the circle is :" + circum);
	}
}
