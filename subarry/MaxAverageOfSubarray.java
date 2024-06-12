package subarry;

public class MaxAverageOfSubarray {

	public static void main(String[] args) {

		int[] arr = { 1, 12, -5, -6, 50, 3 };
		
		System.out.println(aveSubarray(arr, 4));

	}

	static double aveSubarray(int[] arr, int s) {

		int sum = 0;

		for(int i =0; i< s; i++) {
			sum = sum + arr[i];
		}

		int maxSum = sum;

		int start = 0;
		int end = s;
		while (end < arr.length) {

			sum = sum - arr[start];
			start++;

			sum = sum + arr[end];
			end++;

			maxSum = Math.max(maxSum, sum);

		}
		return (double) maxSum/s;

	}

}
