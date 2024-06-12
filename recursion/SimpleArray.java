package recursion;

public class SimpleArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,6,5,8,7};
		
		//System.out.println(isSorted(arr));
		
		System.out.println(isSortedRecursion(arr, 0));
		
		System.out.println(linearSearchRecursion(arr, 3, 0));

	}
	
	static int linearSearchRecursion(int[] arr, int target, int i) {
		
		if(arr[i] == target) {
			return i;
		}
		if(arr[i] > arr.length-1) {
			return -1;
		}
		return linearSearchRecursion(arr, target, ++i);
		
	}
	
	
	
	static boolean isSortedRecursion(int[] arr, int i) {
		
		if(i == arr.length-1) {
			return true;
		}
		if(arr[i] > arr[i+1]) {
			return false;
		}
		return isSortedRecursion(arr, i+1);
		
	}
	
	
	
	static boolean isSorted(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}return true;
		
	}

}
