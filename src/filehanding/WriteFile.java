package filehanding;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		FileWriter fw=new FileWriter("D://Others/suraj.txt",true);
		
		System.out.println("Enter the Content to write the file: ");
		String str=sc.nextLine();
		fw.write(str);
		fw.close();
		
		System.out.println("The wrote successfully.");
		
	}

}
