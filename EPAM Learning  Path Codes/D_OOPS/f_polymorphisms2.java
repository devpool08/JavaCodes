package D_OOPS;

class Figure {
    protected double dim1;
    protected double dim2;
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double area() {
        System.out.print("Area of the figure not determined ");
        return 0.0;
    }
}
class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double area() {
        System.out.print("Area of the rectangle ");
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double area() {
        System.out.print("Area of the triangle ");
        return dim1 * dim2 / 2;
    }
}
public class f_polymorphisms2 {

    /*Dynamic-Late Binding*/

    public static void main(String[] args) {
        Figure f = new Figure(10.0, 5.0);
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(10.0, 8.0);
        Figure figref;
        figref = r;
        System.out.println( figref.area() );
        figref = t;
        System.out.println( figref.area() );
        figref = f;
        System.out.println( figref.area() );
    }
}