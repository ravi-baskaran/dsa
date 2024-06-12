package learnWithKS;

import java.util.Arrays;

public class RemoveElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9};
		System.out.println(Arrays.toString(removeElement(arr, 5)));

	}
	
	static int[] removeElement(int[] arr, int element) {
		
		int[] newArray = new int[arr.length-1];
		
		int index=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != element) {
				newArray[index] = arr[i];
				index++;
			}
		}return newArray;
		
	}

}
