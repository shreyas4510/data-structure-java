import java.util.*;

public class binary_search_linkedList_recursive {
	public static void main (String[] args) {
		LinkedList<Integer> series = new LinkedList<Integer>();
		series.add(1);
		series.add(2);
		series.add(3);
		series.add(4);
		series.add(5);
		
		System.out.println(series);
		System.out.print("Enter the target element : ");
		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();
		scan.close();
		binary_search_linkedList_recursive obj = new binary_search_linkedList_recursive();
		obj.searchFunc(series, target, 0, series.size() - 1);
		
	}
	
	public void searchFunc(LinkedList<Integer> numberList, int target, int first, int last) {
		int mid = (first + last) / 2;
		
		if(first > last) {
			System.out.println("Element not found");
		}
		else if (numberList.get(mid) == target ) {
			System.out.println("Element found at " + mid + " index");
		}
		else if (numberList.get(mid) > target) {
			last = mid - 1;
			searchFunc(numberList, target, first, last);
		}
		else if (numberList.get(mid) < target) {
			first = mid + 1;
			searchFunc(numberList, target, first, last);
		}
	}
}
