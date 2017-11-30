package com.cice.ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int numero = 157;
//        int moduloDivision = numero % 2;
//        if (moduloDivision == 0) {
//            System.out.println("El número "+numero+" es par");
//        } else {
//            System.out.println("El número "+numero+" es impar");
//        }

        System.out.println("Introduce un número para que pueda decirte si es par o impar...");

        Scanner sc = new Scanner(System.in);

        int numeroIntroducido = sc.nextInt();
        int moduloDivision = numeroIntroducido % 2;
        if (moduloDivision == 0) {
            System.out.println("El número "+numeroIntroducido+" es par");
        } else {
            System.out.println("El número "+numeroIntroducido+" es impar");
        }

    }
}
