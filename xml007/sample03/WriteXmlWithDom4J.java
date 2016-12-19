package sample03;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
/*
 * 使用dom4j生成并保存xml
 */
public class WriteXmlWithDom4J {
	public static void main(String[] args) throws Exception {
		// 这是JAVA程序中的数据
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三", 24));
		list.add(new Student("李四", 22));
		list.add(new Student("李小四", 13));

		// 创建文档树
		Document doc = DocumentHelper.createDocument();
		// 创建根节点
		Element root = doc.addElement("students");
		// 创建子节点
		for (Student stu : list) {
			root.addElement("student").addAttribute("name", stu.getName())
					.addAttribute("age", String.valueOf(stu.getAge()));

		}
		// 输出到文件
		OutputFormat fmt = OutputFormat.createPrettyPrint(); // 漂亮格式
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/xxx.xml"), fmt);
		writer.write(doc);
		writer.flush();
		writer.close();
		System.out.println("ok");
	}
}
