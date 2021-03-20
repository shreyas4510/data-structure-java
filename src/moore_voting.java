
public class moore_voting {
	public static void main(String args[]) {
		int[] arr = {1,2,1,2,1,2,1};
		int vote = 0, voter = 0;
		
		for(int i=0; i < arr.length; i++) {
			if(vote == 0) {
				voter = arr[i];
			}
			if(voter == arr[i]) {
				vote++;
			}
			else {
				vote--;
			}
		}
		
		int count = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == voter) {
				count++;
			}
		}
		
		if(count > arr.length / 2) {
			System.out.println("Majority element is " + voter + " with occurance " + count);
		}
		else {
			System.out.println("No majority element");
		}
	}
}
