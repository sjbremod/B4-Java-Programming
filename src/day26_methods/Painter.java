package day26_methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw("blue");
        Picture.draw("red","yellow");
        Picture.draw("red","yellow","pink");
        Picture.draw(3, "purple");
        Picture.draw(3, "purple");
        Picture.draw(6);
        Picture.draw("green",5);
        Picture.draw(false);
        Picture.draw(49.99);


    }

}
