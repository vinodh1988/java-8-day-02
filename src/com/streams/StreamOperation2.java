package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation2 {
    public static void main(String n[]) {
    	List<Integer> list=Arrays.asList(123,34,545,646,545,645,2332,34,345,366);
    	
    	Stream<Integer> streams=list.stream();
    /*
    	streams=streams.map(x->x+500);
    	
    	streams.forEach(System.out::println);*/
    	
    	streams.map(x->{
    		System.out.println("Processing -> "+x);
    		return x+500;
    	}).forEach(
    		x->{
    		  System.out.println("Received ->" +x); 	
    		}	
    	);
    	
    }
}
