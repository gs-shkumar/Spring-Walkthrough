package com.example.saksham.SpringWalkthrough.util;

import com.example.saksham.SpringWalkthrough.sortAlgorithm.BubbleSort;
import com.example.saksham.SpringWalkthrough.sortAlgorithm.SortInterface;

public class BinarySearchImpl {

    private SortInterface sortInterface;

    public BinarySearchImpl(SortInterface sortInterface) {
        this.sortInterface = sortInterface;

    }

    public int binarySearchImpl(int[] numbers, int num) {

        numbers = sortInterface.sortNumbers(numbers);

        return num;
    }
}
