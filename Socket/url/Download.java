package url;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Download {
	public static void main(String[] args) throws Exception {
		URL url=new URL("http://localhost/data/%E5%85%B1%E4%BA%AB%E7%9B%AE%E5%BD%95/%E5%B8%B8%E7%94%A8jar%E5%8C%85/log4j/log4j.jar");
		InputStream in= url.openStream();
		OutputStream out=new FileOutputStream("file/log4j.jar");
		byte[] cbuf=new byte[1024];
		int len;
		while ((len=in.read(cbuf, 0, cbuf.length))!=-1) {
			out.write(cbuf, 0, len);
			out.flush();
		}
		in.close();
		out.close();
		System.out.println("Download OK £¡");
		
	}
}
