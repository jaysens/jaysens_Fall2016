
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
	
	//???
	public static boolean max(int num1, int num2){
		return num1 > num2;
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
	
	//???
	public static boolean min(int num1, int num2){
		return num1 < num2;
	}
	
	public static double round2(double num){
		num = (int) (num * 1000);
		
		if(num % 10 >= 5){
			num += 10;	
		} else if(num % 10 <= -5){
			num -= 10;
		}
		
		num = (int) (num / 10);
		return (num /= 100.0);
	}
}
