package cn.wzzcd6.common.utils;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * json 操作工具 
 * @author rongpeng.jiao
 *
 */
public class JsonUtil {
	/**
	 * 将对象转换为json格式字符串
	 *
	 * @param Object
	 * @return json string
	 */
	public static String toJSON(Object obj) {
		ObjectMapper om = new ObjectMapper();
		try {
			return om.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 *
	 * 将json形式字符串转换为java实体类
	 *
	 */
	public static <T> T parse(String jsonStr, Class<T> clazz) {
		ObjectMapper om = new ObjectMapper();
		T readValue = null;
		try {
			readValue = om.readValue(jsonStr, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readValue;
	}

	/**
	 * 
	 * @param jsonStr
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> parseList(String jsonStr, Class<T> clazz) {
		ObjectMapper om = new ObjectMapper();
		List<T> readValue = null;
		try {
			readValue = om.readValue(jsonStr, new TypeReference<List<T>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readValue;
	}

	public static String parseObject(String jsonStr) {
		ObjectMapper om = new ObjectMapper();
		String readValue = null;
		try {
			readValue = om.writeValueAsString(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readValue;
	}
	
	
}
