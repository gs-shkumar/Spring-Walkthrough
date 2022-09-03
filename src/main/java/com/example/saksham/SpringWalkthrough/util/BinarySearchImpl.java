package com.example.saksham.SpringWalkthrough.util;

import com.example.saksham.SpringWalkthrough.sortAlgorithm.BubbleSort;

public class BinarySearchImpl {
    public int binarySearchImpl(int[] numbers, int num) {

        BubbleSort sort = new BubbleSort();

        numbers = sort.bubbleSort(numbers);

        return num;
    }
}
