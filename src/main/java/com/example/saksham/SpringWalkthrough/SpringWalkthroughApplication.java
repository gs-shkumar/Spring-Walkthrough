package com.example.saksham.SpringWalkthrough;

import com.example.saksham.SpringWalkthrough.sortAlgorithm.QuickSort;
import com.example.saksham.SpringWalkthrough.util.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWalkthroughApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringWalkthroughApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {}, 3);
		System.out.println(result);
	}

}
