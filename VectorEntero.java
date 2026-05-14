package com.mycompany.mavenproject7;

public class VectorEntero {

    private int v[];
    private int n;

    public VectorEntero() {
        n = 0;
        v = null;
    }

    public VectorEntero(int nx) //Sirve cuando "nx" es mayor a 0
    {
        n = nx > 0 ? nx : 0;
        v = (n > 0 ? new int[n] : null);
    }

    public VectorEntero(int[] vx) {
        n = vx.length;
        v = vx.clone();
    }

    public void setN(int nx) {
        n = nx > 0 ? nx : 0;
        if (n > 0) {
            v = new int[n];
        } else {
            v = null;
        }
    }

    public void setV(int[] vx) {
        n = vx.length;
        v = vx.clone();
    }

    public int contarPositivos() {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] > 0) {
                cont++;
            }
        }
        return cont;
    }

    public int contarNegativos() {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] < 0) {
                cont++;
            }
        }
        return cont;
    }

    private int AleatorioEntre(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public void LlenadoAutomatico(int min, int max) {
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * (max - min) + min);
        }
    }

    public void ImprimirHorizontal() {
        System.out.println("\nIMPRESION HORIZONTAL");

        System.out.print("V = [");
        for (int i = 0; i < n - 1; i++) {
            if ((i + 1) % 30 == 0) {
                System.out.println(v[i] + ", ");
            } else {
                System.out.print(v[i] + ", ");
            }
        }
        System.out.print(v[n - 1] + "]");
    }

    public void ImprimirVertical() {
        System.out.println("\nIMPRESION VERTICAL");
        for (int i = 0; i < n; i++) {
            System.out.println("v[ " + i + "]= " + v[i]);
        }
    }

     public int contarMayores(int limite) {
        int cont = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] > limite) {
                cont++;
            }
        }
        return cont;
    }
}
