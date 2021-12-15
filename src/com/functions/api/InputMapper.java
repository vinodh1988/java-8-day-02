package com.functions.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InputMapper {
    public static List<String> processString(List<String> input, Function<String,String> mapper){
    	
    	List<String> result = new ArrayList<String>();
    	
    	for(String x:input) {
    		result.add(mapper.apply(x));
    	}
    	
    	return result;
    }
}
