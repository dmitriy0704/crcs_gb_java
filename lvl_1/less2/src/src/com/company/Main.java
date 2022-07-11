package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(maceCoffee(4));
//        startCoffeeMachine();

        float[] coffeeCups = startBulkCoffeeMachine();
        for (int i = 0; i < coffeeCups.length; i++) {
            System.out.println("Your coffee: " + startBulkCoffeeMachine());
        }
    }

    /* ================ Циклы ================ */

    static float startCoffeeMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите кофе....");
        int type = scanner.nextInt();
        float val = 0;

        /* while - с предусловием*/
        while (val == 0) {
            System.out.println("Making coffee...");
            val = maceCoffee(type);
        }

        /* do while - с постусловием*/
        do {
            System.out.println("Making coffee...");
            val = maceCoffee(type);
        } while (val == 0);
        return val;
    }

    /**
     * 1 - Espresso
     * 2 - Americano
     * 3 - Latte
     * 4 - Mocachino
     *
     * @param type - coffee type
     * @return
     */
    static float maceCoffee(int type) {
        float val;
        switch (type) {
            case 1: {
                val = 0.3f;
                break;
            }
            case 2: {
                val = 0.5f;
                break;
            }
            case 3: {
                val = 0.7f;
                break;
            }
            case 4: {
                val = 0.9f;
                break;
            }
            default: {
                val = 0.0f;
            }
        }
        return val;
    }

    /* ================ Массивы ================*/

    static float[] startBulkCoffeeMachine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите кофе....");
        int size = scanner.nextInt();
        float[] cups = new float[size];
        for (int i = 0; i < size; i++) {
            cups[i] = startCoffeeMachine();
        }
        return cups;
    }
}
