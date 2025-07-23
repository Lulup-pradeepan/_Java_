import java.util.Scanner;
public class Grade {
	public static void main(String[]args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the Mark:");
		int mark=n.nextInt();
		if(mark>=90) {
			System.out.println("Grade A");
		}
		else if(mark>=75) {
			System.out.println("Grade B");
		}
		else if(mark>=60) {
			System.out.println("Grade C");
		}
		else if(mark>=40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
