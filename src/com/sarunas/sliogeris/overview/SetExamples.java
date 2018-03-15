package com.sarunas.sliogeris.overview;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {


        //hashsetas
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(101);
        hashSet.add(12);
        hashSet.add(85);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(3);

        for (Integer hash : hashSet) {
            System.out.println(hash);
        }

        System.out.println("Ilgis " + hashSet.size());
    }

}
