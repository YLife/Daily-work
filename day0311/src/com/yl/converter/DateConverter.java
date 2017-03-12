package com.yl.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class DateConverter extends StrutsTypeConverter {

	@SuppressWarnings("rawtypes")
	@Override
	public Object convertFromString(Map context, String[] params, Class target) {
		Date date = null;
		String dateStr = params[0];
		System.out.println(dateStr);
		SimpleDateFormat[] sdf = {
				new SimpleDateFormat("yyyy-MM-dd"),
				new SimpleDateFormat("yyyy年MM月dd日"),
				new SimpleDateFormat("yyyy/MM/dd")
		};
		if (dateStr != null && "".equals(dateStr)) {
			for (SimpleDateFormat format : sdf) {
				try {
					date = format.parse(dateStr);
					break;
				} catch (ParseException e) {
					continue;
				}
			}
		}
		if (date == null) {
			System.out.println("====================");
			throw new TypeConversionException("日期格式不正确");
		}
		return date;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String convertToString(Map context, Object obj) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = (Date) obj;
		String dateStr = sdf.format(date);
		return dateStr;
	}

}
