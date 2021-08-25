import java.util.Scanner;
class DistanceConversion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float km, met, centi;
		System.out.println("Convert centimeter into meter and kilometer :");
		System.out.println("-------------------------------------");
		System.out.print("Input the distance in centimeter:");
		centi = sc.nextFloat();
		met = (centi / 100);
		km = (centi / 100000);
		System.out.println("The distance in meter is:" + met);
		System.out.println("The distance in kilometer is:" + km);
	}
}