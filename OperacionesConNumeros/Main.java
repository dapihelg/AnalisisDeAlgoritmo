package OperacionesConNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int suma = 0;
        int suma2 = 0;
        int nums = 0;
        int nums2 = 0;

        int numero = 0;

        int resp = 0, resp2= 0, resp3 = 0;
        String resp5="", resp4="";


        System.out.println("elige una opción"+" 1.- suma con for o 2.- multiplicación ");
        resp3 = in.nextInt();
        if(resp3 == 1) {
            do {

                System.out.println("Número que desea sumar ");
                nums = in.nextInt();

                System.out.println("Número de veces que desea sumar el número ");
                resp = in.nextInt();
                OperacionesConNumeros opn = new OperacionesConNumeros(suma, suma2, nums, nums2, numero, resp, resp2);

                for (int i = 0; i < resp; i++) {
                    suma += nums;
                }

                System.out.println("el resultado es: " + suma);

            } while (resp5.equalsIgnoreCase("si"));
        }else{

            do {

                System.out.println("Número que desea multiplicar ");
                nums2 = in.nextInt();

                System.out.println("Número de veces que desea multiplicar el número ");
                resp2 = in.nextInt();
                OperacionesConNumeros opn = new OperacionesConNumeros(suma, suma2, nums, nums2, numero, resp, resp2);

                suma2 = nums2*resp2;

                System.out.println("el resultado es: " + suma2);

            } while (resp4.equalsIgnoreCase("si"));
        }

    }

}
