package com.snort.intelli.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MySqlDriver {
	@Value("${mysql.driver}")
	private String driver;
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.user}")
	private String username;
	@Value("${mysql.password}")
	private String password;

	public MySqlDriver() {
		// TODO Auto-generated constructor stub
	}

	public MySqlDriver(String driver, String url, String username, String password) {
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
		return "MySqlDriver [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}

}
