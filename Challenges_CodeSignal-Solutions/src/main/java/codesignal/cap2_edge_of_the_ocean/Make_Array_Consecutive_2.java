package codesignal.cap2_edge_of_the_ocean;

import java.util.Arrays;

public class Make_Array_Consecutive_2 {

	public static void main(String[] args) {
        // Exemplos de uso
		System.out.println(solution(new int[] {6, 2, 3, 8})); // Output: 3
        System.out.println(solution(new int[] {0, 3})); // Output: 2
        System.out.println(solution(new int[] {5, 4, 6})); // Output: 0
        System.out.println(solution(new int[] {5, 3, 1})); // Output: 2
	}

	static int solution(int[] statues) {
		
		 int count =0;
		  Arrays.sort(statues);
		  for(int i=1;i<statues.length;i++){
		      count+=statues[i]-statues[i-1]-1;
		  }
		  return count;
	}

}
