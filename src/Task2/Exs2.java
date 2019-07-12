package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Exs2 {
    public static void main(String[] arg) {
        Map<String, Integer> words = new HashMap<>();

        ArrayList<String> arr = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("task1.txt"));
            while (sc.hasNextLine()) {
                String word = sc.useDelimiter("\\s+").next();
                //arr.add(sc.useDelimiter("\\s+").next());
                arr.add(word);

            }
            sc.close();

        } catch (FileNotFoundException sc) {
            System.out.println("File Not found");
        }
        System.out.println("Not sorted mass: " + arr);


        Collections.sort(arr);
        System.out.println("Sorted mass: " + arr);
        

        for (int i = 0; i < arr.size(); i++) {
            String tempWord = arr.get(i);
            if (!words.containsKey(tempWord)) {
                words.put(tempWord, 1);
            } else {
                words.put(tempWord, words.get(tempWord) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Iter = " + entry.getValue());
        }
    }
}













