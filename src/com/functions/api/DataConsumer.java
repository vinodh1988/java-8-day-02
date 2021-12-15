package com.functions.api;

import java.util.List;
import java.util.function.Consumer;

public class DataConsumer {

	 public static void ConsumeInput(List<String> input,Consumer<String> consumer) {
		 for(String x:input)
			 consumer.accept(x);
	 }
}
