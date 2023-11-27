package codesignal.cap1_the_journey_begins;

public class CenturyFromYear2 {
	
	public static void main(String[] args) {
		
		// Retorna o século ao qual o ano pertence
		System.out.println(centuryFromYear(2000)); //
        System.out.println(centuryFromYear(1905)); // Output: 20
        System.out.println(centuryFromYear(1700)); // Output: 17
        System.out.println(centuryFromYear(21)); //
        
        System.out.println(centuryFromYear(374)); //
        System.out.println(centuryFromYear(8)); //
        System.out.println(centuryFromYear(100)); //
        System.out.println(centuryFromYear(101)); //
        System.out.println(centuryFromYear(1)); //
	}
	
	static int centuryFromYear(int year) {

		// Se o ano for exatamente divisível por 100, retorna a divisão
        // Caso contrário, retorna a divisão mais 1
		int century = (year % 100 == 0) ? (year / 100) : (year / 100 + 1);
        
        return century;
	}

}
