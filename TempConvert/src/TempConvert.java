import java.util.Scanner;

//@Jaysen Shi
// Temperature Conversion
// 8/30/16
public class TempConvert {
	public static void main(String[] args) {
		System.out.println("This program can convert from Celsius to Fahrenheit, and vice versa.");
		
		Scanner tempReader = new Scanner(System.in);
		System.out.println("Press f to convert TO Fahrenheit, c to convert TO Celsius:");
		char tempScale = tempReader.next().charAt(0);
		
		//User chooses to convert to fahrenheit
		if(tempScale == 'f'){
			System.out.println("Enter the celsius value you want converted: ");
			double celsiusValue = tempReader.nextDouble();
			double fahrenheitValue = (9.0/5.0 * celsiusValue) + 32;
			
			//Setting lower bound
			if(fahrenheitValue <= -459.67){
				throw new IllegalArgumentException("Error: Below Absolute Zero");
			}
			System.out.println(fahrenheitValue + " degrees fahrenheit");
			
		//User chooses to convert to celsius
		} else if (tempScale == 'c'){
			System.out.println("Enter the fahrenheit value you want converted: ");
			double fahrenheitValue = tempReader.nextDouble(); 
			double celsiusValue = (5.0/9.0) * (fahrenheitValue - 32);
			
			//Setting lower bound
			if(celsiusValue <= -273.15){
				throw new IllegalArgumentException("Error: Below Absolute Zero");
			}
			System.out.println(celsiusValue + " degrees celsius");
			
		//User enters neither 'f' nor 'c'	
		} else {
			throw new IllegalArgumentException("Not A temperature scale!");
		}
	}
}
