package codesignal.cap2_edge_of_the_ocean;

public class MatrixElementsSum {

	public static void main(String[] args) {
        // Testes
        int[][] matrix = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
        System.out.println("Result: " + solution(matrix)); // Output: 9
        System.out.println("Result: " + solution(new int[][] {{1,1,1,0}, {0,5,0,1}, {2,1,3,10}})); // Output: 9
        System.out.println("Result: " + solution(new int[][] {{1,1,1}, {2,2,2}, {3,3,3}})); // Output: 18
        System.out.println("Result: " + solution(new int[][] {{0}})); // Output: 0
        
	}

	static int solution(int[][] matrix) {
        int sum =0;
        for(int i =0; i<matrix[0].length;i++) {
            for(int j=0; j<matrix.length;j++) {
                if(matrix[j][i] > 0)
                    sum +=matrix[j][i];
                else
                    break;
            }
        }
        return sum;
	}

}
