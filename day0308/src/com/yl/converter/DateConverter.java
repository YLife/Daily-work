package com.yl.converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.SimpleFormatter;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;


public class DateConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] params, Class target) {
		Date date = null;
		String dateStr = params[0];//����Ϊ�ַ������飺���ڸ�ѡ�����������б��п��ܴ��������
		SimpleDateFormat[] sdf = {
				new SimpleDateFormat("yyyy-MM-dd"),
				new SimpleDateFormat("yyyy��MM��dd��"),
				new SimpleDateFormat("yyyy/MM/dd")
		};
		for (SimpleDateFormat format : sdf) {
			try {
				date = format.parse(dateStr);
				break;
			} catch (ParseException e) {
				continue;
			}
		}
		if (date == null) {
			throw new TypeConversionException("���ڸ�ʽ����ȷ");
		}
		return date;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = (Date) arg1;
		return sdf.format(date);
	}

}
