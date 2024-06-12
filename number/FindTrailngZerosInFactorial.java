package number;

public class FindTrailngZerosInFactorial {

	public static void main(String[] args) {
		
		int n = 8;
		
		//not working
//		int fact = 1;
//		for(int i=1; i<=n; i++) {
//			fact = fact *i;
//		}System.out.println("fact: " +fact);
//
//		int trail =0;
//		int rem =0;
//		while(fact!=0) {
//			rem = fact%10;
//			if(rem==0) {
//				trail++;
//			}
//			fact=fact/10;
//		}System.out.println(trail);
		
		
		int powOf5 =5;
		int res =0;
		
		while(n>=powOf5) {
			res = res + (n/powOf5);
			powOf5= powOf5*5;
		}
		System.out.println(res);
		
	}

}
