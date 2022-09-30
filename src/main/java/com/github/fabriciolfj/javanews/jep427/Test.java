package com.github.fabriciolfj.javanews.jep427;

public class Test {

    public static void main(String[] args) {
        var forma = new Quadrado(5, 5);
        check(forma);

        var forma2 = new Circulo(10);
        check(forma2);
    }

    private static void check(Forma forma) {
        switch (forma) {
            case Quadrado(int x, int y) -> System.out.println("Valor do lado do quadrado " + x);
            case Circulo(int raio) -> System.out.println("Vaor do raio do circulo " + raio);
            default -> System.out.println("Forma nao encontrada");
        }
    }
}
