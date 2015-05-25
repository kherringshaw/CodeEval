import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;





class swap_numbers {
public static void main (String[] args) {

    try {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s");
            if (lineArray.length > 0) {

            	
            	for(int j = 0; j<lineArray.length; j++){            		
            		String word = lineArray[j];
            		int len = word.length();
            		System.out.print(word.charAt(len-1) +""+ word.replaceAll("[^a-zA-Z]","")+"" + word.charAt(0) + " ");
            	}
            	System.out.println();

            } 
        }
    } catch (IOException e) {
        System.out.println("File Read Error: " + e.getMessage());
    }               
}


}





/**


class swap_numbers {

	    public static void main(String[] args) throws IOException {

	        Scanner s = null;
	        try {
	        	
	        	File file = new File(args[0]);
	            //s = new Scanner(new BufferedReader(new FileReader("src/text.txt")));

	            while (file.hasNextLine()){
	            	String line = s.nextLine();	            	
	            	Scanner lineScanner = new Scanner(line);
	            	
	            	while (lineScanner.hasNext()){
	            		String i = lineScanner.next();
	            		int len = i.length();
	            		System.out.print(i.charAt(len-1) +""+ i.replaceAll("[^a-zA-Z]","")+"" + i.charAt(0) + " ");
	            	}
	            	lineScanner.close();
	            	System.out.println();	            
	            }

	        } finally {
	            if (s != null) {
	                s.close();
	            }
	        }
	    }
	}*/
