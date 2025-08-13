package Lab3;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[]args) {
		int[]array=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements:");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int num:array) {
			System.out.print(num+"\t");
		}
	}

}
