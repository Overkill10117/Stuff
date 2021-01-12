import java.util.*;

public class Main
{

  public static void main (String[]args)
  {
    int i = 0;
    Scanner scanner = new Scanner (System.in);
      System.out.println ("Enter a number:choose 2 or 3");
      System.out.println ("For a $10000000000 and Enter a number:");
      i = scanner.nextInt ();

    if (i == 2)
      {
	System.out.println ("Entered number is 2, you got SCAMMED");
      }
    else
      {
	System.out.
	  println
	  ("Entered number is 3, $20000000000000000000000000000000000000000000 was stolen");

      }
    scanner.close ();
  }
}
