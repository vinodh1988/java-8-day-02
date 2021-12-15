package com.functions.api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DataConsumerMain {
   public static void main(String[] args) {
	    File f=new File("D:\\output.txt");
	    List<String> list=Arrays.asList("Jackson","Hey!!! India","Great Going!!!","Keep it Cool!!!");
	    
	   try(BufferedWriter bw=new BufferedWriter(new FileWriter(f,true))){
		   DataConsumer.ConsumeInput(list, (input)->{
			  try {
				
			  
				bw.write(input);
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		   });
		   
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   System.out.println("Done");
	   
	
  }
}
