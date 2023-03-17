package com.github.fabriciolfj.javanews.jep405;

import java.util.List;

public class TestInstanceOfNew {

    public static void main(String[] args) {
        //printSum(new Point( 3, 4));
        var rectangle = new Rectangle(new ColoredPoint(new Point(1, 2), Color.BLUE),
                new ColoredPoint(new Point(4, 5), Color.RED));

        if (rectangle instanceof Rectangle(ColoredPoint(Point p, Color c) v1, ColoredPoint v2)) {
            System.out.println(v2.c());
        }
    }

    private static void forArray() {
        var list = List.of(new Point(1, 2), new Point(5,4));

        for (Point(var x, var y) : list) {
            System.out.println(x + y);
        }
    }


    private static void printSum(Object p) {
        if (p instanceof Point(int x, int y)) {
            System.out.println(x + y);
        }
    }
}