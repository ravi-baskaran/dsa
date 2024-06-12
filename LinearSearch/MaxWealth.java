package LinearSearch;

public class MaxWealth {

	public static void main(String[] args) {
		
		int[][] arr= {
				{1, 2, 4, 6},
				{3, 12, 11},
				{21, 61, 24, 36}
		};	
		
		System.out.println(maxWealth(arr));

	}
	
	static int maxWealth(int[][] acc) {
		
		int max=0;
		
		for(int person =0; person<acc.length; person++) {
			int total=0;
			for(int account=0; account<acc[person].length; account++) {
				total=total+acc[person][account];
			}
			if(total>max) {
				max=total;
			}
		}return max;
		
	}

}
