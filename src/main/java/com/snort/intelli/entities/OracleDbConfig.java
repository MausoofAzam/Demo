package com.snort.intelli.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@author: Mausoof Azam
 * @note: component to create bean
 * @value to rean bean property value and inject the value
 * */
@Component
public class OracleDbConfig {

	@Value("${oracle.driver}")
	private String driver;

	@Value("${oracle.url}")
	private String url;
	@Value("${oracle.username}")
	private String username;
	@Value("${oracle.password}")
	private String password;

	public OracleDbConfig() {
		// TODO Auto-generated constructor stub
	}

	public OracleDbConfig(String driver, String url, String username, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "OracleDbConfig [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}

}
