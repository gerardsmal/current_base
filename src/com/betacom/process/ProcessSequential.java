package com.betacom.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessSequential {
	public boolean execute() {
		System.out.println("Begin ProcessSquential");
	
		String filePath = "/Users/gerard/projets/corsi/accademy-current/projectBase/src/TestSeq.txt";
		String filePath1 = "/Users/gerard/Downloads/records.txt";
		
		List<String> r = readRecord(filePath);
		
		for(String i:r) {
			System.out.println(i);
		}

		List<String> records = new ArrayList<String>();
		records.add("Record 1");
		records.add("Record 2");
		records.add("Record 3");
		records.add("Record 4");
		records.add("Record 5");
		records.add("Record 6");
		records.add("Record 7");
		records.add("Record 8");
		records.add("Record 9");
			
		
		System.out.println("Records write :" + writeFile(filePath1, records,false));
		
		
		
		return true;
	
	}
	
	/*
	 * Read sequential file record by record  
	 */

	private List<String> readRecord(String path){
		List<String> r = new ArrayList<String>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path))){
			String line = reader.readLine();
			while (line != null) {
				r.add(line);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
		
	}
	
	/*
	 * write file
	 */
	
	private int  writeFile(String path, List<String> records) {
		int num = 0;
		File f = new File(path);
		
		if (f.exists()) {
			System.out.println("File " + path + " exist.");
			f.delete();
		}
		
		FileWriter o = null;

		try {
			o = new FileWriter(f);
			for (String rec:records) {
				o.write(rec + "\n");
				
				num++;
			}
			o.close();


		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return num;
	}
	/*
	 * write sequential file using BufferedWriter
	 * 			mode = true -> extend file
	 *          mode = false -> replace file
	 */
	private int writeFile(String path, List<String> records, boolean mode) {
		int num = 0;		
		BufferedWriter o = null;

		try {
			FileWriter f = new FileWriter(path, mode);
			o = new BufferedWriter(f);
			
			for (String rec:records) {
				o.write(rec);
				o.newLine();
				num++;
			}
			o.flush();  
			o.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		return num;

	}
	
}
