package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "pweklpkewszcxvlutyfermzajosd";
		System.out.println("String length : "+str.length());
		
		Set<Character> uniqueSet = new HashSet<>();
		int i = 0;
		int j = 0;
		int max = 0;
		
		while(j<str.length()) {
			
			if(!uniqueSet.contains(str.charAt(j))) {
				uniqueSet.add(str.charAt(j));
				if(max < uniqueSet.size()) {
					max = uniqueSet.size();
				}
				j++;
			} else {
				uniqueSet.remove(str.charAt(i));
				i++;
			}
			
			
		}
		
		System.out.println("Longest substring : "+uniqueSet+ " With length : "+max);
		
		String str2 = "abcadabb";
		String subString = findLongestSubstring(str2);
		System.out.println("Longest SubString is : "+subString+" with length : "+subString.length());
		
	}
	
	public static String findLongestSubstring(String s) {
        int maxLength = 0;
        int startOfLongest = 0;
        
        // Map to store the last seen index of each character
        Map<Character, Integer> charMap = new HashMap<>();
        
        // 'left' pointer tracks the start of the current valid window
        int left = 0;
        
        // 'right' pointer expands the window across the string
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If we see a duplicate inside our current window, shrink the window
            if (charMap.containsKey(currentChar)) {
                left = Math.max(left, charMap.get(currentChar) + 1);
            }
            
            // Update/record the position of the character
            charMap.put(currentChar, right);
            
            // If the current window is larger than our max record, update it
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startOfLongest = left;
            }
        }
        
        return s.substring(startOfLongest, startOfLongest + maxLength);
    }
}
