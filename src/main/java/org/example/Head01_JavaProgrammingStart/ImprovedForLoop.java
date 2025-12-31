package org.example.Head01_JavaProgrammingStart;

public class ImprovedForLoop {
    public static void main(String[] args) {
        int[] scores = {90, 85, 78};

        for (int s : scores) {
            System.out.println("점수: " + s);
        }
    }
}
