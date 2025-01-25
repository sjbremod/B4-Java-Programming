package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class UseSong {
    public static void main(String[] args) {

    Song song1 = new Song("Waka Waka");
    Song song2 = new Song("Jingle Bell",3.2);
        System.out.println(song2);
    Song song3 = new Song("hit em up",3.56,"2pac","rap");
        System.out.println(song3);

        System.out.println("*******************************************************************");

        String str1 = "one";
        String str2 = new String("two");

        String [] allStr = {str1 ,str2};
        Song [] allSongs = {song1,song2,song3};
        System.out.println(Arrays.toString(allSongs));
        System.out.println(allSongs[1]);
        System.out.println(allSongs.length);

        for (Song each    :  allSongs){
            System.out.println(each);
        }
        System.out.println();
        //find me the songs that has the length more than 3.3
        for (Song each :  allSongs){
           if( each.length>3.3){
               System.out.println(each);
           }
        }
        System.out.println("*******************************************************************");

        ArrayList <Song> allSongsInList = new ArrayList<>();
        allSongsInList.addAll(Arrays.asList(song1,song2,song3));

        for (  Song each : allSongsInList ){
            System.out.println(each);
        }

        // give me only the song names
        for ( Song each : allSongsInList){
            System.out.println(each.name);
        }




    }
}
