
public class Calculate {
	public static int square(int number) { 
		int answer=0;
		answer = number * number;
		return answer;
		
	}
	
	public static int cube(int number) { 
		return number * number * number;
		
	}
	
	public static double average(double number1, double number2) {
		return (number1 + number2) /2;
		
	}
	
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3) / 2;
		
	}
	
	public static double toDegrees(double radian) {
		return (radian * 180) / 3.14159;
	}
	
	public static double toRadians(double degree) {
		return (degree * 3.14159) / 180;
		
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);
		
	}
	
	public static String toImproperFrac(int number, int numer, int denomin) {
		String answer = "0";
		answer = number * denomin + numer + "/" + denomin;
		return(answer);
	}
	
	public static String toMixedNum(int numer, int denomin) {
		String answer = "0";
		answer = numer + "/" + denomin;
		return(answer);
	}
	
	public static String foil(int a, int b, int c, int d, String string) {
		String answer = "0";
		answer = (a * c) + string + "^2" + "+" + (a * d) + string + "+" + (b * c) + string + "+" + (b * d);
		return(answer);
	}
	
	public static boolean isDivisibleBy(int number, int factor) {
		return(number % factor == 0);
	}
	
	
}
