package sample01;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/*
 * ʹ��ԭ��dom��ʽ��xml����Ϊobject
 */
public class ParseXmlToObjectWithDom {
	public static void main(String[] args) throws Exception {
		// ����������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// ����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		// ����xml���õ��ĵ�����(DOM��)
		Document doc = builder.parse("http://localhost/data/%E5%8D%8E%E4%B8%BA%E9%AB%98%E7%A7%9115%E7%8F%AD/java/XML/phone.xml");
		// �õ�����"Brand"��Ԫ�ؼ���
		NodeList brands = doc.getElementsByTagName("Brand");
		
		List<Brand> result = new ArrayList<>();
		
		// ����
		for (int i = 0; i < brands.getLength(); i++) {
			// �õ�BrandԪ��
			Element brand = (Element)brands.item(i);
			// �õ�BrandԪ�ص�name����ֵ
			String name = brand.getAttribute("name");
			// ��װ�ɶ���
			Brand brandObj = new Brand(name);
			result.add(brandObj);
			// �õ�BrandԪ����һ���е�TypeԪ�صļ���
			NodeList types = brand.getElementsByTagName("Type");
			// ����TypeԪ�ؼ���
			for (int j = 0; j < types.getLength(); j++) {
				Element type = (Element)types.item(j);
				// �õ�TypeԪ�ص�name����ֵ
				String typeName = type.getAttribute("name");
				brandObj.getTypes().add(new Type(typeName));
			}
		}
		// ���
		for (Brand b : result) {
			System.out.println(b.getName());
			for (Type t : b.getTypes()) {
				System.out.println("\t" + t.getName());
			}
		}
	}
}
