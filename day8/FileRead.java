package com.day8;

import java.io.IOException;
import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\New folder12\\file.txt");
		int ch;
		while((ch = fr.read())  != -1 ){
			System.out.print((char)ch);
		}
		fr.close();
	}

}
