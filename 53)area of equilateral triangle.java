import java.util.Scanner;
class AreaOfEquilateralTriangle {
	public static void main(String args[]) {
		double s, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the area of the Equilateral Triangle :");
		System.out.println("-------------------------------------");
		System.out.print("Input the value of the side of the equilateral triangle:");
		s = sc.nextFloat();
		area = Math.sqrt(3) / 4 * (s * s);
		System.out.println("The area of equilateral triangle is: " + area);
	}
}
