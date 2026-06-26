package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestInterview {
	public static void main(String[] args) {
		String str = "Senior Engineer Quality Engineer";
		// o/p : Engineer - 2

		Map<String, Long> result = Arrays.asList(str.split(" ")).stream()
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		System.out.println("Result : " + result);
		
		
		
		//K-most frequent elements
		//Input: [1,1,1,2,2,3], k = 2
		//Output: [1,2]
		
		int k = 2;
				List<Integer> list = List.of(1,1,1,2,2,3);
				
				Map<Integer, Long> map =list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				// [1,3] [2,2] [3,1]
				List<Integer> result2 = map.entrySet()
		                .stream()
		                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
		                .limit(3)
		                .map(Map.Entry::getKey)
		                .collect(Collectors.toList());

		        System.out.println(result2);
				
				
				
				
		
	}
}
