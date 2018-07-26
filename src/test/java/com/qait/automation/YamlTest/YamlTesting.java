package com.qait.automation.YamlTest;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esotericsoftware.yamlbeans.YamlException;

import util.YamlReader;
import util.YamlReaderWithYamlBeans;

public class YamlTesting {
	YamlReader yamlReader;
	YamlReaderWithYamlBeans yamlBeansReader;
	
	@BeforeTest
	public void beforeTest() throws FileNotFoundException, YamlException {
		yamlReader = new YamlReader();
		yamlBeansReader = new YamlReaderWithYamlBeans();
	}
	
	@Test
	public void readvalues() {
		System.out.println(yamlReader.getMailId("h emailId2"));
		System.out.println(yamlReader.getPassWord("h emailId2"));
		System.out.println(yamlBeansReader.getValues("credentials"));
	}
	
}
