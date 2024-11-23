package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "elephant ";
        String mid = "";

        if (word.length()%2==0){
          //mid= word.substring(word.length()/2-1,word.length()/2+1);
          //mid= ""+word.charAt(word.length()/2-1) + word.charAt(word.length()/2);

        }else{
            mid = "" + word.charAt(word.length()/2);
            //mid = word.substring( word.length()/2, word.length()/2 + 1);
        }
        System.out.println(mid);
    }
}
