package com.isoft.util;

public class DateTools {
	/**
	 * 将数据库Date对象转换为util包中的Date对象
	 * @param date
	 * @return
	 */
	public static java.util.Date sqlDate2utilDate(java.sql.Date date) {
		if(null != date) {
			return new java.util.Date(date.getTime()) ;
		}
		return null ;
	}
	/**
	 * 将util包中的Date对象转换为数据库的Date对象
	 * @param date
	 * @return
	 */
	public static java.sql.Date utilDate2sqlDate(java.util.Date date) {
		if(null != date) {
			return new java.sql.Date(date.getTime()) ;
		}
		return null ;
	}
}
