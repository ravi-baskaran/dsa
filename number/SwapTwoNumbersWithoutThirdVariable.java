package number;

public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        int a =15;
        int b= 25;

        a = a+b; //15+25 = 40
        b= a-b; //40-25=15
        a = a-b; // 40-15=25

        System.out.println(a);
        System.out.println(b);

    }
}
