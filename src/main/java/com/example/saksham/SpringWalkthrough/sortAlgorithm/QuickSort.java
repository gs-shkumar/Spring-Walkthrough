package com.example.saksham.SpringWalkthrough.sortAlgorithm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quickSort")
public class QuickSort implements SortInterface {

    public int[] sortNumbers(int[] numbers) {
        return  numbers;
    }

}
