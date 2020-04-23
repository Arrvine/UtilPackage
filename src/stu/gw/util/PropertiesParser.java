package stu.gw.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


/**
 * @author Arrvine
 * propertiesÎÄ¼þÉ¨Ãè
 */
public class PropertiesParser {
	private static final Map<String, String> pool;
	static {
		pool = new HashMap<>();
	}
	
	public PropertiesParser() {
	}
	
	public  void loadProperties(String filePath) {
		InputStream is = PropertiesParser.class.getResourceAsStream(filePath);
		Properties property = new Properties();
		try {
			property.load(is);
			
			Enumeration<Object> keys = property.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = property.getProperty(key);
				
				pool.put(key, value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String value(String key) {
		return pool.get(key);
	}
	
}
