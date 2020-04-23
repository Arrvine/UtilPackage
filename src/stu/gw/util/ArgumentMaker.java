package stu.gw.util;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


/**
 * @author Arrvine
 * 使用Gson进行String类型和Json类型的转换
 */
public class ArgumentMaker {
	public static final Gson gson = new GsonBuilder().create();
	private static final Type type = new TypeToken<Map<String, String>>() {}.getType();
	private Map<String, String> argPool;

	public ArgumentMaker() {
		argPool = new HashMap<String, String>();
	}
	
	public ArgumentMaker(String json) {
		argPool = gson.fromJson(json, type);
	}
	
	public Object getValue(String name, Class<?> type) {
		String valueJson = argPool.get(name);
		return gson.fromJson(valueJson, type);
	}
	
	public Object getValue(String name, Type type) {
		String valueJson = argPool.get(name);
		return gson.fromJson(valueJson, type);
	}
	
	public ArgumentMaker add(String name, Object value) {
		argPool.put(name, gson.toJson(value));
		return this;
	}

	@Override
	public String toString() {
		return gson.toJson(argPool);
	}

}
