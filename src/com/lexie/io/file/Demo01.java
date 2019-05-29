package com.lexie.io.file;

import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		
		String path="D:\\idea";
		path="D:"+File.separator+"idea";
		
	}
}
