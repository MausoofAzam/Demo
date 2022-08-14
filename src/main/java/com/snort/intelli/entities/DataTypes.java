package com.snort.intelli.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataTypes {

	@Value("${intValue}")
	private int intValue;

	@Value("${longValue}")
	private int longValue;

	@Value("${floatValue}")
	private int floatValue;

	@Value("${doubleValue}")
	private int doubleValue;

	@Value("${booleanValue}")
	private int booleanValue;

	@Value("${charValue}")
	private int charValue;

	public DataTypes() {
		// TODO Auto-generated constructor stub
	}

	public DataTypes(int intValue, int longValue, int floatValue, int doubleValue, int booleanValue, int charValue) {
		super();
		this.intValue = intValue;
		this.longValue = longValue;
		this.floatValue = floatValue;
		this.doubleValue = doubleValue;
		this.booleanValue = booleanValue;
		this.charValue = charValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public int getLongValue() {
		return longValue;
	}

	public void setLongValue(int longValue) {
		this.longValue = longValue;
	}

	public int getFloatValue() {
		return floatValue;
	}

	public void setFloatValue(int floatValue) {
		this.floatValue = floatValue;
	}

	public int getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(int doubleValue) {
		this.doubleValue = doubleValue;
	}

	public int getBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(int booleanValue) {
		this.booleanValue = booleanValue;
	}

	public int getCharValue() {
		return charValue;
	}

	public void setCharValue(int charValue) {
		this.charValue = charValue;
	}

	@Override
	public String toString() {
		return "DataTypes [intValue=" + intValue + ", longValue=" + longValue + ", floatValue=" + floatValue
				+ ", doubleValue=" + doubleValue + ", booleanValue=" + booleanValue + ", charValue=" + charValue + "]";
	}

}
