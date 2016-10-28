//Jaysen Shi
//String Split
//10/27/16
import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
		
		
		System.out.println(sandwichContent("applesbread frogsbread dirt   mudbread"));
		
		System.out.println(sandwichContentSpaces("applesbread frogsbread dirt   mudbread"));
		
		System.out.println(sandwichContent("breadapplesbreadcheesechocolatebreadtomatoes"));
		
		System.out.println(sandwichContentSpaces("bread apples bread cheese chocolate bread tomatoes"));
		
	}
	
	
	//Task pt 1 - returns a string containing the ingredients in a sandwich
	public static String sandwichContent(String ingredients){
		boolean isSandwich = false;
		String sandwichTest = ingredients;
		/* The double if statements check whether there are at least two slices of bread in the
		 * string. If there are indeed 2 slices(or more), then the string contains a sandwich 
		 * and isSandwich is set to true.
		 * Otherwise, there is no sandwich in the string and boolean isSandwich remains false.
		 */
		if(sandwichTest.contains("bread")){
			sandwichTest = sandwichTest.substring(sandwichTest.indexOf("bread") + 5, 
														sandwichTest.length());
			if(sandwichTest.contains("bread")){
				isSandwich = true;
			}
		}
		
		/* If there's a sandwich, then the program returns what's in between the slices of bread.
		 * For fancy sandwiches with more than 2 slices of bread, the layers are separated by 
		 * commas.
		 */
		if(isSandwich){
			/* A string(doesn't matter what it says) is added to the end of String ingredients. 
			 * Without performing this step, the code would not work for a string input ending
			 * with the word "bread".
			 */
			ingredients = ingredients + "wythljky";
			String[] sandwichArr = ingredients.split("bread");
			
			/*Reassigning sandwichArr to a shorter copy of itself; the ingredients outside of 
			 * the sandwich have been left out of this new array.
			 */
			sandwichArr = Arrays.copyOfRange(sandwichArr, 1, sandwichArr.length - 1);
			
			String content = "";
			for(int i = 0; i < sandwichArr.length - 1; i++){
				content += sandwichArr[i] + ", ";
			}
			content += sandwichArr[sandwichArr.length - 1];
			return content;
			
		//If there's no sandwich, then the user is notified about this.
		} else {
			return "Not a sandwich.";
		}
	}
	
	//Task pt 2 - this time with spaces
	public static String sandwichContentSpaces(String ingredients){
		/* String sandWichString is simply String ingredients reformatted to be more compatible
		 * with the method sandwichContent. Key difference: no spaces in sandwichString
		 */
		String[] sandwichArr = ingredients.split(" ");
		String sandwichString = "";
		for(int i = 0; i < sandwichArr.length; i++){
			sandwichString += sandwichArr[i];
		}
		
		// sandwichString is plugged into the method sandwichContent to avoid having to 
		//rewrite the exact same code twice.
		return sandwichContent(sandwichString);
	}
}
