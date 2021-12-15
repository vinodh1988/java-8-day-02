package com.functions.api;

import java.util.Arrays;
import java.util.List;

public class NumberFilterMain {
      public static void main(String[] args) {
		  List<Integer> list= Arrays.asList(434,3435,334,434,3435,212,345,564,3466,343,13,34,13);
		  
		  List<Integer> result;
		 
		  result=NumberFilter.filterNumber(list, (x)-> x%2==0);
		  
		  System.out.println(result);
		  
		  result =NumberFilter.filterNumber(list, (x)-> x>100);
		  
		  System.out.println(result);
	  }
}
