import java.util.Scanner;
class CompoundInterest {
	public static void main(String args[]) {
		double p, r, t, cp, ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the Compound Interest :");
		System.out.println("-------------------------------------");
		System.out.print("Input the Principle:");
		p = sc.nextFloat();
		System.out.print("Input the Rate of Interest:");
		r = sc.nextFloat();
		System.out.print("Input the Time:");
		t = sc.nextFloat();
		ci = p * Math.pow((1 + r / 100), t) - p;
		cp = p * Math.pow((1 + r / 100), t);
		System.out.println("The Interest after compounded for the amount " + p + " for " + t + " years at the rate " + r + " % is:" + ci);
		System.out.print("The total amount after compounded for the amount " + p + " for " + t + " years at the rate " + r + " % is:" + cp);
	}
}
