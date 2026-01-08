package Head04_JCF.example01;

import  java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new  ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("After add: " + fruits);

        String firstfruit = fruits.get(0);
        System.out.println("First fruit: " + firstfruit);

        fruits.remove(1);
        System.out.println("After remove index : " + fruits);

        System.out.println("List size: " + fruits.size());

        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}
