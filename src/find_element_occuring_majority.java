
public class find_element_occuring_majority {
	public static void main(String args[]) {
		int[] arr = { 1, 1, 2, 2, 2, 2, 7, 8 };
		for(int i=0; i < arr.length/2 ; i++) {
			if( arr[i] == arr[i+3] ) {
				System.out.println("Majority element is " + arr[i]);
			}
		}
	}
}
