package CollectionFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args){

        //HashSet - unordered , unique
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(1);
        System.out.println(set);

        //LinkedSet - ordered, unique
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        lset.add(10);
        lset.add(1);
        lset.add(1);
        System.out.println(lset);

        //TreeSet - ascending order, unique
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(1);
        tset.add(12);
        tset.add(10);
        tset.add(6);
        System.out.println(tset);
    }
}
