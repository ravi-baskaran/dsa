package binarySearch;

public class SmallestLetter {

	public static void main(String[] args) {
		
		char[] letters = {'c', 'f', 'j'};
		
		System.out.println(smallLetter(letters, 'j'));

	}
	
	static char smallLetter(char[] letters, char target) {
		
		int start = 0;
		int end =letters.length-1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(target>mid) {
				start= mid+1;
			}else
				end=mid-1;
			
		}return letters[start%letters.length];
		
		
		
		
	}
}
