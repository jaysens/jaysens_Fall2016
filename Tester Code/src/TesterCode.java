import java.util.Arrays;

public class TesterCode {

	public static void main(String[] args) {
		int min = 6;
		int max = 9;
		int range = max - min;
		int[] odds;
		
		if(max%2 != 0 || min%2 != 0){
			odds = new int[(range/2) + 1];
		} else {
			odds = new int[range/2];
		}
		int idx = 0;
		for(int i = min; i <= max; i++){
			if(i%2 != 0){
				odds[idx] += i;
				idx++;
			}
		}
		System.out.print(Arrays.toString(odds));
	}

}
