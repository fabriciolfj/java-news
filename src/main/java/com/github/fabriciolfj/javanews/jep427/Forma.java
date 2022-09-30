package com.github.fabriciolfj.javanews.jep427;

public sealed interface Forma permits Quadrado, Circulo {

    double calcula();
}
