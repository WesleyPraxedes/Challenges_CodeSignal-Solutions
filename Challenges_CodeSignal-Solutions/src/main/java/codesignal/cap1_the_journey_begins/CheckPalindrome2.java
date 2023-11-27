package codesignal.cap1_the_journey_begins;

public class CheckPalindrome2 {
	
	public static void main(String[] checkPalindrome) {
		
        // Exemplos de uso
        System.out.println(isPalindrome("radar"));       // Output: true
        System.out.println(isPalindrome("A man a")); // Output: true
        System.out.println(isPalindrome("hello"));        // Output: false
        System.out.println(isPalindrome("Taco cat"));        // Output: false
	}
	
	static boolean isPalindrome(String inputString) {
	    return inputString.equals(new StringBuilder(inputString).reverse().toString());
	}

}

