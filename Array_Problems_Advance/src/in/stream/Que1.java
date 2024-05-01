package in.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*

Stream API
---------------
-Is Used to achieve Functional pr
-Intermediate Operation + Terminal Operations
-Will Not Modify the date why because stream API not store any data
- will capture data from source
-source may be Arrays or Collections


--We will resolve cpmlexity by using stream api
-- Reduce application code by using stream API
--improve application perforamnce by usin strea api


Without using strem-API Remove dublicate element 


*/

public class Que1 {
	
	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<String>();
		List<String> uniqueList = new ArrayList<String>();
		lst.add("A");
		lst.add("c");
		lst.add("b");
		lst.add("a");
		lst.add("c");
		for (String item : lst) {
			if(!uniqueList.contains(item)) {
				uniqueList.add(item);
			}
			
		}
		System.out.println(uniqueList); //  o/p --> [A, c, b, a]
		
		
		
//		without using forEach Method
//		List<String> dublicate = lst.stream().distinct().collect(Collectors.toList());
//		System.out.println(dublicate);//o/p-->[A, c, b, a]
		
		
//		Using ForEach Method
		lst.stream().distinct().forEach((x)->{
			System.out.println(x);  
//			o/p
//			A
//			c
//			b
//			a
			
			
		});
	}
	
	

}
