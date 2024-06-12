package string;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		
		String str ="0000021342377";
		
		
		
		///////////////////
		
		String str1 = "";
		
		for(int i =0; i< str.length(); i++) {
			if(str.charAt(i) != '0') {
				str1=str1+str.charAt(i);
			}
		}System.out.println(str1);
		
		/////////////////////
		
		
		
		
		int index =0;
		
		for(int i=0 ;i<str.length();i++) {
			if(str.charAt(i) != '0') {
				index=i;
				break;
			}
		}
		
		String s = str.substring(index);
		System.out.println(s);

	}

}
