import java.util.Scanner;
public class Student_B {
	public static void main(String[]args) {
		Student x=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		x.name=sc.next();
		System.out.println("Enter the Age:");
		x.age=sc.nextInt();
		x.displayDetails();
	}

}
