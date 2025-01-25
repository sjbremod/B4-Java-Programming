package day37_a_abstraction.book;

public class Runner {
    public static void main(String[] args) {

            Book obj = new Book();
            obj.read();
            obj.write();
        System.out.println(obj.NAME);// not recommended
        System.out.println(Book.NAME); // proper way to call this
        System.out.println(Create.NAME); // the purpose of interface it to provide additional information specifically abstract




    }
}
