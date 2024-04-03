import java.util.*;

public class ArrayListDemo {
  
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        // size(): This method returns the number of elements in the ArrayList.
        System.out.println("ArrayList Size: " + list.size());
        
        
        // add(E element): This method is used to add an element to the end of the ArrayList.
        list.add("A");
        list.add("B");
        list.add("A");
        
        System.out.println("After added element: " + list);
        
        // add(int index, E element): This method is used to add an element at a specific index in the ArrayList.
        list.add(1, "X");
        System.out.println("\nAfter added element at 1st index: " + list);
        
        System.out.println("After added element ArrayList Size: " + list.size());
        
        
        // remove(int index): This method is used to remove the element at a specific index from the ArrayList.
        list.remove(1); // Removes the element at index 1
        System.out.println("\nAfter removed 1st index value: " + list);
        
        // remove(Object obj): This method is used to remove the first occurrence of a specified element from the ArrayList.
        list.remove("A"); // Removes the first occurrence of "A"
        System.out.println("After removed element A: " + list);
        
        System.out.println("\nAfter removed element ArrayList Size: " + list.size());
        
        list.add("A");
        System.out.println("\n" + list);
        
        // list.removeAll(Collections.singleton(Object obj)) removes all occurrences of element from the ArrayList list.
        list.removeAll(Collections.singleton("A"));  // Removes the all occurrence of "A"
        System.out.println("After removed all occurence of A: " + list);
        
        list.add("C");
        list.add(0, "A");
        
        
        System.out.println("\n" + list);
        
        // get(int index): This method is used to get the element at a specific index from the ArrayList.
        String element = list.get(0); // Retrieves the element at index 0
        System.out.println("Value at 0th index = " + element);
        
        
        // set(int index, E element): This method is used to update the element at a specific index in the ArrayList.
        list.set(0, "D"); // Updates the element at index 0 to "D"
        System.out.println("\nAfter updating 0th index value: " + list);
        
        
        // clear(): This method is used to remove all the elements from the ArrayList.
        list.clear();   // clear the ArrayList
        System.out.println("\nAfter clear ArrayList: " + list);
        System.out.println("After clear ArrayList Size: " + list.size());
        
        
        // isEmpty(): This method returns true if the ArrayList is empty, otherwise false.
        boolean empty = list.isEmpty();
        System.out.println("\nArrayList is empty or not: " + empty);
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        
        
        System.out.println("\n" + list);
        
        // contains(Object obj): This method is used to check if the ArrayList contains a specific element. It returns true if the element is present, otherwise false.
        boolean containsElement1 = list.contains("A");
        boolean containsElement2 = list.contains("X");
        System.out.println("ArrayList contains element A or not: " + containsElement1);
        System.out.println("ArrayList contains element X or not: " + containsElement2);
        
        ArrayList<String> checkList = new ArrayList<>();
        checkList.add("B");
        checkList.add("C");
        
        // containsAll(Collection<?> c): This method is used to check if the ArrayList contains all the elements of a specified collection. It returns true if all elements are present, otherwise false.
        boolean containsAll = list.containsAll(checkList);
        System.out.println("ArrayList contains all elements of containsAll ArrayList: " + containsElement2);

        
        // indexOf(Object obj): This method is used to find the index of the first occurrence of a specified element in the ArrayList. If the element is not found, it returns -1.
        int index1 = list.indexOf("B");
        int index2 = list.indexOf("X");
        System.out.println("\nIndex of B: " + index1);
        System.out.println("Index of X: " + index2);
        
        // lastIndexOf(Object obj): This method is used to find the index of the last occurrence of a specified element in the ArrayList. If the element is not found, it returns -1.
        int index3 = list.indexOf("A");
        int index4 = list.lastIndexOf("A");
        System.out.println("Index of A: " + index3);
        System.out.println("Last index of A: " + index4);


        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("E");
        anotherList.add("F");
        anotherList.add("G");
        
        System.out.println("\nBefore added new ArrayList: " + list);
        
        // addAll(Collection<? extends E> c): This method is used to append all the elements of a specified collection to the end of the ArrayList.
        list.addAll(anotherList);
        System.out.println("After  added new ArrayList: " + list);

        // addAll(int index, Collection<? extends E> c): This method is used to insert all the elements of a specified collection into the ArrayList at a specified position.
        list.addAll(0, anotherList);
        System.out.println("After added new ArrayList from 0th index: " + list);


        // toArray(): This method is used to convert the ArrayList to an array.
        Object[] arr = list.toArray();
        System.out.println("\nArray arr elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        
        // subList(int fromIndex, int toIndex): This method returns a view of the portion of the ArrayList between the specified fromIndex (inclusive) and toIndex (exclusive).
        List<String> subList = list.subList(1, 4);
        System.out.println("\n\nSub-list1: " + subList);
  
    }
}
