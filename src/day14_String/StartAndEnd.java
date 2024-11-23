package day14_String;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Loopcamp";
        String str2 = "LOOp";
        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));
        System.out.println();
        // improved/ implemented the code in way that it does not care about case sen
        System.out.println(str.toLowerCase().startsWith("loop".toLowerCase()));
        System.out.println(str.toLowerCase().startsWith(str2.toLowerCase()));
        System.out.println();
        System.out.println(str.startsWith("Loopcamp"));
        System.out.println();
        String str3 = "Loop";
        System.out.println(str.startsWith(str3));
        System.out.println(str.startsWith(" Loop"));// false because of the first space
        System.out.println(str.startsWith(   "Loop"));
        System.out.println();

        String sentence = "Thursday is a java class day";
        System.out.println(sentence.startsWith("Thur"));
        System.out.println();
        System.out.println(sentence.endsWith("day"));
        System.out.println();
        boolean hasStart = str.startsWith("Loop");
        boolean hasSameEnd= str.endsWith("camp");
        System.out.println(hasStart);
        System.out.println(hasSameEnd);

        //System.out.println(str.startsWith('L')); doesnt work because its a char


    }

}
