package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    private Collection<Integer> divideByTwoUntilOdd(Integer number) {
        var result = new ArrayList<Integer>();
        result.add(number);
        do {
            number /= 2;
            result.add(number);
        } while (number % 2 == 0);
        return result;
    }

    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        var result = new HashSet<Integer>();
        for (var element : sourceList) {
            result.addAll(element % 2 == 0 ? divideByTwoUntilOdd(element) : List.of(element, 2 * element));
        }
        return result;
    }
}
