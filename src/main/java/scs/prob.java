package scs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class prob {
	
	
	public static void main(String args[]) {
	
	String example = "BABCADED";
	String result="";
	//result : ABD"
	
	
	Map<String, Integer> charCountMap= new HashMap<String,Integer>();
	
	for(int i=0;i<example.length();i++) {
		
		if(charCountMap.containsKey(example.substring(i,i+1))) {
			
			int count = charCountMap.get(example.substring(i,i+1));
			
			charCountMap.put(example.substring(i,i+1), count+1);			
		
	}else {
			
			charCountMap.put(example.substring(i,i+1), 1);
			
		}
}
	
	for(Map.Entry<String, Integer> data: charCountMap.entrySet()) {
		
		if(data.getValue() >= 2) {
			result=result+data.getKey();
		}
	}
//	System.out.println("result is  " + result);
	char[] dataArray=result.toCharArray();
	Arrays.sort(dataArray);
	
	for(int k=0;k<dataArray.length;k++) {
		System.out.print(dataArray[k]);
	}
	
	
	
}
}
