package arrays;

import java.util.Arrays;

public class PosAndNegCount {
    public static void main(String[] args) {

        int[] arr = { -1, 3, 9, -13, 22, -25, 27 };

        Arrays.stream(arr).boxed().filter(e -> e > 1).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(arr).boxed().filter(e -> e < 1).forEach(e -> System.out.print(e + " "));
        System.out.println();
        int postitiveCount =0;
        int negCount =0;
        for(int n : arr){
            if(n > 1){
                postitiveCount++;
            }else{
                negCount++;
            }
        }
        System.out.println("pos: " +postitiveCount);
        System.out.println("neg: " +negCount);

    }
}
