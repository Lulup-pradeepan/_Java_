package Lab3;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No of Rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the No of cols:");
		int cols=sc.nextInt();
		int[][]matrix=new int [rows][cols];
		int[][]transpose=new int [cols][rows];
		
		System.out.println("Enter the Elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		for(int i=0;i<matrix.length;i++) {	
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j]+"\t");
			}
		}
		System.out.println("Transpose");
		for(int j=0;j<transpose.length;j++) {	
			for(int i=0;i<transpose[i].length;i++) {
				System.out.print(transpose[j][i]+"\t");
			}System.out.println();
		}
	}
}
