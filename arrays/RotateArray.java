package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotateArray {

	public static void main(String[] args) {
		
		int r =3;
		
		int[] arr = {2,5,3,6,8,13,4};
		
		int[] arr1 = {12,10,11};
		
		
		int[] temp = new int[arr.length];
		
		int j=0;
		for(int i =3; i<arr.length; i++) {
			temp[j] = arr[i];
			j++;
		}
		for(int i=0; i<r; i++) {
			temp[j] = arr[i];
			j++;
		}
		
//		for(int i =0; i< arr.length; i++) {
//			arr[i] = temp[i];
//		}
		
		System.out.println(Arrays.toString(temp));

	}
	
	
	
	

}
