package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {

        AudioBook ab1 = new AudioBook();
        //ab1 object has access to 9 instance variables
        ab1.duration =100;
        ab1.narrator = "morgan freeman";
        ab1.title = "java is awesome";
        ab1.listen();
        EBook eb1 = new EBook();
        //eb1 has access to 9 instance varaibles

        eb1.size = 10;
        eb1.pages = 600;
        eb1.title = "selenium";
        eb1.read();


        Book b1 = new Book();
//        b1.author = "Ab Jerry";
        Author a1 = new Author("feyruz jerry", 23);

        System.out.println(a1);

        Book b2 = new Book();
        System.out.println(b2.author);
        b2.author = new Author("nadir softskills", 30);
        System.out.println(b2.author);

        AudioBook ab3 = new AudioBook();
        ab3.author = new Author("tom freeman",40);
        System.out.println(ab3.author  );

    }
}
