package file;

import java.io.File;


public class FileCreate {
	public static void main(String[] args) throws Exception {
		File file = new File("files/tecent.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("�ļ��Ѵ����ã�");
		}else {
			System.out.println("�ļ��Ѵ��ڣ�");
			file.delete();
			System.out.println("�ļ���ɾ����");
		}
		
	}
	
}
