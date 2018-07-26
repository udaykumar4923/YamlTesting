package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.ho.yaml.Yaml;

public class YamlReader {
	HashMap<String,Object> mainMap;
	
	@SuppressWarnings("unchecked")
	public YamlReader() throws FileNotFoundException {
		String filePath1 = "/home/uday/Downloads/yaml1/YamlTesting/src/test/java/testData/locator.yml";
		mainMap = (HashMap<String,Object>)Yaml.load(new FileInputStream(filePath1));
	}
	
	public String getELement(String elementToken) {
		String[] tokens = elementToken.split("\\.");
		String lastToken = tokens[tokens.length - 1];
		return getLastMap(elementToken,mainMap).get(lastToken).toString();
	}
	
	
	public HashMap<String,Object> getLastMap(String token,HashMap<String,Object> map) {
	    if (token.contains(".")) {
	        String[] tokens = token.split("\\.");
	        token = token.replace(tokens[0] + ".", "");
	        map = getLastMap(token, (HashMap<String, Object>) map.get(tokens[0]));
	    }
		return map;
	}
	
}
