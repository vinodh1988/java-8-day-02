package com.functions.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {
	
      public static List<Integer> filterNumber(List<Integer> input, Predicate<Integer> predicate)
      {
    	  List<Integer> result=new ArrayList<Integer>();
    	  for(Integer x:input) {
    		  if(predicate.test(x))
    			  result.add(x);
    	  }
    	  return result;
      }
}
