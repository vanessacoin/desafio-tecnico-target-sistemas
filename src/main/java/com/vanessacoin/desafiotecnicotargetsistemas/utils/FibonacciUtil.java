package main.java.com.vanessacoin.desafiotecnicotargetsistemas.utils;

public class FibonacciUtil {
    public static boolean isFibonacci(int numero) {
        int a = 0, b = 1, c;
        if (numero == a || numero == b) return true;
        while (true) {
            c = a + b;
            if (c == numero) return true;
            if (c > numero) return false;
            a = b;
            b = c;
        }
    }
}
