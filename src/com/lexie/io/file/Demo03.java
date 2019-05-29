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
			System.out.println("-----------��Ŀ¼|�ļ�file����--------");
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
				System.out.println(createNewFile?"�ɹ�":"ʧ��");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�ļ�����ʧ��");
			}
		}
		boolean delete = src.delete();
		System.out.println(delete?"ɾ���ɹ�":"ʧ��");
		
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
		System.out.println("�ļ��Ƿ���ڣ�"+src.exists());
		System.out.println("�ļ��Ƿ��д��"+src.canWrite());
		if (src.isFile()) {
			System.out.println("�ļ�");
		}else if(src.isDirectory()){
			//�����ڵ�Ĭ��Ϊ�ļ���
			System.out.println("�ļ���");
		}else {
			System.out.println("�ļ�������");
		}
		System.out.println("�Ƿ�Ϊ����·����"+src.isAbsolute());
		System.out.println("���ȣ�"+src.length());
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
