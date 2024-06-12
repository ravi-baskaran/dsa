package string;

public class InsertStringIntoAnotherString {

	public static void main(String[] args) {
		
		String str = "Hello world";
		String toInsert= "ravi ";
		
		System.out.println(strAdd(str, toInsert, 5));
		
		////////////////////
		
		StringBuffer newString = new StringBuffer(str);
		
		newString.insert(6, toInsert);
		
		System.out.println(newString.toString());
		//////////////////////////
		
		System.out.println(replace(str, 6));
 
	}
	
	static String replace(String s, int ind) {
		
		char modified ='W';
		
		StringBuffer newString = new StringBuffer(s);
		newString.setCharAt(6, modified);
		return newString.toString();
	}
	
	
	
	
	
	static String strAdd(String org, String add, int index) {
		
		String newString = "";
		for(int i=0; i<org.length(); i++) {
			newString = newString+org.charAt(i);
			
			if(i == index) {
				newString = newString+add;
			}
		}return newString;
		
	}

}
