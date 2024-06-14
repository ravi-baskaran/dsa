package arrays;

import java.util.Arrays;

public class CommonElementsIn3Array {

    public static void main(String[] args) {

        int[] arr1 = {12,3,4,6,7};
        int[] arr2 = {9,6,3,2,12};
        int[] arr3 = {2,6,9,11,12};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

     //  findCommon2(arr1,arr2);

        findCommon3(arr1, arr2, arr3);

    }

    static void findCommon2(int[] arr1, int[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
        while (i < arr1.length && j < arr2.length) {

            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

    }

    static void findCommon3(int[] arr1, int[] arr2, int[] arr3){

        int i=0;
        int j=0;
        int k=0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr3[k]){
                j++;
            }else{
                k++;
            }

        }

    }


}
