package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello IntelliJ");

        int i = 5;

        if (i == 5) {
            System.out.println("pięć");
        }

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(j*k);
            }
        }


        if (true) {

            if (true) {
                i = 1;
            }
        }
        System.out.print(i);

    }
}
