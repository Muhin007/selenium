package com.github.muhin007.sandbox;

public class Point {
    private int x, y;

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }
}
