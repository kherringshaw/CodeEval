import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;


public class bit_positions {
	
	public static void main(String[] args) throws IOException{
		File file = new File("src/text.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
        
		
		while((line = in.readLine()) != null){
			String[] stringArray = line.split(",");
		
			int binary = Integer.parseInt(stringArray[0]);
			int p1 = Integer.parseInt(stringArray[1]);
			int p2 = Integer.parseInt(stringArray[2]);
			
			System.out.println(checkBinaryPosition(binary, p1, p2));
		}
		
	}

	
	private static boolean checkBinaryPosition(int binary, int p1, int p2) {
		
		boolean bit1 = (binary & (0x1 << (p1-1))) == 0;
		boolean bit2 = (binary & (0x1 << (p2-1))) == 0;
		//System.out.println("binary: " + binary);
		//System.out.println("bit1:  (0x1 << (p1-1)): " + (0x1 << (p1-1)));
		//System.out.println("bit2:  (0x1 << (p2-1)): " + (0x1 << (p2-1)));
		//System.out.println("bit1: (binary & (0x1 << (p1-1))): " + (binary & (0x1 << (p1-1))));
		//System.out.println("bit2: (binary & (0x1 << (p2-1))): " + (binary & (0x1 << (p2-1))));
		//System.out.println("bit1: "+bit1);
		//System.out.println("bit2: "+bit2);	
		//boolean same_bits = (binary<<(p1-1)) == (binary<<(p1-2)) ;
		//return same_bits;
		//boolean same_bits = (((binary >> p1) & 1) == ((binary >> p2) & 1));
		return bit1==bit2;
	}



}
