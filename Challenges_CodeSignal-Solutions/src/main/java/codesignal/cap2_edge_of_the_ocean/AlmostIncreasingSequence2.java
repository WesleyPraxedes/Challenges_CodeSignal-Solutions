package codesignal.cap2_edge_of_the_ocean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlmostIncreasingSequence2 {

	public static void main(String[] args) {
        // Exemplos de uso
		System.out.println(solution(new int[] {1, 3, 2, 1})); // Output: false
        System.out.println(solution(new int[] {1, 3, 2})); // Output: true
        System.out.println(solution(new int[] {1, 2, 1, 2})); // Output: false
        System.out.println(solution(new int[] {3, 6, 5, 8, 10, 20, 15})); // Output: false
	}

	static boolean solution(int[] sequence) {
	     
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i] - sequence[i+1] >= 0) {
                        numErr += 1;
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1
		       && sequence[i] - sequence[i+2] >= 0
		       && sequence[i-1] - sequence[i+1] >= 0) {
		              return false;
		        }
        }
     }
        return numErr <= 1;
	}

}
