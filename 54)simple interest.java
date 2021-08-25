import java.util.Scanner;
class SimpleInterest {
	public static void main(String args[]) {
		int p, r, t, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the Simple Interest:");
		System.out.println("-------------------------------------");
		System.out.print("Input the Principle:");
		p = sc.nextInt();
		System.out.print("Input the Rate of Interest:");
		r = sc.nextInt();
		System.out.print("Input the Time:");
		t = sc.nextInt();
		i = (p * r * t) / 100;
		System.out.println("The Simple interest for the amount " + p + " for " + t + " years at the rate " + r + " % is:" + i);
	}
}
