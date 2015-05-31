import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class reverse_words {
	
	public static void main(String[] args) throws IOException{
		
		File file = new File ("src/test.txt");
		BufferedReader sc = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = sc.readLine()) != null){
			
			String[] lineArray = line.split("\\s");
			
			if (lineArray.length>0){

				for (int j = lineArray.length; j > 0; j--) {

					System.out.print(lineArray[j-1]);
					if (j<=lineArray.length)
						System.out.print(" ");
				}	
				System.out.println();	
		}
			else
				System.out.println();
		
	}

}
}
