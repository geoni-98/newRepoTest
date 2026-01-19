package Head05_ALG.example01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("orange");
        set.add("apple");

        System.out.println(set.contains("orange"));

        System.out.println(set.size());
    }
}
