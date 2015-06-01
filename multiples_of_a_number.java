import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class multiples_of_a_number {
	
	public static void main(String[] args) throws IOException{
		File file = new File("src/text.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = in.readLine()) != null){
		String[] stringArray = line.split(",");
		int[] nums = new int[stringArray.length];

			int x = Integer.parseInt(stringArray[0]);
			int n = Integer.parseInt(stringArray[1]);
			System.out.println(checkMultiple(x, n));

			
		}
		
		
	}

	private static int checkMultiple(int x, int n) {
		for (int i = 1; i < 1000; i++){
			if ((n*i)<x)
			continue;
			
			else
				return (n*i);
				
		}
		return (0);


		
	}

}
