package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyPageTag extends SimpleTagSupport {
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * �����������Զ����ǩ�Ŀ�ʼ��ʱ�� �ͻ����tld�ļ��е����������ñ�ǩ��������doTag����
	 */
	@Override
	public void doTag() throws JspException, IOException {
		 int sum= Integer.parseInt(this.getJspContext().findAttribute("sum")+"");
		 int pageNum = Integer.parseInt(this.getJspContext().findAttribute("pageNum")+"");
		 JspWriter out = this.getJspContext().getOut();
		 
		 out.write("<li><a href=\""+url+"?pageNum="+((pageNum-1)<=1?1:(pageNum-1))+"\">&laquo</a></li>");
		 for (int i =1; i <=sum; i++) {
			 out.write("<li><a href='"+url+"?pageNum="+i+"'>"+i+"</a></li>");
		 }
		 out.write("<li><a href='"+url+"?pageNum="+((pageNum+1)>=sum?sum:(pageNum+1))+"'>&raquo</a></li>");
	}
}
