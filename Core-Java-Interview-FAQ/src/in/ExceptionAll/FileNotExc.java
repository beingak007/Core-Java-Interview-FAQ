package in.ExceptionAll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

FileNotFoundException:
==>If we specified file is not existed in the path we will get RE:FNFE
==> It is Checked Exception


 
*/
public class FileNotExc {
	public static void main(String[] args) {
		
			try {
				Scanner sc = new Scanner(new File("akash.txt"));
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage().getBytes());
				
				System.out.println("File Not found");
			}
		
	}

}
