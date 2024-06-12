package recursion;

public class IsPalindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		
	//	System.out.println(isPalindrome(str, 0, str.length()-1));
		
		int[] arr = { 2, 3, 9, 3, 3};
		
		int sum =0;
//		for(int i : arr) {
//			sum = sum+i;
//		}System.out.println(sum);
		
		System.out.println(sumArray(arr, sum, arr.length-1));

	}
	
	
	static int sumArray(int[] arr, int sum, int index) {
		
		if(index < 0) {
			return sum;
		}
		
		return sumArray(arr, sum+arr[index], index-1);
		
	}
	
	
	
	static boolean isPalindrome(String s, int start, int end) {
		
		if(s.charAt(start) != s.charAt(end)) {
			return false;
		}
		if(start==end || start>end) {
			return true;
		}
		
		return isPalindrome(s, start+1, end-1);
		
	}

}
