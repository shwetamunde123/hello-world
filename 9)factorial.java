public class JavaExample {
    public static void main(String[] args) {

    	
        int n= 10;
        long fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
