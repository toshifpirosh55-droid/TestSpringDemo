package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class RemoveAdjacentDuplicate {
	public static void main(String[] args) {

		String str = "abcbbcddcad";

		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			int len = sb.length();
			if (len > 0 && sb.charAt(len - 1) == c) {
				sb.deleteCharAt(len - 1); // "Pop"
			} else {
				sb.append(c); // "Push"
			}
		}

		System.out.println("String : " + sb.toString());


	}

}
