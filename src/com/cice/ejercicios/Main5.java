package com.cice.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        numeros = new int[]{1,2,3,4,5};
        //numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.println(numero);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        int condicion = 3;

        while(numeros[4] > condicion && 1 == 1){
            System.out.println(condicion++); // 3 y 4
        }
        System.out.println("//////////////");
        do{
            System.out.println(condicion); // 5
        }while(numeros[4] > condicion);


    }
}
