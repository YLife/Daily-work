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
		String dateStr = params[0];//参数为字符串数组：由于复选框或多重下拉列表有可能传多个参数
		SimpleDateFormat[] sdf = {
				new SimpleDateFormat("yyyy-MM-dd"),
				new SimpleDateFormat("yyyy年MM月dd日"),
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
			throw new TypeConversionException("日期格式不正确");
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
