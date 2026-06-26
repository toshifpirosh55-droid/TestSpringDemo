package com.leet.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubString {
	public static void main(String[] args) {
		lengthOfLongestSubstring("abcabcbb");
	}
	
	public static int lengthOfLongestSubstring(String s) {
		try {
			 Map<Integer, String> map = new HashMap<>();
		        List<String> list = new ArrayList<>();
		        for(int i=0; i< s.length(); i++){
		            int maxLength = 0;
		            for(int j=0; j<s.length(); j++){
		                if(!list.contains(String.valueOf(s.charAt(j)))){
		                    list.add(String.valueOf(s.charAt(j)));
		                    maxLength++;
		                } else {
		                    map.put(maxLength, list.toString());
		                    break;
		                }
		                
		            }
		        }
		        Integer maxKey = Collections.max(map.keySet());
		        String maxValue = map.get(maxKey);
		        
		        System.out.println(maxKey+" ::: "+maxValue);
		} catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
       
        return 1;
    }
}
