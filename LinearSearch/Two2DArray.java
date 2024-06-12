package LinearSearch;

import java.util.Arrays;

public class Two2DArray {
	
	/*
	 * search an element in array
	 * find max/min array
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int[][] arr= {
				{1, 2, 4, 6},
				{3, 12, 11},
				{21, 61, 24, 36}
		};	
		
//		int[] result = findElement(arr, 36);
//		System.out.println(Arrays.toString(result));
		
		System.out.println(maxInarr(arr));

	}
	
	static int[] findElement(int[][] a, int target) {
		
		for(int row =0; row<a.length; row++) {
			for(int col=0; col < a[row].length; col++) {
				if(a[row][col] == target) {
					return new int[] {row, col};
				}
			}
		}return new int[] {-1, -1};
		
	}
	
	static int maxInarr(int[][] a) {
		int max = a[0][0];
		
		for(int row=0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				if(a[row][col] > max) {
					max = a[row][col];
				}
			}
		}return max;
		
	}
	
	

}
