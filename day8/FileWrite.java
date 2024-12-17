package com.day8;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;


public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\New folder12\\file.txt");
		FileWriter fw = new FileWriter("C:\\New folder12\\file2.txt");
		int ch;
		while((ch = fr.read())  != -1 ){
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");
	}

}




