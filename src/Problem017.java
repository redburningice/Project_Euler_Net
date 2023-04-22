import java.util.ArrayList;

public class Problem017 {
	/**
	 If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
	 
	 If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
	 
	 NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
	 The use of "and" when writing out numbers is in compliance with British usage.
	 */
	public static void main( String[] args ) {
		System.out.println( intToWords(521) );
	}
	
	static ArrayList<String> intSeries(int maxInt) {
		ArrayList<String> output = new ArrayList<>();
		for(int i = 1; i <= maxInt; i++) {
			output.add(intToWords(i));
		}
		return output;
	}
	
	static String intToWords(int number) {
		// group number into groups of three (hunderter), starting from the right hand side
		String numberStr = Integer.toString( number );
		ArrayList<String> output = new ArrayList<>();
		int counter = 0;
		for(int i = numberStr.length() - 1; i >= 0; i--) {
			
			
			counter++;
		}
		
		return String.join( " ", output );
	}
	
	static String hunderter(String number) {
		ArrayList<String> output = new ArrayList<>();
		for(int i = 1; i <= number.length(); i++) {
			if ((number.length() - i + 1) % 3 == 0) { // Hunderter
				output.add(einer(number.charAt( i - 1 )) + " hundred");
				if (number.charAt( i ) != '0' && number.charAt( i + 1 ) != '0')
					output.add("and");
			}
			if ((number.length() - i + 1) % 3 == 2) { // Zehner
				if (number.charAt( i-1 ) == '1')
					output.add(zehner(number.charAt( i-1 ), number.charAt( i )));
				
				output.add( zehner( number.charAt( i - 1 ) ) );
			}
			if ((number.length() - i + 1) % 3 == 1) // Einer
				output.add(einer(number.charAt( i - 1 )));
		}
		return String.join(" ", output);
	}
	
	static String einer(char number) {
		switch(number) {
			case '1': return "one";
			case '2': return "two";
			case '3': return "three";
			case '4': return "four";
			case '5': return "five";
			case '6': return "six";
			case '7': return "seven";
			case '8': return "eight";
			case '9': return "nine";
			default: return null;
		}
	}
	
	static String zehner(char zehner, char einer) {
		String number = String.valueOf( zehner ) + String.valueOf(einer);
		switch(number) {
			case "10": return "ten";
			case "11": return "eleven";
			case "12": return "twelve";
			case "13": return "thirteen";
			case "14": return "fourteen";
			case "15": return "fifteen";
			case "16": return "sixteen";
			case "17": return "seventeen";
			case "18": return "eighteen";
			case "19": return "nineteen";
			default: return null;
		}
	}
	
	static String zehner(char zehner) {
		switch(zehner) {
			case '2': return "twenty";
			case '3': return "thirty";
			case '4': return "fourty";
			case '5': return "fifty";
			case '6': return "sixty";
			case '7': return "seventy";
			case '8': return "eighty";
			case '9': return "ninety";
			default: return null;
		}
	}
}
