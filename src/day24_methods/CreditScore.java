package day24_methods;

import org.w3c.dom.ls.LSOutput;

/*
write a code that returns a credit score base on your name
write a code that checks if it is good or not good score
 */
public class CreditScore {
    public static void main(String[] args) {
        String name1 = "Tom";
        getCreditScore("Tom");
        getCreditScore(name1);

        System.out.println(getCreditScore("Jerry"));
        System.out.println(getCreditScore(name1));

        System.out.println();
        int score = 650;
        isGoodScore(score);
        System.out.println(isGoodScore(score));


        System.out.println( );
        boolean isGood = isGoodScore(800);
        System.out.println(isGood);

        System.out.println();
       int scoreMike=  getCreditScore("Mike");
       boolean isGoodScoreMike = isGoodScore(scoreMike);

        System.out.println( isGoodScore(getCreditScore("Mike") ) );


    }

    public static int getCreditScore(String name) {
        int score = 0;
        if (name.equalsIgnoreCase("Tom")) {
            score = (800);
        } else if (name.equalsIgnoreCase("Jerry")) {
            score = (750);
        }else if(name.equalsIgnoreCase("Winnie")){
            score = 680;
        }else if (name.equalsIgnoreCase("Mike")){
            score = 700;
        }else {
            score = -1;

        }
        return score;
    }
    public static boolean isGoodScore(int score){
        boolean result = false;
        if (score<=600){
            result = false;
        }else{
            result = true;
        }

        return result;
    }
}
