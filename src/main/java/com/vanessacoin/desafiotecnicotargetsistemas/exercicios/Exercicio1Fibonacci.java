package main.java.com.vanessacoin.desafiotecnicotargetsistemas.exercicios;

import main.java.com.vanessacoin.desafiotecnicotargetsistemas.utils.FibonacciUtil;

public class Exercicio1Fibonacci {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void run() {
        if (FibonacciUtil.isFibonacci(this.numero)) {
            System.out.println(this.numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(this.numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
