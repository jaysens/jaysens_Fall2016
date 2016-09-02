import java.util.Scanner;

//@Jaysen Shi
// Temperature Conversion
// 8/30/16
public class TempConvert {
	public static void main(String[] args) {
		System.out.println("This program can convert Celsius to Fahrenheit, and vice versa.");
		
		Scanner tempReader = new Scanner(System.in);
		System.out.println("Press f to convert TO Fahrenheit, c to convert TO Celsius:");
		char scale = tempReader.next().charAt(0);
		
		if(scale == 'f'){
			Scanner cReader = new Scanner(System.in);
			System.out.println("Enter the celsius value you want converted: ");
			double cValue = cReader.nextDouble();
			
			double fValue = (9.0/5.0 * cValue) + 32;
			if(fValue >= -459.67){
				System.out.println(fValue + " degrees fahrenheit");
			} else {
				System.out.println("Error: Below Absolute Zero");
			}
		} else if (scale == 'c'){
			Scanner fReader = new Scanner(System.in);
			System.out.println("Enter the fahrenheit value you want converted: ");
			double fValue = fReader.nextDouble();
			
			double cValue = (5.0/9.0) * (fValue - 32);
			if(cValue >= -273.15){
				System.out.println(cValue + " degrees celsius");
			} else {
				System.out.println("Error: Below Absolute Zero");
			}
		} else {
			System.out.println("Not A temperature scale!");
		}
	}
}