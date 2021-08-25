import java.util.Scanner;
class FnameLname {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the name in reverse where last name comes first:");
		System.out.println("-------------------------------------");
		System.out.print("Input First Name:");
		String fname = sc.next();
		System.out.print("Input Last Name:");
		String lname = sc.next();

		System.out.println("Name in reverse is:" + lname + " " + fname);
	}
}