package day16_loops;

public class SmsParts {
    public static void main(String[] args) {

      String messesge = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programing and problem solving}";
      // p1
        // substring (index1,index2)
        //index1 messege.indexOf("<");
        //index2 messege.indexOf(">");
        // p2
        //p3
        String part1 = messesge.substring(messesge.indexOf("<")+1, messesge.indexOf(">"));
        String part2 = messesge.substring(messesge.indexOf("[")+1, messesge.indexOf("]"));
       String part3 = messesge.substring(messesge.indexOf("{")+1, messesge.indexOf("}"));

        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);

    }
}
