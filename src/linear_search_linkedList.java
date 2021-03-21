import java.util.*;

public class linear_search_linkedList {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		LinkedList<Integer> sequence = new LinkedList<Integer>();
		int target, length;

		length = scan.nextInt();
		target = scan.nextInt();
		
		int i = 0;
		while( i < length ) {
			int a = scan.nextInt();
			sequence.add(a);
			i++;
		}
		System.out.print(sequence);
		scan.close();
		
		for(int j = 0; j < length; j++) {
			if(sequence.get(j) == target) {
				System.out.print("\nItem fount at " + j + " value is - " + sequence.get(j));
				break;
			}
			if(j == length - 1) {
				System.out.print("\nItem not found");
			}
			
		}
	}
}
