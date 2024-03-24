package in.Exception.CheckedEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
QUE:- Why checked exception aslo called as compile time exception, is it occurs
in compile time?
		*/
public class DataReader {
	
	public static void main(String[] args) {
		 
		File file = new File("G:\\Project\\Online Help Desk\\Online Help Desk\\reports");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(br.readLine()!=null) {
				System.out.println(br.readLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			
		}
		
	}

}
