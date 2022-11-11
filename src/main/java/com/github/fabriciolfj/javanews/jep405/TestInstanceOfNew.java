package com.github.fabriciolfj.javanews.jep405;

public class TestInstanceOfNew {

    public static void main(String[] args) {
        //printSum(new Point( 3, 4));
        var rectangle = new Rectangle(new ColoredPoint(new Point(1, 2), Color.BLUE),
                new ColoredPoint(new Point(4, 5), Color.RED));

        if (rectangle instanceof Rectangle(ColoredPoint(Point p, Color c) v1, ColoredPoint v2)) {
            System.out.println(v2.c());
        }
    }

    private static void printSum(Object p) {
        if (p instanceof Point(int x, int y)) {
            System.out.println(x + y);
        }
    }
}