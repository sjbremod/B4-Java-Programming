package day34_b_encapsulation;

public class UseSquare {
    public static void main(String[] args) {
        Square square1= new Square(10);

        Square square2= new Square(20);
        // square1.side = 30; // cant do this anymore
        Square square3= new Square(-30);

        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);

    // how can i give indirect access to read the side for each object

        System.out.println(square1.getSide());
        System.out.println(square2.getSide());
        System.out.println(square3.getSide()); // 0 becuase -30 doesnt get passed bc its makes the condition false





    }
}
