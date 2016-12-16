package sample01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class ReadXmlWithDom {
	public static void main(String[] args) throws Exception {
		//��������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		//����xml���õ��ĵ�����DOC����
		Document document = builder.parse(new File("src/phone.xml"));
		//�õ����С�Brand����Ԫ�ؼ���
		NodeList brands = document.getElementsByTagName("Brand");
		for (int i = 0; i < brands.getLength(); i++) {
			//�õ�BrandԪ��
			Element brand = (Element) brands.item(i);
			//�õ�BrandԪ�ص�����ֵ
			String name = brand.getAttribute("name");
			System.out.println(name);
			//�õ�Brand��һ���е�TypeԪ�صļ���
			NodeList types = brand.getElementsByTagName("Type");
			for (int j = 0; j < types.getLength(); j++) {
				Element type = (Element) types.item(j);
				System.out.println("\t"+type.getAttribute("name"));
			}
		}
	}
}
