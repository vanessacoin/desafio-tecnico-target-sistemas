package main.java.com.vanessacoin.desafiotecnicotargetsistemas.exercicios;

public class Exercicio2String {

    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void run() {
        int count = 0;
        char[] chars = texto.toCharArray();

        for (char c : chars) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' foi encontrada " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }
}
