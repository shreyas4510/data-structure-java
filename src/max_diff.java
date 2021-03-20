
public class max_diff {
	public static void main(String args[]) {
		int[] arr = {1,5,3,9,10,2,11,11};
		int current_max = 0;
		String final_max_pair = "";
		
		for (int i=0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {			
				if(current_max == ( Math.abs( arr[i] - arr[j] ))) {
					final_max_pair = final_max_pair + "," + (arr[i] + " & " + arr[j]);
				}
				
				if(current_max < ( Math.abs(arr[i] - arr[j]) )) {
					final_max_pair = arr[i] + " & " + arr[j];
					current_max = Math.abs(arr[i] - arr[j]);
				}
			}
		}
		
		System.out.println(current_max);
		System.out.println(final_max_pair);
		
	}
}
