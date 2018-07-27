package com.qait.automation.YamlTest;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esotericsoftware.yamlbeans.YamlException;

import util.YamlReader;
import util.YamlReaderWithYamlBeans;

public class YamlTesting {
	YamlReader yamlReader;
	
	@BeforeTest
	public void beforeTest() throws FileNotFoundException, YamlException {
		yamlReader = new YamlReader();
	}
	
	@Test
	public void readvalues() {
		System.out.println(yamlReader.getELement("credentials.h emailId2.name"));
		System.out.println(yamlReader.getELement("hierarchy1"));
		System.out.println(yamlReader.getELement("hierarchy2.value"));
		System.out.println(yamlReader.getELement("hierarchy4.firstLevel.secondLevel.ThirdLevel.value"));
		
	}
	
}
