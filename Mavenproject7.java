package com.mycompany.mavenproject7;

public class Mavenproject7 {

    public static void main(String[] args) {
        int v[] = {-3, 0, 8, 5};
        int n = v.length;
        int min = 2;
        int max = 15;
        VectorEntero v1 = new VectorEntero();

        /*v1.setV(v);
        v1.ImprimirHorizontal();
        v1.ImprimirVertical();*/
        
        n = 100;
        v1.setN(100);
        v1.LlenadoAutomatico(-n, 2*n);
        v1.ImprimirHorizontal();
        v1.ImprimirVertical();
        System.out.println("Cantidad de positivos: " + v1.contarPositivos());
        System.out.println("Cantidad de negativos: " + v1.contarNegativos());
        int limite = 50;
        System.out.println("Cantidad de números mayores a " + limite + ": " + v1.contarMayores(limite));
    }
}
