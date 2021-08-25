import java.util.Scanner;
class FahrenheitToKelvin {
	public static void main(String args[]) {
		Double kel, far;
		System.out.println("Convert temperature in Fahrenheit  to Kelvin:");
		System.out.println("-------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the temperature in Fahrenheit:");
		far = sc.nextDouble();
		kel = (5.0 / 9) * (far - 32) + 273.15;
		System.out.println("The temperature in Fahrenheit:" + far);
		System.out.println("The temperature in Kelvin:" + kel);
	}
}
