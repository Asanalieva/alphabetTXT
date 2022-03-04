package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        writing();
        reading();

    }

    public static void writing() {

        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alp2 = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        try {
            FileWriter fileWriter = new FileWriter("text.txt");

            for (int i = 0; i < alp.length(); i++) {
                fileWriter.write(alp.charAt(i) + " " + alp2.charAt(i) + "\n"); //giving by one BIG and small char and so on
            }
            for (int i = 0; i < numbers.length(); i++) {
                fileWriter.write(numbers.charAt(i) + "\n");
            }


            fileWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void reading() throws IOException {

        FileReader reader = new FileReader("text.txt");
        Scanner scanner = new Scanner(reader);
        int i = 0;
        while (scanner.hasNextLine()) {
            i++;
            System.out.println(i + ": " + scanner.nextLine());
        }
        reader.close();

    }
}



