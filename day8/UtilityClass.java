package com.day8;

import java.util.Date;

public class UtilityClass {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getDay());
		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());


	}

}
