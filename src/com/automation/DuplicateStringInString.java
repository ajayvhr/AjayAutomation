package com.automation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getDuplicate( "My name is AJAY KUMAR");

	}
	
	public static void getDuplicate(String str) {
		
		char[] strArray=str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
				
			for(char ch : strArray) {
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch)+1);
				}
				else
					map.put(ch,1);
				
			}
			
			Set<Map.Entry<Character,Integer>> entrySet =map.entrySet();
			
			for(Map.Entry<Character,Integer> entry : entrySet) {
				
				if(entry.getValue()>1) {
					System.out.println(entry.getKey() + ":" + entry.getValue());
				}
				
				
			}
			
		}
		
		
		
	}

