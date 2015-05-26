import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class minimum_distance {
	
	private static void calcDist(int o, int p, int q, int r, int s) {
		int result ;
		
		result = Math.abs(o-p) + Math.abs(o-q) + Math.abs(o-r) + Math.abs(o-s);
		
		System.out.println(result);
	}
	
	
	public static void main(String[] args) throws IOException{
		
		File file = new File("src/text.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split("\\s") ;
			if (lineArray.length >0) {
				
            	int alice = Integer.parseInt(lineArray[0]);
            	int friend1 = Integer.parseInt(lineArray[1]);
            	int friend2 = Integer.parseInt(lineArray[2]);
            	int friend3 = Integer.parseInt(lineArray[3]);
            	int friend4 = Integer.parseInt(lineArray[4]);
            	
            	calcDist(alice, friend1, friend2, friend3, friend4);
				
				
			}
			
			
			
			
		}
		
	}

}
