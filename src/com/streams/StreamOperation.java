package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {
   public static void main(String[] args) {
	   List<String> list = Arrays.asList("Roger","Gary","Shahul","Ahmed","Arjun","Russel");
	   
	    Stream<String> s =list.stream();
	    
	    s.forEach(x->{
	    	System.out.println("Got!!!"+x);
	    });
	    s= list.stream();
	    System.out.println("------------------------------");
	    s.forEach(System.out::println);
   }
}
