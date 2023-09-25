package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ReadConfig {

	Properties pro;
	

	public ReadConfig() throws IOException {

		File src = new File("./Configuration/config.properties");

		FileInputStream fi = new FileInputStream(src);

		pro = new Properties();

		pro.load(fi);

	}

	public String getUrl() {

		String url = pro.getProperty("url");

		return url;

	}

	public String getUsername() {

		String username = pro.getProperty("username");

		return username;

	}

	public String getPassword() {

		String password = pro.getProperty("password");

		return password;

	}

}
