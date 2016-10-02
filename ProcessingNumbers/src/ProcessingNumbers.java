import java.util.Scanner;

//@Jaysen Shi
//Processing Numbers
//10/02/16
public class ProcessingNumbers {
	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;
	public static int evenSum = 0;
	public static int largestEven = Integer.MIN_VALUE;
	public static int nextNum = 0;
	
	public static void main (String[] args){
		//Gets a string of numbers from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string of numbers, separated by spaces: ");
		String numString = input.nextLine().trim();
		
		int index = 0;
		while(true){
			/*Collects a number, tests it, and removes the number that was just
			 * tested from numString. Allows the program to move on to finding
			 * the next number in the string.
			 */
			if(numString.charAt(index) == ' '){
				String num = numString.substring(0, index);
				nextNum = Integer.valueOf(num);
				numString = numString.substring(index + 1,numString.length());
			
				testNumbers();
				index = 0;
			} else {
				index++;
			}
			
			//Collects the last number of numString, tests it, and exits the while loop
			if(index == numString.length() - 1){
				String num = numString.substring(0);
				nextNum = Integer.valueOf(num);
				
				testNumbers();
				break;
			}
			
		}
		
		//Prints out min, max, evenSum, and largestEven
		System.out.println("min: " + min + " max: " + max);
		System.out.println("Sum of all even numbers: " + evenSum);
		if(largestEven == Integer.MIN_VALUE){
			System.out.println("No largest even.");
		} else{
			System.out.println("Largest even number: " + largestEven);
		}
	}
	
	/*This method compares nextNum to min and max. If nextNum is even, then it is also
	 * compared to largestEven and added to evenSum.
	 */
	public static void testNumbers(){
		if(nextNum%2 == 0){
			if(largestEven < nextNum){
				largestEven = nextNum;
			}
			evenSum += nextNum;
		}
	
		if(max < nextNum){
			max = nextNum;
		} 
		
		if(min > nextNum){
			min = nextNum;
		}
	}
}
