package com.example.demo;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOfCharacters {
	public static void main(String[] args) {

		String str = "aabbbbbcccddddddde";

		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(map);

		StringBuilder sb = new StringBuilder();

		map.forEach((k, v) -> sb.append(k).append(v));

		System.out.println(sb);

	}
}
