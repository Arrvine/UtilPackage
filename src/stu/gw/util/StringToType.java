package stu.gw.util;


/**
 * @author Arrvine
 * 该工具主要目的是将8大基本类型和String类型的字符串格式转化为Class类型
 */
public class StringToType {
	
	public StringToType() {
	}
	
	public static Class<?> toType(String typeName) {
		if (typeName.equalsIgnoreCase("string")) {
			return String.class;
		}
		if (typeName.equalsIgnoreCase("int")) {
			return int.class;
		}
		if (typeName.equalsIgnoreCase("byte")) {
			return byte.class;
		}
		if (typeName.equalsIgnoreCase("boolean")) {
			return boolean.class;
		}
		if (typeName.equalsIgnoreCase("char")) {
			return char.class;
		}
		if (typeName.equalsIgnoreCase("long")) {
			return long.class;
		}
		if (typeName.equalsIgnoreCase("float")) {
			return float.class;
		}
		if (typeName.equalsIgnoreCase("double")) {
			return double.class;
		}
		if (typeName.equalsIgnoreCase("short")) {
			return short.class;
		}
		
		try {
			return Class.forName(typeName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
