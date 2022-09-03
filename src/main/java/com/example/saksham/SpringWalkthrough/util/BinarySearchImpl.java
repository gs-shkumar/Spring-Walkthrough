package com.example.saksham.SpringWalkthrough.util;

import com.example.saksham.SpringWalkthrough.sortAlgorithm.BubbleSort;
import com.example.saksham.SpringWalkthrough.sortAlgorithm.SortInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortInterface sortInterface;

    public int binarySearch(int[] numbers, int num) {

        numbers = sortInterface.sortNumbers(numbers);

        return num;
    }
}
