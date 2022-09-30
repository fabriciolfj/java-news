package com.github.fabriciolfj.javanews.jep427;

public record Circulo(int area) implements Forma {

    @Override
    public double  calcula() {
        return area * 3.14;
    }
}
