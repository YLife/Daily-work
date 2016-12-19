package sample01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/*
 * ʹ��ԭ��dom��ʽ����xml, �õ����е�����
 */
public class ReadXmlWithDom {
	public static void main(String[] args) throws Exception {
		// ����������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// ����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		// ����xml���õ��ĵ�����(DOM��)
		Document doc = builder.parse(new File("src/phone.xml"));
		// �õ�����"Brand"��Ԫ�ؼ���
		NodeList brands = doc.getElementsByTagName("Brand");
		// ����
		for (int i = 0; i < brands.getLength(); i++) {
			// �õ�BrandԪ��
			Element brand = (Element)brands.item(i);
			// �õ�BrandԪ�ص�name����ֵ
			String name = brand.getAttribute("name");
			System.out.println(name);
			// �õ�BrandԪ����һ���е�TypeԪ�صļ���
			NodeList types = brand.getElementsByTagName("Type");
			// ����TypeԪ�ؼ���
			for (int j = 0; j < types.getLength(); j++) {
				Element type = (Element)types.item(j);
				// �õ�TypeԪ�ص�name����ֵ
				System.out.println("\t" + type.getAttribute("name"));
			}
		}
	}
}
