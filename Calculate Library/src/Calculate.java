
public class Calculate {
	
	public static int square(int num){
		return num * num;
	}
	
	public static int cube(int num){
		return num * num * num;
	}
	
	public static double average(double num1, double num2){
		return (num1 + num2)/2;
	}
	
	public static double average(double num1, double num2, double num3){
		return (num1 + num2 + num3)/3;
	}
	
	public static double toDegrees(double angle){
		return (angle * 180)/3.14159;
	}
	
	public static double toRadians(double angle){
		return (angle * 3.14159)/180;
	}
	
	public static double discriminant(double b, double a, double c){
		return (b * b) - (4 * a * c);
	}
	
	public static String toImproperFrac(int whole, int num, int den){
		return ((whole * den) + num) + "/" + den;
	}
	
	public static String toMixedNum(int num, int den){
		return (num/den) + "_" + (num % den) + "/" + den;
	}
	
	public static String foil(int a, int b, int c, int d, String var){
		return (a * c) + var + "^2 + " + ((a * d) + (b * c)) + var + " + " + (b * d);
	}
	
	public static boolean isDivisibleBy(int num, int den){
		return (num % den == 0);
	}
	
	public static double absValue(double num){
		if(num < 0){
			return num * -1;
		} else {
			return num;
		}
	}

	public static int max(int num1, int num2){
		if(num1 > num2){
			return num1;
		} else {
			return num2;
		}
	}
	
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
	
	public static int min(int num1, int num2){
		if(num1 > num2){
			return num2;
		} else {
			return num1;
		}
	}
	
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
	
	public static double exponent(double num, int exp){
		double cur = 1;
		
		for(int i = 0; i < exp; i++){
			cur *= num;
		}
		return cur;
	}
	
	public static int factorial(int num){
		int factorial = 1;
		for(int i = num; i > 0; i--){
			factorial *= i;
		}
		return factorial;
	}
	
	public static boolean isPrime(int num){
		for(int i  = 2; i < num; i++){
			if(isDivisibleBy(num, i)){
				return false;
			}
		}
		return true;
	}
	
	public static int gcf(int num1, int num2){
		while(num2 != 0){
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		
		return num1;
	}
	
	public static double sqrt(double num){
		double t;
		 
		double squareRoot = num / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (num / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return round2(squareRoot);
	}
}
