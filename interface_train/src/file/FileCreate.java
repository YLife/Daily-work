package file;

import java.io.File;


public class FileCreate {
	public static void main(String[] args) throws Exception {
		File file = new File("files/tecent.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("文件已创建好！");
		}else {
			System.out.println("文件已存在！");
			file.delete();
			System.out.println("文件已删除！");
		}
		
	}
	
}
