package com.functions.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class InputMapper {
    public static List<String> processString(List<String> input, Function<String,String> mapper){
    	
    	List<String> result = new ArrayList<String>();
    	
    	for(String x:input) {
    		result.add(mapper.apply(x));
    	}
    	
    	return result;
    }
    
   public static List<String> processString(List<String> input,BiFunction<Integer, String, String> mapper){
	 
	   List<String> result = new ArrayList<String>();
   	
	   
	   for(int i=0;i<input.size();i++) {
   		  result.add(mapper.apply(i,input.get(i)));
     	}
   	
    	return result;
   } 
}
