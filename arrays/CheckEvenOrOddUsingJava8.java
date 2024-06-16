package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckEvenOrOddUsingJava8 {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8};

        boolean list = Arrays.stream(arr).boxed().allMatch(e -> e%2==0);

        if(list){
            System.out.println("yes div");
        }else{
            System.out.println("no");
        }

    }

}
