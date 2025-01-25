package day35_inheritance.book;

public class EBook extends Book {
    //instance variables

//    String author;
//    int authorAge;
//    String genre;
//    String title;
//    int chapterCount;
//    double price;
//    boolean hasMovie;

    double size;//MB
    int pages;
//instance method

public void read() {
    System.out.println("reading "+ title + " which is " + pages +" pages");
}


}
