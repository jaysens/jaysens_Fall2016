import java.util.*;

public class ProcessingNumbers {

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string of numbers: ");
		String numString = input.nextLine();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int evenSum = 0;
		int largestEven = Integer.MIN_VALUE;
		int nextNum = 0;
		
		int index = 0;
		while(true){
			if(index == numString.length() - 1){
				String num = numString.substring(0);
				nextNum = Integer.valueOf(num);
				
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
				break;
			}
			
			if(numString.charAt(index) == ' '){
				String num = numString.substring(0, index);
				nextNum = Integer.valueOf(num);
				numString = numString.substring(index + 1,numString.length());
			
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
				index = 0;
			} else {
				index++;
			}
		}
		System.out.println("max: " + max + " min: " + min);
		System.out.println("Sum of all even numbers: " + evenSum);
		if(largestEven == Integer.MIN_VALUE){
			System.out.println("No largest even.");
		} else{
			System.out.println("Largest even number: " + largestEven);
		}
	}
}
