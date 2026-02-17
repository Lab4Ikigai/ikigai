package com.example.ikigai;

public class Diamond extends Shape {
    private int sideLength;

    public Diamond(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
