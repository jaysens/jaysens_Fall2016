import java.util.Arrays;

//Jaysen Shi
//11/07/16
//ArraysLab3
public class ArraysLab3 {
	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = sum(a1, a2);
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
	
	//accepts two arrays and returns an array with the sum of the two
	public static int[] sum(int[] arr1, int[] arr2){
		int[] sum = new int[arr1.length];
		for(int i = 0; i < sum.length; i++)
			sum[i] = arr1[i] + arr2[i];
		return sum;
	}
	
	//accepts an array and returns a new array with a new element added to the end
	public static int[] append(int[] arr, int num){
		int[] append = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++)
			append[i] = arr[i];
		append[append.length - 1] = num;
		return append;
	}
	
	//accepts an array and returns a new array consisting of all elements of the old
	//array except for the one at idx
	public static int[] remove(int arr[], int idx){
		int[] remove = new int[arr.length - 1];
		int index = 0;
		for(int i = 0; i < arr.length; i++){
			if(i != idx){
				remove[index] = arr[i];
				index++;
			}
		}
		return remove;
	}
	
	//accepts an array and returns an integer containing the sum of the array's even numbers
	public static int sumEven(int arr[]){
		int sumEven = 0;
		for(int i: arr)
			if(i % 2 == 0)
				sumEven += i;
		return sumEven;
	}
	
	//accepts an array and rotates each of its elements one index to the right
	public static void rotateRight(int[] arr){
		int elem1 = arr[arr.length - 1];
		for(int i = arr.length - 1; i > 0; i--){
			arr[i] = arr[i - 1];
		}
		arr[0] = elem1;
	}	
}
