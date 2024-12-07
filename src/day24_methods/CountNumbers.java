package day24_methods;

public class CountNumbers {
    public static void main(String[] args) {
        countUpToNum(5);
        countUpToNum(10);

        int a = 100;
        countUpToNum(a);

    }

    public static void countUpToNum(int num){
        for (int i = 0; i <= num; i++) {
            System.out.println(i+ " ");
        }
        System.out.println();
    }
}
