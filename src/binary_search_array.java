import java.util.*;
public class binary_search_array {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] number_arr = {1,2,3,4,5,6};
		System.out.print("Enter the target value : ");
		int target = scan.nextInt();
		
		binary_search_array obj = new binary_search_array();
		obj.LoopSearch(number_arr, target);
		scan.close();
	}
	
	public void LoopSearch(int[] number_arr, int target) {
		System.out.println( Arrays.toString(number_arr) );
		System.out.println( "Target element is : " + target );
		int first = 0, last = number_arr.length - 1;
		
		if(number_arr[first] == target) {
			System.out.println("Element found at " + first + " index of array");
		}
		else if(number_arr[last] == target) {
			System.out.println("Element found at " + last + " index of array");
		}
		else {
			boolean flag = true;
			while(flag) {
				int mid = (first + last) / 2;
				if (number_arr[mid] == target) {
					System.out.println("Element found at " + mid + " index of array");
					flag = false;
				}
				else if( number_arr[mid] < target) {
					first = mid + 1;
				}
				else if( number_arr[mid] > target) {
					last = mid - 1;
				}	
				
				if(first > last) {
					System.out.println("Element not found");
					flag = false;
				}
			}
		}
	}	
}
