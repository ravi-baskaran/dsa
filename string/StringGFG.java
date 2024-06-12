package string;

import java.math.BigInteger;

public class StringGFG {

	public static void main(String[] args) {
		
		String s1 ="3645728284638339";
		String s2 ="2635721838847392";
		
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		
		System.out.println(b1.add(b2));

	}

}
