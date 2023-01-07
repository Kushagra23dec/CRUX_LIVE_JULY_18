package TimeAndSpace;

public class One {

	public static void main(String[] args) {
//		 long i =0;
//		long start = System.currentTimeMillis();
//		 while(true) {
//			 if(i ==   1000000000000l) {
//				 break;
//			 }
//			 i++;
//		 }
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end-start);
		
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(kadensAlgo(a));
	}
	
	public static int  kadensAlgo(int[] a) {
		int sum = 0,max = Integer.MIN_VALUE;
		for(int i = 0 ; i<a.length; i++) {
			sum +=a[i];
			max = Math.max(sum, max);
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}

}
