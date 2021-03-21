import java.util.*;

public class binary_sort_linkedList {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("Linked list is : " + list);
		int target;
		System.out.print("Enter the target element : ");
		Scanner scan = new Scanner(System.in);
		target = scan.nextInt();
		scan.close();
		binary_sort_linkedList obj = new binary_sort_linkedList();
		obj.binarySort(list, target);

	}

	public void binarySort(LinkedList<Integer> list, int target) {
		boolean flag = false;
		int first = 0, last = list.size() - 1;

		if (list.get(first) == target) {
			System.out.println("Element found at " + first + " index");
		} else if (list.get(last) == target) {
			System.out.println("Element found at " + last + " index");
		} else {
			while (!flag) {
				int mid = (first + last) / 2;
				if (list.get(mid) == target) {
					flag = true;
					System.out.println("Element found at " + mid + " index");
				} else if (list.get(mid) < target) {
					first = mid + 1;
				} else if (list.get(mid) > target) {
					last = last - 1;
				}

				if (first > last) {
					System.out.println("Element not found");
					flag = true;
				}

			}
		}
	}
}
