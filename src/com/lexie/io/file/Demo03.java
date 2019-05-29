package com.lexie.io.file;

import java.io.File;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) {
		test5();
	}

	private static void test5() {
		// TODO Auto-generated method stub
		String path="D:/java/jar";
		File parent =new File(path);
		printName(parent);
	}
	private static void printName(File src) {
		// TODO Auto-generated method stub
		if (null==src||!src.exists()) {
			return ;
		}
		System.out.println(src.getAbsolutePath());
		if (src.isDirectory()) {
			for (File sub : src.listFiles()) {
				printName(sub);
			}
		}
		
		
	}
	private static void test4() {
		// TODO Auto-generated method stub
		
		  String path="D:/java/jar";
		  File src=new File(path);
		  
		  
		/* src.mkdirs(); */
		  if (src.isDirectory()) {
			String[] sbuNames=src.list();
			for (String name : sbuNames) {
				System.out.println(name);
			}
			System.out.println("-----------子目录|文件file对象--------");
			File[] subFile=src.listFiles();
			for (File file : subFile) {
				System.out.println(file.getAbsolutePath());
			}
		}
		 
		
	}

	private static void test3() {
		// TODO Auto-generated method stub
		String path="D:/java/jar/100.jpg";
		File src=new File(path);
		if (!src.exists()) {
			try {
				boolean createNewFile = src.createNewFile();
				System.out.println(createNewFile?"成功":"失败");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("文件操作失败");
			}
		}
		boolean delete = src.delete();
		System.out.println(delete?"删除成功":"失败");
		
		try {
			File temp = File.createTempFile("tes", ".temp",new File("D:/java"));
			
			Thread.sleep(1000);
			temp.deleteOnExit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void test2() {
		// TODO Auto-generated method stub
		File src =new File("D:/java/jar/smart.jar");
		System.out.println("文件是否存在："+src.exists());
		System.out.println("文件是否可写："+src.canWrite());
		if (src.isFile()) {
			System.out.println("文件");
		}else if(src.isDirectory()){
			//不存在的默认为文件夹
			System.out.println("文件夹");
		}else {
			System.out.println("文件不存在");
		}
		System.out.println("是否为绝对路径："+src.isAbsolute());
		System.out.println("长度："+src.length());
	}

	private static void test1() {
		// TODO Auto-generated method stub
		File src =new File("D:/java/jar/hibernate_jar");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getParent());
	}
}
