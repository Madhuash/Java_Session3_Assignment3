import java.util.*;
class RandomNumber {
   public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      Scanner scan= new Scanner(System.in);
  	  System.out.println("Enter a number to generate Random Numbers till:");
  	
  	  int num=scan.nextInt();
      for (counter = 1; counter <= num; counter++) {
         System.out.println(rnum.nextInt(num));
      }
   }
}

