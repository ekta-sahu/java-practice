package CollectionFramework;

import JavaGenerics.Arraylist;

import java.util.*;

public class ListInterface {
//The Java Collection Framework (JCF) is a collection of classes and interfaces in Java
// used to store, manage, and manipulate groups of objects dynamically.
//In simple words, it provides ready-made data structures like Lists, Sets, Queues, and
// Maps so that you don't have to implement them yourself.
// arraylist( non- synchronized ) is faster than vector as vector is synchronized ( Thread Safe )

    public static void main(String[] args){
        //list

        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2,25);
        System.out.println(list);

        //LinkedList
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(1,12);
        linkedlist.remove(1);
        System.out.println(linkedlist);

        //Vector - thread safe( synchronized )
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");
        System.out.println(vector);
        vector.clear();

        //Stack - LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
