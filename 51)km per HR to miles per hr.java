import java.util.Scanner;
class DistanceConversion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double kmph, miph;
		System.out.println("Convert kilometers per hour to miles per hour:");
		System.out.println("-------------------------------------");
		System.out.print("Input the distance in kilometer:");
		kmph = sc.nextFloat();
		miph = (kmph * 0.6213712);
		System.out.println("The " + kmph + " Km./hr. means " + miph + " Miles/hr.");
	}
}
