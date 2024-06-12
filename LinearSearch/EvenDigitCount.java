package LinearSearch;

public class EvenDigitCount {

	public static void main(String[] args) {
		
		int[] num = {121, 1, 24, 36, 4, 1311};
		
		System.out.println(findCount(num));

	}

	static int findCount(int[] a) {
		
		int count =0;
	
		for(int arr : a) {
			if(isEven(arr)) {
				count++;
			}
		}
	
		return count;
	}
	

	static boolean isEven(int a) {

		int num = countOfNum(a);
		if(num %2 ==0) {
			return true;
		}
		return false;
	}
	
	
	static int countOfNum(int a) {
		
		int count=0;
		
		while(a> 0) {
			count++;
			a = a/10;
		}
		
		return count;
		
	}
	
	
	

}
