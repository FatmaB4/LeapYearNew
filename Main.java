
import java.util.*;

public class Main
{
	public static void main( String args[] )
	{		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		if(LeapYearNew.isLeapYear(year)==false){
      System.out.println(year+" is NOT a leap year.");
    }
    else{
       System.out.println(year+" is a leap year.");
    }
	}
}