package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("task1.txt"));

            Map<String, Integer> statistics = new HashMap<>();
//            int max = 0;
            while (sc.hasNext()) {
                String word = sc.useDelimiter("\\s+").next();
                Integer count = statistics.get(word);

                if (count == null) {
                    count = 0;
                }
                statistics.put(word, ++count);

//                if (count >= max) {
//                    max = count;
//                }
            }
            System.out.println(statistics);
            System.out.println("Наибольшее число повторений: " + Collections.max(statistics.entrySet(), Comparator.comparing(Map.Entry::getValue)));

            Set<String> words1 = new TreeSet<>();
            words1.addAll(statistics.keySet());
            while (sc.hasNext()) {
                String words2 = sc.useDelimiter("\\s+").next();
                words1.add(words2);
            }
            System.out.println(words1);
        } catch (FileNotFoundException sc) {
            System.out.println("File Not found");
        }

    }
}
