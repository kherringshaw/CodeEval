import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class compare_points {
	
	Scanner sc;
	
	private static void coord(int o, int p, int q, int r) {
		String result ="";
		
		if(p > r) result += "S";
		if(p < r)  result += "N";		
		if(o > q) result += "W";
		if(o < q) result += "E";	
		
		System.out.println(result);
	}
	
	
	public static void main (String[] args) throws IOException{
		
		File file = new File("src/text.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s");
            if (lineArray.length > 0) {
            	
            	int o = Integer.parseInt(lineArray[0]);
            	int p = Integer.parseInt(lineArray[1]);
            	int q = Integer.parseInt(lineArray[2]);
            	int r = Integer.parseInt(lineArray[3]);
            	
            	if(o==q && p==r){
            		System.out.println("here");
            	}
            	
            	else 
            		coord(o,p,q,r);
            
            }
        }
		
		
	}
}
