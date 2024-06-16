package string;

public class SwapTwoStringWithoutThirdVariable {
    public static void main(String[] args) {

        String s1 = "cloud";
        String s2 = "tech";

        s1 = s1+s2; //cloudtech
        s2 = s1.substring(0, s1.length()-s2.length()); // cloudtech-tech = cloud
        s1=s1.substring(s2.length());

        System.out.println(s1);
        System.out.println(s2);




    }



}
