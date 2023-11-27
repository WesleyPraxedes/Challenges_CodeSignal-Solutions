package codesignal.cap2_edge_of_the_ocean;

public class adjacentElementsProduct {

	public static void main(String[] args) {

		System.out.println(solution(new int[] { 3, 6, -2, -5, 7, 3 })); // Output: 21
		System.out.println(solution(new int[] { -1, -2 })); // Output: 2
		System.out.println(solution(new int[] { 5, 1, 2, 3, 1, 4 })); // Output:6
		System.out.println(solution(new int[] { 1, 2, 3, 0 })); // Output: 6
	}

	static int solution(int[] inputArray) {
		
		// Inicializa o produto como o produto do primeiro par de elementos
        int produto = inputArray[0] * inputArray[1];

        // Itera sobre o array, calculando o produto de elementos adjacentes
        for (int i = 1; i < inputArray.length - 1; i++) {
            int produtoAtual = inputArray[i] * inputArray[i + 1];
            if (produtoAtual > produto) {
                produto = produtoAtual;
            }
        }

        return produto;

	}
}
