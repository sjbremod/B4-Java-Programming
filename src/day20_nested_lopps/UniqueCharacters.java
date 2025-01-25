package day20_nested_lopps;
// IQ find the unique characters
public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AbbCD$STGF(";
        // find the only unique chars
        //outer loop
        for (int i = 0; i <str.length() ; i++) {
            char eachLetter1stLoop = str.charAt(i);
            int count = 0;
            //inner loop
            for (int j = 0; j <str.length() ; j++) {
                char eachLetter2ndLoop = str.charAt(j);
                if (eachLetter1stLoop==eachLetter2ndLoop){
                    count++;
                }
            }

            if(count ==1){
                System.out.print(eachLetter1stLoop);
            }
        }
    }
}
