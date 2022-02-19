package com.lrn.ch1;



import java.util.List;
import java.util.Optional;

public class BinarySearch1 {

	public Optional<Integer> findElement(List<Integer> numberCollection, Integer elementToSearch) {
		System.out.println("Running binary search algo");
		//assumptions
		assert numberCollection != null : "List is null";
		assert !numberCollection.isEmpty() : "List is empty";
		assert elementToSearch != null : "element to search is null";

		//Binary search algorithm
		int low = 0, high = numberCollection.size();
		int mid;
		int guess;
		Optional<Integer> result = Optional.empty();
		while(low <= high) {
			mid = (low+high)/2;
			guess = numberCollection.get(mid);
			if(guess == elementToSearch) {
				result = Optional.of(guess);
				break;
			} else if(guess > elementToSearch) {
				high = mid-1;
			} else {
				low = mid +1;
			}
		}
		return result;
	}

}
