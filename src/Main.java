public class Main {
    public static void main(String[] args) {
        Shape triangle=new Triangle("Triangle",4.2,2.6,4.2);
        System.out.println(triangle.getPerimeter());
        Shape trapezoid=new Trapezoid("Trapezoid",6.2,4.2,3.2,4.2);
        System.out.println(trapezoid.getPerimeter());
        Shape rectangle=new Rectangle("Rectangle",8.2,4.4);
        System.out.println(rectangle.getPerimeter());
        Shape isoscelesTriangle=new IsoscelesTraingle("Isosceles",4.2,6.4);
        System.out.println(isoscelesTriangle.getPerimeter());
        Shape rhombus=new Rhombus("Rhomb",8.0);
        System.out.println(rhombus.getPerimeter());

    }
}