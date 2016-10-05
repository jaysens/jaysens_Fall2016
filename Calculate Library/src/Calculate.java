
//@Jaysen Shi
//Math Library
//09/19/16
public class Calculate {
	
	//Squares an integer
	public static int square(int num){
		return num * num;
	}
	
	//Cubes an integer
	public static int cube(int num){
		return num * num * num;
	}
	
	//Returns the average of 2 numbers
	public static double average(double num1, double num2){
		return (num1 + num2)/2;
	}
	
	//Returns the average of 3 numbers
	public static double average(double num1, double num2, double num3){
		return (num1 + num2 + num3)/3;
	}
	
	//Converts radians to degrees
	public static double toDegrees(double angle){
		return (angle * 180)/3.14159;
	}
	
	//Converts degrees to radians
	public static double toRadians(double angle){
		return (angle * 3.14159)/180;
	}
	
	//Calculates the discriminant of a quadratic equation
	public static double discriminant(double a, double b, double c){
		return (b * b) - (4 * a * c);
	}
	
	//Converts a mixed number into an improper fraction
	public static String toImproperFrac(int whole, int num, int den){
		return ((whole * den) + num) + "/" + den;
	}
	
	//Converts an improper fraction into a mixed number
	public static String toMixedNum(int num, int den){
		return (num/den) + "_" + (num % den) + "/" + den;
	}
	
	//Converts a binomial multiplication into a quadratic equation
	public static String foil(int a, int b, int c, int d, String var){
		return (a * c) + var + "^2 + " + ((a * d) + (b * c)) + var + " + " + (b * d);
	}
	
	//Determines whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy(int num, int den){
		if(den == 0){
			throw new IllegalArgumentException("Error: divide by 0");
		}
		return (num % den == 0);
	}
	
	//Returns the absolute value of a number
	public static double absValue(double num){
		if(num < 0){
			return num * -1;
		} else {
			return num;
		}
	}
	
	//Returns the larger of the values passed
	public static int max(int num1, int num2){
		if(num1 > num2){
			return num1;
		} else {
			return num2;
		}
	}
	
	//Returns the largest of the values passed
	public static double max(double num1, double num2, double num3){
		double max;
		if(num1 > num2){
			max = num1;
		} else {
			max = num2;
		}
		if(max > num3){
			return max;
		} else {
			return num3;
		}
	}
	
	//Returns the smaller of the values passed
	public static int min(int num1, int num2){
		if(num1 > num2){
			return num2;
		} else {
			return num1;
		}
	}
	
	//Rounds a number to two decimal places
	public static double round2(double num){
		num = (int) (num * 1000);
		
		if(num % 10 >= 5){
			num += 10;	
		}
		
		if(num % 10 <= -5){
			num -= 10;
		}
		
		num = (int) (num / 10);
		return (num /= 100.0);
	}
	
	//Raises a value to a positive integer power
	public static double exponent(double num, int exp){
		double cur = 1;
		for(int i = 0; i < exp; i++){
			cur *= num;
		}
		return cur;
	}
	
	//Returns the factorial of an integer
	public static int factorial(int num){
		if(num < 0){
			throw new IllegalArgumentException("Error: negative number");
		}
		
		int factorial = 1;
		for(int i = num; i > 0; i--){
			factorial *= i;
		}
		return factorial;
	}
	
	//Determines whether or not an integer is prime
	public static boolean isPrime(int num){
		if(num < 2){
			throw new IllegalArgumentException("Error: Must be greater than 1");
		}
		
		for(int i  = 2; i < num; i++){
			if(isDivisibleBy(num, i)){
				return false;
			}
		}
		return true;
	}
	
	//Returns the greatest common factor of two integers
	public static int gcf(int num1, int num2){	
		while(num2 != 0){
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		
		return num1;
	}
	
	//Returns an approximation of the square root of a number, accurate to two decimal places
	public static double sqrt(double num){
		if(num < 0){
			throw new IllegalArgumentException("Error: negative number");
		}
		
		double a;
		double squareRoot = num / 2;
	 
		do {
			a = squareRoot;
			squareRoot = (a + (num / a)) / 2;
		} while ((a - squareRoot) != 0);
	 
		return round2(squareRoot);
	}
	
	//Approximates the roots of a quadratic equation
	public static String quadForm(int a, int b, int c){
		double disc = discriminant(a, b, c);
		
		if(disc > 0){
			double root1 = (-b + sqrt(disc))/(2 * a);
			double root2 = (-b - sqrt(disc))/(2 * a);
			return round2(root1) + " and " + round2(root2);
		} else if(disc == 0){
			double root = -b/(2 * a);
			return String.valueOf(round2(root));
		} else {
			return "no real roots";
		}
	}
}
