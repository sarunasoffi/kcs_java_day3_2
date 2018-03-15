package com.sarunas.sliogeris.overview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {

        Map<String, String> numberNames = new LinkedHashMap<>();

        numberNames.put("Pirmas", "Jonas");
        numberNames.put("Antras", "Kazlas");
        numberNames.put("Trecias", "Domce");
        numberNames.put("Ketvirtas", "Armuxa");
        numberNames.put("Penktas", "Kestis");
        numberNames.put("Trecias", "Lygiukas");

        for (String numberName : numberNames.keySet()) {
            System.out.println(numberName + " " + numberNames.get(numberName));
        }

    }

}
