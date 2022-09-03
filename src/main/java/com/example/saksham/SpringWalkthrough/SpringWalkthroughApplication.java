package com.example.saksham.SpringWalkthrough;

import com.example.saksham.SpringWalkthrough.sortAlgorithm.BubbleSort;
import com.example.saksham.SpringWalkthrough.sortAlgorithm.MergeSort;
import com.example.saksham.SpringWalkthrough.sortAlgorithm.QuickSort;
import com.example.saksham.SpringWalkthrough.util.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWalkthroughApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWalkthroughApplication.class, args);
		int result = new BinarySearchImpl(new QuickSort()).binarySearchImpl(new int[] {}, 3);
		System.out.println(result);
	}

}
