package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterTEST {
	public static void main(String[] args) throws IOException {
		// �����ֽ���
		OutputStream out = new FileOutputStream("file/test.text");
		// ��װΪ�ַ���
		Writer writer = new OutputStreamWriter(out);
		// д
		writer.write("���ͶӰ�Ǻ��������!��ȥ����!");
		writer.flush();
		// �ر���
		writer.close();
		System.out.println("ok");
	}
}
