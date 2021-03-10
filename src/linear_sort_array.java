import java.util.*;

public class linear_sort_array {
	public static void main(String args[]) {
		int arr[], len, find_element;
		Scanner scan = new Scanner(System.in);
		System.out.println("What will be the length of array ?? ");
		len = scan.nextInt();
		arr = new int[len];
		for(int i = 0; i < len; i++) {
			System.out.print((i + 1) + " : ");
			arr[i] = scan.nextInt();
		}
		System.out.print(Arrays.toString(arr));
		
		System.out.print("\nEnter the element you want to find : ");
		find_element = scan.nextInt();
		scan.close();
		
		for(int i = 0; i < arr.length; i++) {
			if(find_element == arr[i]) {
				System.out.print("\nElement found at index " + i + " value is " + arr[i]);
				break;
			}
			if(i == arr.length - 1 ) {
				System.out.print("Element not found");
			}
		}
	}
}
