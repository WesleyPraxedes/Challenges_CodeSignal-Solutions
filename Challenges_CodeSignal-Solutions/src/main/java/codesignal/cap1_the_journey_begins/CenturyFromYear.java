package codesignal.cap1_the_journey_begins;

public class CenturyFromYear {
	
	public static void main(String[] args) {
		System.out.println(centuryFromYear(2000)); //
        System.out.println(centuryFromYear(1905)); // Output: 20
        System.out.println(centuryFromYear(1700)); // Output: 17
        System.out.println(centuryFromYear(21)); // Output: 17

        System.out.println(centuryFromYear(374)); //
        System.out.println(centuryFromYear(8)); //
        System.out.println(centuryFromYear(100)); //
        System.out.println(centuryFromYear(101)); //
        System.out.println(centuryFromYear(1)); //
	}
	
	static int centuryFromYear(int year) {

		int century = (int) Math.ceil((double) year / 100);
		
        return century;
	}

}
