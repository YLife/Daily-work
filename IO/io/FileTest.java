package io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file =new File("file/test.text");
		if (file.exists()) {
			System.out.println("这个文件不存在！");
		}else {
			file.createNewFile();
			System.out.println("文件创建成功！");
		}
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getClass());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}
}
