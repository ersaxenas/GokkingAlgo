package com.lrn.ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelectionSort {
	
	public static void main(String args[]) {
		System.out.println("Running " + SelectionSort.class.getName());
		ArrayList<Integer> integerList = Stream.of(4,2,5,2,3,45,8,6,9).collect(Collectors.toCollection(ArrayList::new));
		List<Integer> sortedList = sortList(integerList);
		System.out.println(sortedList);
	}
	
	
	public static List<Integer> sortList(List<Integer> list) {
      assert list.isEmpty() : "list is empty";
      ArrayList<Integer> sortedList = new ArrayList<>();
      Integer nextSmallElement = 0;
      int size = list.size();
      for(int cnt=0; cnt < size; cnt++) {
    	      nextSmallElement = findSmallest(list);
    	      sortedList.add(nextSmallElement);
    	      list.remove((Object)nextSmallElement);
      }
      return sortedList;
	}
	
	public static Integer findSmallest(List<Integer> list) {
		assert list.isEmpty() : "list is empty";
		Integer smallestElement = list.get(0);
		for(Integer elem: list) {
			if(elem < smallestElement) {
				smallestElement = elem;
			}
		}
		return smallestElement;
	}
	

}
