public class Trapezoid extends Shape {
  private  double a;
   private  double b;
   private  double c;
   private  double d;

    public Trapezoid(String name, double a, double b, double c, double d) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                super.getName();

    }
}



