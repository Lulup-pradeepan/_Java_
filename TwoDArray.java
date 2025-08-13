package Lab3;

public class TwoDArray {
	public static void main(String[]args) {
		int[][]matrix= {{1,2,3},
				        {5,6,7,8}};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
