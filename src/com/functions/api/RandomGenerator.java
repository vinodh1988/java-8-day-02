package com.functions.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class RandomGenerator {

	  public static List<Integer> getRandomList(int size,Supplier<Integer> supplier){
		  List<Integer> result=new ArrayList<Integer>();
		  
		  for(int i=0;i<size;i++) {
			  result.add(supplier.get());
		  }
		  
		  return result;
	  }
}
