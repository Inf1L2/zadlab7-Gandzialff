package pl.edu.ur.oopl7.zad3;

import java.util.Random;

public class Point3d extends Point2d {
    private int z;

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public Point3d() {

    }

    public int getZ() {
        return z;
    }

    public Point3d randPoint()
    {
        Random rand = new Random();
        Point3d p3d = new Point3d(rand.nextInt(21)-10,rand.nextInt(21)-10,rand.nextInt(21)-10);
        return p3d;
    }

    @Override
    public String toString() {
        return super.toString()+",z("+z+")";
    }
}
