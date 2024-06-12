package number;

public class Fibo {
	

	public static void main(String[] args) {
		
//		int a =0;
//		int b=1;
//		System.out.print(a+ " " + b);
//		
//		for (int i=2; i<=10; i++) {
//			int c=a+b;
//			System.out.print(" " + c);
//			a=b;
//			b=c;
//		}
//		System.out.println();
		int a =0;
		int b=1;
		
		int count =10;
		
		System.out.print(a + " " + b);
		
		fiboWithRecursion(count -2, a, b);

	}
	
	static void fiboWithRecursion(int count, int a, int b) {
		
		if(count>0) {
			
			int c=a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
			fiboWithRecursion(count-1,a,b);
			
		}
			
		
	}

}
