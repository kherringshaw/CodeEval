public class sum_of_primes {
	static double prime;
	static int[] arr = new int[1000];
	static int x=0;
	static int sum =0;
	
	public static void main(String[] args)	{

		for(int i = 1; i <10000; i++){
			//while (arr[x]==0){
			if ((isPrime(i)) && (arr[x]==0)){
				arr[x]=i;
				//System.out.println(i);
					if(arr[999]!=0) {
						for( int num : arr) {
					          sum = sum+num;
					      }
						System.out.println(sum+1);
						break;
					}
					else x++;
			}
			
			

			//}			
		}
	}

	private static boolean isPrime(int i) {
		
		if (i%2==0) {		
			return false;
		}

		for(int j = 2; j<=Math.sqrt(i); j++){
			if (i%j==0){
			return false;
			}			
		}
		return true;
	}
	




}
