package arrays;

import java.util.Arrays;

public class InsertNewElement {

	public static void main(String[] args) {
	
		int[] arr = new int[5];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 40;
		arr[3]= 50;
		
	insert(arr);
	System.out.println(Arrays.toString(arr));
	
	int[] arrr = {2,4,1,5,7,8};
	rv(arrr);
	System.out.println(Arrays.toString(arrr));
	}
	
	static void rv(int[] arr) {
//		for(int i =arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}
		int start =0;
		int end = arr.length-1;
		for(int i=start; i<end; i++ ) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		
	}
	
	static void insert(int[] arr) {
		
		int pos =1;
		int val =15;
		
		for(int i =arr.length-1; i>pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos] = val;
	}

}
