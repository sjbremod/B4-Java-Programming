package day35_inheritance.computer;

public class Mac extends Computer {

    String safariBrowser;
    public Mac(String os, int memory) {
//        this.os =os;
//        this.memory = memory;
super (os, memory);


    }
    public Mac(String os, int memory, String safariBrowser) {
//        this.os =os;
//        this.memory = memory;
        this (os, memory);
        this.safariBrowser = safariBrowser;



    }


}
