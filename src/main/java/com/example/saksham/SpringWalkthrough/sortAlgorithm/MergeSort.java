package com.example.saksham.SpringWalkthrough.sortAlgorithm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MergeSort implements SortInterface {
    public int[] sortNumbers(int[] numbers) {
        return  numbers;
    }
}
