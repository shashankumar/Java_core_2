package com.sk.First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class First {

	public static void main(String[] args) {
		
		int [] array1 = {1,2,3,4,5};
		int[] array2 = {10,20,30,40,50};
				
		//copying first two elements from array1 to array2 starting from index 2 of array2
		System.arraycopy(array1, 0, array2, 2, 3);
				
		System.out.println(Arrays.toString(array2)); //prints "[10, 20, 1, 2, 50]"
		

//		//Get System Defined Properties
//		Properties systemProps = System.getProperties();
//		Set<Object> keySet = systemProps.keySet();
//		for(Object obj : keySet){
//			String key = (String) obj;
//			System.out.println("{"+obj+"="+systemProps.getProperty(key)+"}");
//		}
//		
		//get unmodifiable environment variables map
		Map<String, String> envMap = System.getenv();
		Set<String> keySet = envMap.keySet();
		for(String key : keySet){
			System.out.println("Key="+key+",value="+envMap.get(key));
		}

		//Get Specific environment variable
		String pathValue = System.getenv("PATH");
		System.out.println("$PATH="+pathValue);
		
		long nanoTime = System.nanoTime();
		System.out.println("Current nano time="+nanoTime);
		
		System.out.println(System.getProperty("user.country"));
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(30);
		
		System.out.println("values are " +" " +al);
		
		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		

	}

}
