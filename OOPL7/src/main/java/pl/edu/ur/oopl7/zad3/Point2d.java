package pl.edu.ur.oopl7.zad3;

import java.util.Random;

public class Point2d {
    private int x;
    private int y;

    public Point2d(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2d() {

    }

    public Point2d randomPoints()
    {
        Random rand = new Random();
        Point2d p = new Point2d(rand.nextInt(21)-10,rand.nextInt(21)-10);
        return p;
    }
    public String toString()
    {
        return "x("+x+"),y("+y+")";
    }
}
