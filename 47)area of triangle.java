import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		double s1, s2, s3, area, S;
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the area of any triangle using Heron's Formula:");
		System.out.println("-------------------------------------");
		System.out.print("Input  length of 1st Side of a Triangle:");
		s1 = sc.nextDouble();
		System.out.print("Input  length of 2nd Side of a Triangle:");
		s2 = sc.nextDouble();
		System.out.print("Input  length of 3rd Side of a Triangle:");
		s3 = sc.nextDouble();
		S = (s1 + s2 + s3) / 2;
		area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
		System.out.format("The Area of the triangle =%.2f\n", area);
	}
}
