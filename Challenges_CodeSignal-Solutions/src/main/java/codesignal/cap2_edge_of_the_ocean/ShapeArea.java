package codesignal.cap2_edge_of_the_ocean;

public class ShapeArea {

	public static void main(String[] args) {

		System.out.println(solution(2)); // Output: 5
		System.out.println(solution(3)); // Output: 13
		System.out.println(solution(1)); // Output: 1
		System.out.println(solution(5)); // Output: 41
	}

	static int solution(int n){
	    int num = 1;
	    for(int i = 1; i <= n; i++){
	        num = num + (4 * (i-1));
	    }
	    return num;

	}
}