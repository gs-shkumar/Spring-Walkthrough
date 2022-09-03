package com.example.saksham.SpringWalkthrough;

import com.example.saksham.SpringWalkthrough.util.BinarySearchImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ScopeUnderstanding {
    @Autowired
    ApplicationContext applicationContext;

    public void scopeTest() {
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        binarySearch.binarySearch(new int[] {}, 3);
        System.out.println("ScopeUnderstanding: " + binarySearch);

    }
}
