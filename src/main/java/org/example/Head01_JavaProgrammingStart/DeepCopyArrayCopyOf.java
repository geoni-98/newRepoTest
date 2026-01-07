package org.example.Head01_JavaProgrammingStart;

import java.util.Arrays;

public class DeepCopyArrayCopyOf {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        System.arraycopy(original, 1, copy, 0, 3);

        System.out.println("original = " + Arrays.toString(original));

        System.out.println("copy = " + Arrays.toString(copy));

    }
}
