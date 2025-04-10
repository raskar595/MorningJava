package filehanding;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataTransfer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("D://Others/suraj.txt");
		
		int i;
		String str="";
		
		while((i=fr.read())!=-1) {
			str+=(char)i;
		}
		
		FileWriter fw=new FileWriter("D://Others/Clone.txt");
		
		fw.write(str);
		fw.close();
		System.out.println("Data Transfered Successfully.");
		
	}

}
