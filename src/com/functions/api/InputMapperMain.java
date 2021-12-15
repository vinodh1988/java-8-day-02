package com.functions.api;

import java.util.Arrays;
import java.util.List;

public class InputMapperMain {
    public static void main(String[] args) {
		List<String> list=Arrays.asList("John","Harry","Raj","Rakesh","Govind","Stepher","Mary");
		List<String> result;
		
		result = InputMapper.processString(list, (x)->x.toUpperCase());
		
		System.out.println(result);
		
		result = InputMapper.processString(list, (x)->{
			return "Hey!!!"+x;
		});
		
		System.out.println(result);
		
		result = InputMapper.processString(list,(index,x)->{
		
	          if(index%2==0)
	        	  return x.toUpperCase();
	          else
	        	  return x.substring(0, 3).toUpperCase();
		});
		
		System.out.println(result);
	}
}
