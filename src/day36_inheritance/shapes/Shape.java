package day36_inheritance.shapes;

public class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }
    //instance method
    public double area(){
        return 0.0;

    }
    //instance method
    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
