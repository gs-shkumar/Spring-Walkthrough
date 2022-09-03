package com.example.saksham.SpringWalkthrough.util;

import com.example.saksham.SpringWalkthrough.sortAlgorithm.SortInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("merge")
    private SortInterface bubbleSort;

    @Autowired
    @Qualifier("quickSort")
    private SortInterface quickSort;

    BinarySearchImpl() {


    }

    public int binarySearch(int[] numbers, int num) {

        System.out.println("sortInterface: "+ quickSort );
        System.out.println("bubbleSort: "+ bubbleSort);
        numbers = bubbleSort.sortNumbers(numbers);

        return num;
    }
}
