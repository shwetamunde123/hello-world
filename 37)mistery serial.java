public class Main {
	public static void main(String[] args) {

 System.out.println( "\n\n Print a mystery series:\n");
	System.out.println( "-------------------------\n");
	System.out.println( " The series are: \n");	
   int nm1 = 1;
   while (true) 
   {
      ++nm1;
      if ((nm1 % 3) == 0) 
      continue;
      if (nm1 == 50) 
      break;
      if ((nm1 % 2) == 0) 
      {
         nm1 += 3;
      } 
      else 
      {
         nm1 -= 3;
      }
      System.out.println( nm1 );
   }
   System.out.println("");
   
}

	}
	