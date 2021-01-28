package com.platlap.common;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class DataProvider {

	public static final Map<String,String> contacts;
	static {
		
		contacts=new TreeMap<>();
		
		contacts.put("Sandhya", "9066168031");
		contacts.put("san", "8180806543");
		contacts.put("pan","8880806543");
		contacts.put("gonn", "6680806543");
		contacts.put("panne", "9880806543");
		contacts.put("curl", "6880806543");
		contacts.put("koni", "7880806543");
		contacts.put("servy", "8880606543");
	}
}
