package filehanding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		BufferedReader br=new BufferedReader(new FileReader("D://Others/suraj.txt"));
//		
//		System.out.println(br.readLine());
//		br.read();
		
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("D://Others/suraj.txt"));
		
		bw.write("ghjk");
		bw.close();
		
		System.out.println("Data wrote successfully.");
		

	}

}
