package com.aditya.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_notFound {
	public static void main(String_Demo[] args) {
		try {
			File file=new File("E://file.txt");
			
			FileReader fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist.");
		}
	}
}
