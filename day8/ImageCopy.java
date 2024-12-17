package com.day8;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\New folder12\\download.jpg") ;
		FileOutputStream fo = new FileOutputStream("C:\\New folder12\\download1.jpg") ;
		int ch;
		while((ch = fi.read())  != -1 ){
			fo.write(ch);
		}
		fi.close();
		fo.close();
		System.out.println("Image Copied");
	}

}


