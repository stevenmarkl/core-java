package com.day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}

public class Java8LabEx {

public static void main(String[] args) {
//1. Find Even numbers in a list using stream API
System.out.println("Question1 :");		
List<Integer>list = Arrays.asList(1,2,3,4,1,3,4,10,11,12,13,14,15);
List<Integer>number = list.stream().filter(x -> x % 2 ==0).collect(Collectors.toList());
System.out.println(number);

	

//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
System.out.println("Question2 :");
 List<Integer>list1 = list.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList());
System.out.println(list1);


//3. How to find duplicate elements in a given integers list in java using Stream functions?
System.out.println("Question3 :");
List<Integer>list2 = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).collect(Collectors.toList());
System.out.println(list2);
//using set so duplicate values wont get displayed
Set<Integer>duplicate = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).collect(Collectors.toSet());
System.out.println(duplicate);

Long count =list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).distinct().count();
System.out.println(count);


//4. Given the list of integers, find the first element of the list using Stream functions?
System.out.println("Question4 :");
int firstElement = list.stream().findFirst().get();
System.out.println(firstElement);


//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
System.out.println("Question5 :");
long count1 = list.stream().count();
System.out.println(count1);


//6. Given a list of integers, find the maximum value element present in it using Stream functions?
System.out.println("Question6 :");
int max = list.stream().max((x,y) -> x - y).get();
System.out.println(max);


//7. Sort the Employee object using salary
List<Employee> empList = Arrays.asList(
new Employee(101, "Naveen", 10000),
new Employee(102, "kk", 50000),
new Employee(103, "partha", 90000)
);

List<Employee> sortList = empList.stream().sorted((e1, e2) -> e1.salary -
e2.salary).collect(Collectors.toList());
System.out.println(sortList);


//8. Given a list of integers, sort all the values present in it using Stream functions?
System.out.println("Question 8:");
List<Integer> sortList1 = list.stream().sorted().collect(Collectors.toList());
System.out.println(sortList1);


//9. Given a list of integers, sort all the values present in it in descending order using Stream functions?
System.out.println("Question 9:");
List<Integer> sortList2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
System.out.println(sortList2);



//10. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
System.out.println("Question 10:");
boolean list3 = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).count()>0 ? true:false ;
System.out.println(list3);


//11. Java 8 program to find factorial of given list of integer values
System.out.println("Question 11:");
List<Integer>factorial = Arrays.asList(1,2,3,4,5);
List<Integer>factorial2 = factorial.stream().map(x -> {
	int fact = 1;
	for(int i = 1;i<= x;i++)
		fact = fact*i;
	return fact;
}).collect(Collectors.toList());
System.out.println(factorial2);
}
} 