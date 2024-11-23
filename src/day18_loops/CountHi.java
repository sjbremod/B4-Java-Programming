package day18_loops;

public class CountHi {
    public static void main(String[] args) {
        // find how many "hi" is in the word

        String word = "aaaahisvsvshisvadhisdvs";
        int count = 0;
        for (int i = 0; i < word.length()-1; i++) {
           if( word.charAt(i)== 'h'&& word.charAt(i+1)== 'i'){
               count++;
           }
        }
        System.out.println("you got " + count + " times \"hi\" in " + word);
        //TODO: try to do this with substring method




    }
}
