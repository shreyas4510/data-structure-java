import java.util.HashSet;

public class find_pair_equal_to_sum_hash {
	public static void main(String args[]) {
		HashSet<Integer> arr = new HashSet<Integer>();
		int[] numbers = { 45, 26, 65, 84, 12, 35 };
		int sum = 110;

		find_pair_equal_to_sum_hash obj = new find_pair_equal_to_sum_hash();
		final long startTime = System.currentTimeMillis();
		obj.findPairByLoop(numbers, sum, arr, startTime);

		int count = 0;
		arr = new HashSet<Integer>();
		obj.findPairByRecursion(numbers, sum, arr, count, startTime);
	}

	public void findPairByLoop(int[] arr, int sum, HashSet<Integer> hash, long startTime) {
		for (int i : arr) {
			if (hash.contains(sum - i)) {
				System.out.println("Pair is : " + i + " & " + (sum - i));
			}
			hash.add(i);
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Time is : " + (endTime - startTime));
	}

	public void findPairByRecursion(int[] arr, int sum, HashSet<Integer> hash, int count, long startTime) {
		
		hash.add(arr[count]);
		if(count == arr.length - 1) {
			final long endTime = System.currentTimeMillis();
			System.out.println("Time is " + (endTime - startTime));
		}
		else if (hash.contains(sum - arr[count])) {
			count++;
			System.out.println("Pair is " + arr[count] + " & " + (sum - arr[count]));
			findPairByRecursion(arr, sum, hash, count++, startTime);
		} else {
			count++;
			findPairByRecursion(arr, sum, hash, count++, startTime);
		}		
	}
}
