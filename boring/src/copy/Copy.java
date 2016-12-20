package copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Copy {
	public static void main(String[] args) throws Exception {
		File source = new File("file2/train.txt");
		File dest = new File("file1/train.txt");
		InputStream in = new FileInputStream(source);
		InputStreamReader reader = new InputStreamReader(in);
		OutputStream out = new FileOutputStream(dest);
		OutputStreamWriter writer = new OutputStreamWriter(out);
		char[] cbuf = new char[1024];
		int len;
		while ((len=reader.read(cbuf, 0, cbuf.length))!=-1) {
			writer.write(cbuf, 0, len);
			writer.flush();
		}
		reader.close();
		writer.close();
		System.out.println("OK");
	}
}
