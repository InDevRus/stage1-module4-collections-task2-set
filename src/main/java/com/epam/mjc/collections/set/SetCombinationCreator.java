package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        var setCombination = new HashSet<String>();

        for (var element : firstSet.size() < secondSet.size() ? firstSet : secondSet) {
            if (firstSet.contains(element) && secondSet.contains(element) && !thirdSet.contains(element)) {
                setCombination.add(element);
            }
        }

        for (var element : thirdSet) {
            if (!firstSet.contains(element) && !secondSet.contains(element)) {
                setCombination.add(element);
            }
        }

        return setCombination;
    }
}
