package com.sarunas.sliogeris.overview;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Sarunas");
        names.add("Kestis");
        names.add("Pete");
        names.add("Dzonis");
        names.add("Kuzia");

        //rusioja pagal dydziausia
        Collections.sort(names);

        //spausdina vardus naujose eilutese
        for(String name: names) {
            System.out.println(name);
        }
        // spausdina 3 pozicija
        System.out.println(names.get(3));
        // spausdina irasu skaiciu
        System.out.println(names.size());
        // tikrina ar tuscias
        System.out.println(names.isEmpty());
        // tikrina ar yra jonas
        System.out.println(names.contains("Jonas"));
        //



    }

}
