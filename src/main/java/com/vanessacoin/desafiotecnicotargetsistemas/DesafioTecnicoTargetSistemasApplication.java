package main.java.com.vanessacoin.desafiotecnicotargetsistemas;

import main.java.com.vanessacoin.desafiotecnicotargetsistemas.exercicios.Exercicio1Fibonacci;
import main.java.com.vanessacoin.desafiotecnicotargetsistemas.exercicios.Exercicio2String;

public class DesafioTecnicoTargetSistemasApplication {

    public static void runExercicios() {
        System.out.println("Executando Exercicio 1:");
        Exercicio1Fibonacci exercicio1 = new Exercicio1Fibonacci();
        exercicio1.setNumero(13); 
        exercicio1.run();

        System.out.println("Executando Exercicio 2:");
        Exercicio2String exercicio2 = new Exercicio2String();
        exercicio2.setTexto("exemplo"); 
        exercicio2.run();
    }

    public static void main(String[] args) {
        runExercicios();
    }
}