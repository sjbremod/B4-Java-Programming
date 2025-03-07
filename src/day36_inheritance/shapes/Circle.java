package day36_inheritance.shapes;

public class Circle extends Shape {
double  radius;

public Circle(double radius) {
super("Circle");
this.radius = radius;



}
    @Override
    public double area(){
        return radius * radius * Math.PI;
    }
    @Override
    public double perimeter(){
        return 2 * radius * Math.PI
                ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", perimeter="+ perimeter()+
                '}';
    }
}
