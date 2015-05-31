
public class largest_prime_palindrome {
	static double prime;
	
	public static void main(String[] args)	{
		//System.out.println("test");
		for(int i = 1000; i >0; i--){	
			//System.out.println(i);
			if (isPrime(i)){
				//System.out.println(i);
				String s2 = String.valueOf(i);
				if(isPal(s2)){
					System.out.println(s2);
				break;}
			}			
		}
	}

	private static boolean isPrime(int i) {
		
		if (i%2==0) {		
			return false;
		}

		for(int j = 2; j<500; j++){
			if (i%j==0){
			return false;
			}			
		}
		return true;
	}
	
    public static boolean isPal(String s2)
    {
        if(s2.length() == 0 || s2.length() == 1){
   
            return true; 
            
        }
        
        if(s2.charAt(0) == s2.charAt(s2.length()-1))
            return isPal(s2.substring(1, s2.length()-1));

        return false;
    }



}
