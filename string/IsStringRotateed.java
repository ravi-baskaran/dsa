package string;

public class IsStringRotateed {

    public static void main(String[] args) {

        String str1 = "ravibaskaransuper";
        String str2 = "superravibaskaran";

        if (str1.length() != str2.length()) {

            System.out.println("its not rotation");
        }else{
            str1=str1+str2;
            if(str1.contains(str2)){
                System.out.println("yes rotation");
            }else{
                System.out.println("not rotation");
            }
        }

    }



}
