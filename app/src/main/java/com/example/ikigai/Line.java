package com.example.ikigai;

public class Line extends Shape {
    private int x1, y1;
    private int x2, y2;

    public Circle(int _x, int _y, int _x2, int _y2) {
        this.x1 = _x;
        this.y1 = _y;
        this.x2 = _x2;
        this.y2 = _y2;
    }


    public int GetX1()
    {
        return x1;
    }

    public int GetX2()
    {
        return x2;
    }

    public int GetY1()
    {
        return y1;
    }

    public int GetY2()
    {
        return y2;
    }


}
