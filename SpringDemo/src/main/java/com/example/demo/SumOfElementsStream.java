package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumOfElementsStream {
	public static void main(String[] args) {

		// find top 2 minimum values
		List<Integer> numbers = Arrays.asList(132, 24, 32, 434, 52, 9, 45, 1, 345);
		List<Integer> min = numbers.stream().sorted().limit(2).collect(Collectors.toList());
		System.out.println("Top 2 MIN values : " + min);

		// filter out all the even numbers from a list
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> evenNumbersList = numbers2.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("even numbers : " + evenNumbersList);

		// count the number of strings containing a specific character ‘a’
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "Moto");
		char searchChar = 'a';
		long count = strings.stream().filter(str -> str.contains(String.valueOf(searchChar))).count();
		System.out.println("count containing 'a' : " + count);

		// convert a list of strings to uppercase
		List<String> lowerCase = Arrays.asList("apple", "banana", "orange", "grape");
		List<String> upperCase = lowerCase.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Upper case : " + upperCase);

		// calculate the average of all the numbers
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		double avg = num.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
		System.out.println("Average : " + avg);

		// sort a list of strings in alphabetical order
		List<String> str2 = Arrays.asList("banana", "orange", "apple", "grape");
		List<String> sortedString = str2.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list : " + sortedString);

		// concatenate all the strings
		List<String> str3 = Arrays.asList("apple", "banana", "orange", "grape");
		String concatenatedString = str3.stream().collect(Collectors.joining());
		System.out.println("Concatenated string: " + concatenatedString);

		// find the longest string in a list of strings
		List<String> str4 = Arrays.asList("apple", "banana", "orangesss", "grape");
		String longest = str4.stream().max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println("Longest string : " + longest);

		// find and print the shortest string
		List<String> str6 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		String shortestString = str6.stream().min(Comparator.comparingInt(String::length)).orElse("");
		System.out.println("Shortest string : " + shortestString);

		// find top 2 longest strings
		List<String> str5 = Arrays.asList("apple", "banana", "orangesss", "grape");
		List<String> top2Longest = str5.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(2)
				.collect(Collectors.toList());
		System.out.println("Top 2 Longest strings : " + top2Longest);

		// find and print the second largest number
		List<Integer> numbers3 = Arrays.asList(4, 2, 8, 6, 10);
		Optional<Integer> secondLargestNum = numbers3.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Second largest number : " + secondLargestNum.get());

		// remove all the duplicate elements from a list
		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
		List<Integer> distinctNumbers = numbers4.stream().distinct().collect(Collectors.toList());
		System.out.println("After removing duplicates : " + distinctNumbers);

		// convert a list of integers to a list of their squares
		List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squareList = numbers5.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("List of squares : " + squareList);

		// find and print the strings starting with a specific prefix ‘a’
		List<String> str7 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "alphanso");
		String prefix = "a";
		List<String> startsWith = str7.stream().filter(st -> st.startsWith(prefix)).collect(Collectors.toList());
		System.out.println("Strings starting with 'a' : " + startsWith);

		// check if a list of strings contains a specific string
		List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Cherry");
		String target = "Mango";
		boolean exists = fruits.stream().anyMatch(fruit -> fruit.equals(target));
		System.out.println("Is the string exists : " + exists);

		// find and print the strings with length greater than a specified value
		List<String> str8 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		int minLength = 5;
		List<String> list = str8.stream().filter(s -> s.length() >= minLength).collect(Collectors.toList());
		System.out.println("strings with length greater than " + minLength + " : " + list);

		// filter out all the elements divisible by 3 and 5 from a list of integers
		List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		List<Integer> divisibleNumbers = numbers6.stream().filter(n -> n % 3 == 0 && n % 5 == 0)
				.collect(Collectors.toList());
		System.out.println("Numbers divisible by 3 & 5 : " + divisibleNumbers);

		// reverse a list of strings
		List<String> strList = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		Collections.reverse(strList);
		System.out.println("Reversed list: " + strList);

		// find and print the distinct odd numbers
		List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> distinctOddNumbers = numbers7.stream().filter(n -> n % 2 != 0).distinct()
				.collect(Collectors.toList());
		System.out.println("Distinct odd numbers: " + distinctOddNumbers);

		// find and print the sum of all odd numbers
		List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sumOfOddNumbers = numbers8.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of odd numbers: " + sumOfOddNumbers);

		// find and print the strings containing a specific substring
		List<String> str9 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		String subString = "an";
		List<String> subStringList = str9.stream().filter(s -> s.contains(subString)).collect(Collectors.toList());
		System.out.println("Substrings list : " + subStringList);

		// find the frequency of each element in a list of integers
		List<Integer> numbers9 = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
		Map<Integer, Long> frequencyMap = numbers9.stream()
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println("Frequency of each element: " + frequencyMap);

		// find and print the strings containing a specific character at least twice
		List<String> str10 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		char targetChar = 'a';
		List<String> containingCharTwice = str10.stream()
				.filter(s -> s.chars().filter(c -> c == targetChar).count() >= 2).collect(Collectors.toList());
		System.out.println("Strings containing \"" + targetChar + "\" at least twice: " + containingCharTwice);

		// find the kth smallest element in a list of integers
		List<Integer> numbers10 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
		int k = 3; // Find the 3rd smallest element
		Optional<Integer> kthSmallest = numbers10.stream().sorted().skip(k - 1).findFirst();
		System.out
				.println("The " + k + "rd smallest element: " + (kthSmallest.isPresent() ? kthSmallest.get() : "N/A"));

		// find and print the elements with the lowest frequency
		List<Integer> numbers11 = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
		Map<Integer, Long> map = numbers11.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		long minFrequency = map.values().stream().mapToLong(Long::longValue).min().orElse(0);
		List<Integer> elementsWithMinFrequency = map.entrySet().stream()
				.filter(entry -> entry.getValue() == minFrequency).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Element(s) with lowest frequency: " + elementsWithMinFrequency);

		// Reverse every word of String
		String input = new String("Hello World");
		String reverse = Arrays.stream(input.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));

		System.out.println("Reverse String : " + reverse);

		List<Integer> intList = List.of(1, 2, 3, 4, 5);
		List<Integer> newList = intList.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Squares : " + newList);

		List<String> list2 = List.of("1", "2", "3", "4", "5");
		System.out.println("String integers : " + list2.getClass());
		List<Integer> result = list2.stream().map(n -> Integer.parseInt(n)).collect(Collectors.toList());
		System.out.println("Integer conversion : " + result);

		// First Non-Repeated Character
		String str = "swisswe";
		Optional<Character> output = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();
		System.out.println("First non-repeated character : " + output.get());

	}
}
