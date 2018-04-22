package pl.edu.ur.oopl7.zad3;

public class Main {
    public static void main(String[] args)
    {


    Point2d p1 = new Point2d().randomPoints();
    Point3d p2 = new Point3d().randPoint();
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Point2d[] array2D = new Point2d[100];
        Point3d[] array3D = new Point3d[100];

            for(int i=0;i<100;i++)
            {
                array2D[i] = new Point2d().randomPoints();
                array3D[i] = new Point3d().randPoint();
            }

            for(int i=0;i<100;i++)
            {
                if(array2D[i].getX()==array3D[i].getX() && array2D[i].getY()==array3D[i].getY())
                {
                    System.out.println("Punkt 2d - "+array2D[i].toString()+" ,Punkt 3d -"+array3D[i].toString());
                }
            }
    }


}
