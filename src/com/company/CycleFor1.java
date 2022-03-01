package com.company;

public class CycleFor1 {
    public static void main(String[] args) {
        //Кузнечик прыгает на 1 см, затем на 2 см....
        int lenght=1;
        int way=0;
/*
        for (int i=0; i<100; i++) {
            way += lenght;
            lenght++;
            System.out.println(way);
            if (way>=50) {
                System.out.println(i + 1);
                break;
            }

        }
 */
        int n=0;
        while (way<50){
            way+=lenght;
            lenght++;
            n++;
        }
        System.out.println(n);

    }
}

