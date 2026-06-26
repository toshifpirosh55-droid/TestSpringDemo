package com.example.demo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamCode {
	public static void main(String[] args) {

		List<EmployeeDto> employees = List.of(new EmployeeDto(1, "John", "IT", 50000),
				new EmployeeDto(2, "Alice", "HR", 60000), new EmployeeDto(3, "Bob", "IT", 70000),
				new EmployeeDto(4, "David", "Finance", 80000), new EmployeeDto(5, "Eve", "HR", 65000));

		// Find Second Highest Salary
		Double result = employees.stream().map(EmployeeDto::getSalary).distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().orElseThrow(() -> new RuntimeException("Second highest salary not found"));

		System.out.println("Second highest salary : " + result);

		// Group Employees by Department
		Map<String, List<EmployeeDto>> result2 = employees.stream()
				.collect(Collectors.groupingBy(EmployeeDto::getDepartment));

		result2.forEach((k, v) -> System.out.println("Department : " + k + " Employee : " + v.toString()));

		// Highest Paid Employee in Each Department
		Map<String, Optional<EmployeeDto>> result3 = employees.stream().collect(Collectors.groupingBy(
				EmployeeDto::getDepartment, Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary))));

		// Count Employees in Each Department
		Map<String, Long> result4 = employees.stream()
				.collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting()));

		System.out.println("Employees in each Dept. : " + result4);

	}
}
