package recursion;

public class FindPeek {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,7,9,3,1};
		
		System.out.println(findPeek(arr));

	}
	
	static int findPeek(int[] arr) {
		
		int start =0; 
		int end = arr.length-1;
		
		while(start<end) {
			
			int mid = start+(end-start)/2;
			
			if(arr[mid] < arr[mid+1]) {
				start= mid+1;
			}else if(arr[mid] < arr[mid-1]) {
				end=mid;
			}else {
				return start;
			}
			
		}return -1;
		
	}

}
