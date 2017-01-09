package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * ���������Բ�����ǩ����Զ����ǩ����������������
 * <my:out value="" />
 * ��ǩ������ṩһЩ������tld�ļ���������������һ��
 * @author Administrator
 *
 */
public class MyOutTag extends SimpleTagSupport {
	private String value;
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("=====================");
		System.out.println(this.value);
		JspWriter out= this.getJspContext().getOut();
		out.write(this.value);
	}
}
