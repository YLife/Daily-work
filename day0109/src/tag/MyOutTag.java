package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * 创建带属性不带标签体的自定义标签，用于完成输出功能
 * <my:out value="" />
 * 标签类必须提供一些属性与tld文件中所描述的属性一致
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
