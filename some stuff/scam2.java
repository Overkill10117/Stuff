import java.util.*;

public class Main
{
  public static void main (String[]args)
  {

    int i = 0;
    Scanner scanner = new Scanner (System.in);
      System.out.println ("Enter a number: choose 2 or 3 or 4 or 5");
      System.out.println ("For a $10000000000 and Enter a number:");
    while (true)
      {
	i = scanner.nextInt ();

	if (i == 2)
	  {
	    System.out.println ("Entered number is 2, you got SCAMMED");
	    break;
	  }
	else if (i == 3)
	  {
	    System.out.println
	      ("Entered number is 3, $20000000000000000000000000000000000000000000 was stolen");
	    break;
	  }
	else if (i == 4)
	  {
	    System.out.println ("Entered number is 4, you got killed");
	    break;
	  }

	else if (i == 5)
	  {
	    System.out.println ("Entered number is 5, you were buried alive");
	    break;
	  }
	else
	  {
	    System.out.println ("Invalid number pls try again");
	  }
      }
    scanner.close ();
  }
}
