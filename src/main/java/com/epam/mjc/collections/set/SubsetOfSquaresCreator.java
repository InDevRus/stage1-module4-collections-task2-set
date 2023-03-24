package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        var treeSet = new TreeSet<Integer>();
        for (var element : sourceList) {
            treeSet.add(element * element);
        }
        return treeSet.subSet(lowerBound, upperBound + 1);
    }
}
