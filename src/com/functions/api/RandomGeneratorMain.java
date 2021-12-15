package com.functions.api;

import java.util.List;

public class RandomGeneratorMain {
   public static void main(String[] args) {
	
     List<Integer> result=RandomGenerator.getRandomList(30, 
    		 ()->(int)Math.round(Math.random()*10000));
     
     System.out.println(result);
   }
}
