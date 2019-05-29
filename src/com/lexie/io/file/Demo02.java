package com.lexie.io.file;

import java.io.File;

public class Demo02 {
	public static void main(String[] args) {
		String parentPath="D:/java/jar";
		String name="hibernate_jar";
		
		File src =new File(parentPath,name);
		src =new File(new File(parentPath),name);
		
		
		System.out.println(src.getName());
		System.out.println(src.getPath());
		
		
		src =new File("D:/java/jar/hibernate_jar");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		
		src=new File("test.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
	}
}
