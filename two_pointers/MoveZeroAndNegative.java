package two_pointers;

import java.util.Arrays;

public class MoveZeroAndNegative {

    public static void main(String[] args) {

        int[] arr = { 2, -3, 45, 12, -33, 23, -9 };

        moveNeg(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveNeg(int[] arr){

        int left =0;
        int right =0;
        for(; right<arr.length; right++){
            if(arr[right] < 1){
                int temp =arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

    }
}
