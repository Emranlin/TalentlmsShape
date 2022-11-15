public class Triangle extends Shape{
    private double length;
    private double width;
    private  double medium;

    public Triangle(String name, double length, double width, double medium) {
        super(name);
        this.length = length;
        this.width = width;
        this.medium = medium;
    }

    @Override
    public double getPerimeter() {
        return length+width+medium;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", width=" + width +
                ", medium=" + medium +
                super.getName();
    }
}