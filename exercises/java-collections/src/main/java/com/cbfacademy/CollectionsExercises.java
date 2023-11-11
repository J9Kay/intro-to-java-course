package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        //throw new RuntimeException("Not implemented");
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(4); // Adds 4 as the first element
        integers.add(5); // Adds 5 at the end
        integers.add(6); // Adds 6 at the end
        integers.add(8); // Adds 8 at the end
        integers.add(2); // Adds 2 at the end
        integers.add(9); // Adds 9 at the end
        integers.addLast(2); // Adds another 2 at the end
        integers.add(2, 4); // Adds 4 at the 3rd position (index 2)

        // Invoking the method element() and printing the result
        System.out.println(integers.element());

        return integers;

    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        //throw new RuntimeException("Not implemented");
        Stack<Integer> integers = new Stack<>();
        integers.push(5);
        integers.push(6);
        integers.push(8);
        integers.push(9);

        String result = "" + integers.elementAt(0)    // First element (bottom of the stack)
        + integers.peek()              // Last element (top of the stack)
        + integers.pop();              // Pop the top element and add to string

        // Print the concatenated result
        System.out.println(result);

        // Push 4 onto the stack
        integers.push(4);

        return integers;

    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        //throw new RuntimeException("Not implemented");
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);
        String result = "" + integers.getFirst()
        + integers.getLast() 
        + integers.poll()
        + integers.element();
        System.out.println(result);
        return integers;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> map = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        System.out.println("" + keys + values + map.containsValue("English"));


        return map;
        //throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
