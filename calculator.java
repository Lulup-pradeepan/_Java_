package p1;
import java.util.Scanner;
public class calculator  {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter total units consumed: ");
	        int units = scanner.nextInt();
	        scanner.close();

	        double bill = 0;
	        
	        if (units <= 100) {
	            bill = units * 1.5;
	        } else if (units <= 300) {
	            bill = (100 * 1.5) + (units - 100) * 2.5;
	        } else if (units <= 500) {
	            bill = (100 * 1.5) + (200 * 2.5) + (units - 300) * 4.0;
	        } else {
	            bill = (100 * 1.5) + (200 * 2.5) + (200 * 4.0) + (units - 500) * 6.0;
	        }
	       

	        System.out.println("Electricity Bill: ₹" + bill);
	    }
	}



