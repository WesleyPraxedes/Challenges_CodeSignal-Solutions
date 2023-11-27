package codesignal.cap1_the_journey_begins;

public class CheckPalindrome {
	
	public static void main(String[] checkPalindrome) {
		
        // Exemplos de uso
        System.out.println(isPalindrome("radar"));       // Output: true
        System.out.println(isPalindrome("A man a plan")); // Output: true
        System.out.println(isPalindrome("hello"));        // Output: false
        System.out.println(isPalindrome("Taco cat"));        // Output: true
	}
	
	static boolean isPalindrome(String str) {
		
        // Remover espaços em branco e converter para minúsculas
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        // Inicializar índices para percorrer a string
        int left = 0;
        int right = cleanedStr.length() - 1;

        // Verificar se a string é um palíndromo
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Os caracteres não coincidem, não é um palíndromo
            }
            left++;
            right--;
        }

        return true; // Todos os caracteres coincidiram, é um palíndromo
	}

}
