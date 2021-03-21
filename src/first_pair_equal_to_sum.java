public class first_pair_equal_to_sum {
	public static void main(String args[]) {
		int arr[] = { 45, 87, 42, 3, 48, 45 };
		int sum = 90;

		first_pair_equal_to_sum obj = new first_pair_equal_to_sum();
		final long startTimeLoop = System.currentTimeMillis();
		obj.pairByLoop(arr, sum, startTimeLoop);
		
		final long startTimeRecursive = System.currentTimeMillis();
		obj.pairByRecursion(arr, sum, startTimeRecursive, 1, 0);
		
	}

	public void pairByLoop(int[] arr, int sum, long startTime) {
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					System.out.println("Pair is : " + arr[i] + " & " + arr[j]);
				}
			}
		}

		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time for loop : " + (endTime - startTime));
	}

	public void pairByRecursion(int[] arr, int sum, long startTime, int iCount, int jCount) {		
		if (arr[iCount-1] == arr[jCount] && jCount == arr.length - 1) {
			final long endTime = System.currentTimeMillis();
			System.out.println("Recursive End time is : " + ( endTime - startTime ));
		}
		else if (iCount == arr.length) {
			jCount++;
			iCount = jCount + 1;
			pairByRecursion(arr, sum, startTime, iCount, jCount);
		}
		else {
			if(arr[jCount] + arr[iCount] == sum ) {
				System.out.println("Pair is : " + arr[jCount] + " & " + arr[iCount]);
			}
			iCount++;
			pairByRecursion(arr, sum, startTime, iCount, jCount);	
		}
	}
}
