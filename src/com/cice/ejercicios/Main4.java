package com.cice.ejercicios;

import com.sun.tools.doclint.Entity;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroSolicitado;
        long factorial = 1;

        System.out.print("Querido usuario, introduce un número para calcular su factorial: ");
        numeroSolicitado = sc.nextInt();

        for (int i = 1; i <= numeroSolicitado; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de "+numeroSolicitado+" es: "+factorial);

    }

}
