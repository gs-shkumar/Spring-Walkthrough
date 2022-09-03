package com.example.saksham.SpringWalkthrough.sortAlgorithm;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSort implements SortInterface {
    public int[] sortNumbers(int[] numbers) {
        return  numbers;
    }
}
