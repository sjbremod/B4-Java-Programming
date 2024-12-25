package day31_custom_classes;

public class Marker {

    String type;
    String brand;
    String color;

    //make a constructor, so each time an object of this class is made we initialize these instance variables

    public Marker (String inputType, String inputBrand, String inputColor){
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
