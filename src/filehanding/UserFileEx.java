package filehanding;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserFileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	
		boolean flag=true;//flag=1
		
		while(flag!=false) {//!=0
			
			
			System.out.println("1.Create File");
			System.out.println("2.Read File.");
			System.out.println("3.Write File.");
			System.out.println("4.Delete File");
			System.out.println("5.Exit");
			
			System.out.println("Enter the choice: ");
			int choice=sc.nextInt();//1
			
			switch (choice) {
			case 1: {
				
				System.out.println("Enter the File Name: ");
				String fname=sc.next();//Priya
				
				File fl=new File("D://Others/"+fname+".txt");//D://Others/Priya.txt
				
				if(fl.exists()) {
					System.out.println("File already Exits....!");
				}
				else {
					fl.createNewFile();
					System.out.println("File Created Successfully.");
				}
				
				break;
			}
			case 2: {
				System.out.println("Enter the name to Read the File: ");
				String fname=sc.next();
				FileReader fr=new FileReader("D://Others/"+fname+".txt");

				int i;
				
				while((i=fr.read())!=-1) {
					System.out.print((char)i);
				}
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("Enter the name to Write the File: ");
				String fname=sc.next();				
				FileWriter fw=new FileWriter("D://Others/"+fname+".txt",true);
				
				System.out.println("Enter the Content to write the file: ");
				sc.nextLine();
				String str=sc.nextLine();
				fw.write(str);
				fw.close();
				
				System.out.println("The wrote successfully.");
				
				break;
			}
			case 4: {
				
				System.out.println("Enter the File Name: ");
				String fname=sc.next();
				
				File fl=new File("D://Others/"+fname+".txt");
				
				if(fl.delete()) {
					System.out.println("File Deleted Successfully....");
				}
				else {
					System.out.println("Not Able to Delete the File.!");
				}
				
				break;
			}
			case 5: {
				flag=false;
				continue;
			}
			default:{
				System.out.println("Invalid Input....!");
			}
				
			}
			
			System.out.println("Do you want to continue...yes...or...no");
			String str=sc.next();//yes
			
			if(str.equals("yes")) {//no
				
			}
			else {
				flag=false;
			}
			
		}
		
		System.err.println("Application has been Closed...!");
	}

}
