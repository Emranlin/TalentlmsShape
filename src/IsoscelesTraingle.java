public class IsoscelesTraingle extends Shape{
   private double a;
   private double b;

    public IsoscelesTraingle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*a+b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "IsoscelesTraingle{" +
                "a=" + a +
                ", b=" + b +
                super.getName()+
                '}';
    }
}
