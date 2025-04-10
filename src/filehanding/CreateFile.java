package filehanding;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fl=new File("D://Others/Logipool.txt");
		
		if(fl.exists()) {
			System.out.println("File already Exits....!");
		}
		else {
			fl.createNewFile();
			System.out.println("File Created Successfully.");
		}
		
		System.out.println(fl.canRead());
		System.out.println(fl.canWrite());
		System.out.println(fl.getAbsolutePath());
		
//		System.out.println(fl.delete());
		
	}

}
