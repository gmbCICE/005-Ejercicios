package com.cice.ejercicios;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora por favor:");
        int horaIntroducida = sc.nextInt();

        if(horaIntroducida >= 6 && horaIntroducida < 12){
            System.out.println("Son las "+horaIntroducida+", ¡buenos días!");
        } else if(horaIntroducida >= 12 && horaIntroducida < 21){
            System.out.println("Son las "+horaIntroducida+", ¡buenas tardes!");
        } else if((horaIntroducida >= 0 && horaIntroducida < 6) || (horaIntroducida >=21 && horaIntroducida <= 24)){
            System.out.println("Son las "+horaIntroducida+", ¡buenas noches!");
        } else {
            System.out.println("No has introducido una hora valida...");
        }
/*
        switch (horaIntroducida) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Buenas noches");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Buenos dias");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenas tardes");
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Buenas noches");
                break;
            default:
                System.out.println("No has introducido una hora válida...");
        }
*/


        boolean esCierto = (2 == 4);
        boolean esFalso = false;

        if(!esCierto) {
            System.out.println("Es cierto...");
        } else {
            System.out.println("No es cierto...");
        }


    }

}
