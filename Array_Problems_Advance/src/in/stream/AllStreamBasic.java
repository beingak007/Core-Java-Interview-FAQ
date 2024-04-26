package in.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllStreamBasic {
	
public static void main(String[] args) {
		
		
//		Creating the Simple list to perform the operation Below
		List<Integer> list=Arrays.asList(6,3,9,3,2,7);
		
//		Find the List in Even Number present in List
		List<Integer> EvenNumber = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("Even Number is : "+EvenNumber);
//		o/p--> Even Number is : [6, 2]
		
		
		
//		Find the odd Number is present in List
		List<Integer> oddNum = list.stream().filter(a->a%2!=0).collect(Collectors.toList());
		System.out.println("Odd Number is : "+oddNum);
//		o/p--> Odd Number is : [3, 9, 3, 7]
		
//		Find the Max Number Present List
		Integer Maximum= list.stream().max((a,b)->a-b).get();
		System.out.println("Maximum Number is : "+Maximum);
//		o/p--> Maximum Number is : 9
		
//		Find the Min Number present in list
		Integer Minimum = list.stream().min((a,b)->a-b).get();		
		System.out.println("Minimum Element is :"+Minimum);
//		o/p-->Minimum Element is :2
		
		
//		Sorting Ascending Order to List above
		List<Integer> ascendingSort = list.stream().sorted().collect(Collectors.toList());
		System.out.println("ASC Order Sort "+ascendingSort);
//		o/p--> ASC Order Sort [2, 3, 3, 6, 7, 9]
		
		
//		Sorting Descending Order to List above
		List<Integer> desOrder = list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println("DESC Order Sort "+desOrder);
//		o/p--> DESC Order Sort [9, 7, 6, 3, 3, 2]
		
		
//		Sum of the Element Present in list
		Integer sum = list.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum of Element :"+sum);
//		o/p--> Sum of Element :30
		
		
//		Average Of the Element of given List
		 double average = list.stream().mapToInt(e -> e).average().getAsDouble();
	      System.out.println("Average of numbers : "+average);
	
//	      o/p--> Average of numbers : 5.0
		
		
		
	}

}
