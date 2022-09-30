package com.github.fabriciolfj.javanews.jep427;

public record Quadrado(int x, int y) implements Forma {

    @Override
    public double calcula() {
        return x * y;
    }
}
