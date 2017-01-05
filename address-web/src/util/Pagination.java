package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 提供分页的核心逻辑
 * 
 * @author Administrator
 * 
 */
public class Pagination {
	// 和web容器有关的属性
	private HttpServletRequest request;
	private HttpServletResponse response;
	// 和分页逻辑有关的属性
	private int pageSize = 5;
	private int pageNo = 1;
	private int rowCount;
	private int maxPageNo;
	private String html;
	private String uri;

	// 用数字按钮进行分页时的参数
	private int digitCount = 8;
	private int firstDigit;
	private int lastDigit;
	private int leftDigit;
	private int rightDigit;

	// 上一页，下一页的参数
	private int previousPageNo;
	private int nextPageNo;

	public Pagination(HttpServletRequest request, HttpServletResponse response,
			int rowCount) {
		super();
		this.request = request;
		this.response = response;
		this.rowCount = rowCount;
		this.maxPageNo = (rowCount - 1) / pageSize + 1;
		if (request.getParameter("pageNo") != null) {
			this.pageNo = Integer.parseInt(request.getParameter("pageNo"));
		}
		this.uri = request.getRequestURI();

		this.createHTMLDigit();
	}

	public void createHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<li>");
		sb.append("<a href=\"");
		sb.append(uri);
		sb.append("?pageNo=");
		if (this.pageNo > 1) {
			sb.append(pageNo - 1);
		} else {
			sb.append(1);
		}
		sb.append("\">上一页</a></li>");
		sb.append("<li>");
		sb.append("<a href=\"");
		sb.append(uri);
		sb.append("?pageNo=");
		if (this.pageNo < maxPageNo) {
			sb.append(pageNo + 1);
		} else {
			sb.append(maxPageNo);
		}
		sb.append("\">下一页</a></li>");
		this.html = sb.toString();
	}

	public void createHTMLDigit() {
		StringBuffer sb = new StringBuffer();
		// 当前页是第几段
		int duan = (this.pageNo - 1) / this.digitCount + 1;
		this.firstDigit = (duan - 1) * digitCount + 1;
		this.lastDigit = duan * digitCount;
		if (lastDigit > maxPageNo) {
			lastDigit = maxPageNo;
		}
		this.leftDigit = firstDigit > 1 ? firstDigit - 1 : 1;
		this.rightDigit = lastDigit < maxPageNo ? lastDigit + 1 : maxPageNo;
		// 生成左箭头<li><a href="#">&laquo;</a></li>
		sb.append("<li>");
		sb.append("<a href=\"" + uri + "?pageNo=" + leftDigit
				+ "\">&laquo;</a>");
		sb.append("</li>");
		// 生成数字页码
		for (int i = firstDigit; i <= lastDigit; i++) {
			sb.append("<li");
			if (i == this.pageNo) {
				sb.append(" class=\"active\"");
			}
			sb.append(">");
			sb.append("<a href=\"" + uri + "?pageNo=" + i + "\">" + i + "</a>");
			sb.append("</li>");
		}
		// 生成右箭头
		sb.append("<li>");
		sb.append("<a href=\"" + uri + "?pageNo=" + rightDigit
				+ "\">&raquo;</a>");
		sb.append("</li>");
		this.html = sb.toString();
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getMaxPageNo() {
		return maxPageNo;
	}

	public void setMaxPageNo(int maxPageNo) {
		this.maxPageNo = maxPageNo;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public int getPreviousPageNo() {
		return pageNo > 1 ? pageNo - 1 : 1;
	}

	public int getNextPageNo() {
		return pageNo < maxPageNo ? pageNo + 1 : maxPageNo;
	}

}
