import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class max_range_sum {
	private static int[] values;
	private static int max=0;
	
	public static void main (String[] args) throws IOException{
		
		File file = new File("src/test.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
	
		while ((line = in.readLine()) != null){
			int count = Integer.parseInt(line.split(";")[0]); 
 			String[] lineArray = line.split(";")[1].split(" "); 
			
			if (lineArray.length>0){
				
				values = new int [lineArray.length];

				for (int j = 0; j < lineArray.length; j++) {
					values[j] = Integer.parseInt(lineArray[j]);
					//System.out.println(values[j]);
				}

				
				for (int i = 0; i<lineArray.length; i++){
						if(i + count > lineArray.length) break;
						int result = calcGains(i, count+i);
						if (max < result) max = result;
						//System.out.println(max);
					}
					System.out.println(max);
				max=0;
			}
		}
}

	private static int calcGains(int i, int count) {
		int sum = 0;
		//System.out.println("sum: " + sum);
		for(int k=i; k < count && k < values.length; k++){
			sum += values[k];
		}
		return sum < 0 ? 0 : sum;
		
	}


}
