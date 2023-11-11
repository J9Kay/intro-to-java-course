package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            int currentElement = iterator.previous();
            if (currentElement< minValue)
                iterator.remove();
        }


    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        Set<Integer> seen = new HashSet<>();
        return integers.stream().anyMatch(element -> !seen.add(element)); 
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        return Stream.concat(ints1.stream(), ints2.stream())
                     .distinct()
                     .sorted()
                     .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        Set<Integer> set1 = new HashSet<>(ints1);

        return ints2.stream()
                    .filter(set1::contains)
                    .collect(Collectors.toSet()) // Remove duplicates
                    .stream()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
       
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        if (list.isEmpty()) {
            return "";
        }

        Map<String, Long> counts = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return counts.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("");
   
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
