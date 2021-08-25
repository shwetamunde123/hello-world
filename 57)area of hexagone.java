import java.util.*;
class AreaOfHexagon {
	public static void main(String args[]) {
		double area, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the area of a hexagon:");
		System.out.println("-------------------------------------");
		System.out.print("Input the side of the hexagon:");
		s = sc.nextDouble();
		area = (6 * (s * s)) / (4 * Math.tan(Math.PI/ 6));
		System.out.println("The area of the hexagon is:" + area);
	}
}
