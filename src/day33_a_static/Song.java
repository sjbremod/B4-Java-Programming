package day33_a_static;

public class Song {

    String name;
    double length;
    String singer;
    String genre;

    //1st
    public Song (String name){
        this.name=name;

    }
    public Song (String name, double length){
        this(name);
        this.length = length;
    }

    //3rd


    public Song(String name, double length, String singer, String genre) {
//        this.name = name;
//        this.length = length;
        this(name,length);
        this.singer = singer;
        this.genre = genre;
    }

    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
