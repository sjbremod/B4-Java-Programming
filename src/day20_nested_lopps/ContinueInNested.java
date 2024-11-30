package day20_nested_lopps;

public class ContinueInNested {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            if(i==3){
                continue;
            }
            System.out.println("i: " +i );

            for (int j = 0; j <3 ; j++) {

                System.out.println("j: "+ j );

            }

        }
    }
}
