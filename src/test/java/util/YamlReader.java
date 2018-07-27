package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.ho.yaml.Yaml;

public class YamlReader {
	Map<String,Object> mainMap;
	
	@SuppressWarnings("unchecked")
	public YamlReader() throws FileNotFoundException {
		String filePath1 = "/home/qainfotech/eclipse-workspace/YamlTest/src/test/java/testData/locator.yml";
		mainMap = (Map<String,Object>)Yaml.load(new FileInputStream(filePath1));
		
	}
	
	public String getELement(String elementToken) {
		String[] tokens = elementToken.split("\\.");
		String lastToken = tokens[tokens.length - 1];
		return getLastMap(elementToken).get(lastToken).toString();
	}
	
	public Map<String,Object> reduceMap(String reducedToken,Map<String,Object> map){
		
        map = (Map<String, Object>) map.get(reducedToken);
        return map;
	}
	
	public Map<String,Object> getLastMap(String token) {

		Map<String,Object> map = mainMap;
		
		while(token.contains(".")) {
			String[] tokens = token.split("\\.");
			map = reduceMap(tokens[0],map);
			token = token.replace(tokens[0] + ".", "");
		}
		
		return map;
	}
	
}
