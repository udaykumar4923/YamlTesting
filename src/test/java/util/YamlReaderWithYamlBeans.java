package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class YamlReaderWithYamlBeans {
	Map map;
	
	public YamlReaderWithYamlBeans() throws FileNotFoundException, YamlException {
		String filepath = "/home/qainfotech/eclipse-workspace/YamlTest/src/test/java/testData/locator.yml";
		YamlReader reader = new YamlReader(new FileReader(filepath));
		Object object = reader.read();
		System.out.println("object");
		map = (Map)object;
	}
	
	public String getValues(String value) {
		return map.get(value).toString();
	}
}
