import java.util.*;

public class binary_search_array_recursive {
	public static void main (String[] args) {
		int[] series = {1,2,3,4,5};
		Scanner scan = new Scanner(System.in);
		
		int target;
		System.out.print("Target value is : ");
		target = scan.nextInt();
		
		binary_search_array_recursive obj = new binary_search_array_recursive();
		obj.searchFunc(series, target, 0, series.length - 1);
		scan.close();
	}
	
	public void searchFunc(int[] numberList, int target, int first, int last) {
		int mid = (first + last) / 2;
		
		if(first > last) {
			System.out.println("Element not found");
		}
		else if( numberList[mid] == target) {
			System.out.println("Element found at " + mid + " position");
		}
		else if (numberList[mid] > target) {
			last = mid - 1;
			searchFunc(numberList, target, first, last);
		}
		else if (numberList[mid] < target) {
			first = mid + 1;
			searchFunc(numberList, target, first, last);
		}
	}
}
