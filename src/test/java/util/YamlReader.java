package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.ho.yaml.Yaml;

public class YamlReader {
	HashMap<String,HashMap<String,HashMap<String,String>>> mainMap;
	
	@SuppressWarnings("unchecked")
	public YamlReader() throws FileNotFoundException {
		String filePath1 = "/home/qainfotech/eclipse-workspace/YamlTest/src/test/java/testData/locator.yml";
		mainMap = (HashMap<String,HashMap<String,HashMap<String,String>>>)Yaml.load(new FileInputStream(filePath1));
	}
	
	
	public String getMailId(String value) {
		
		return mainMap.get("credentials").get(value).get("name");
		
	}
	
	
	public String getPassWord(String value) {
		
		return mainMap.get("credentials").get(value).get("password");
	}
	
}
