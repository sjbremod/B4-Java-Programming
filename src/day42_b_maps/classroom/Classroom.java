package day42_b_maps.classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {

        Student student1 = new Student ("Tom",30,"ID#001");
        Student student2 = new Student ("Jerry",20,"ID#002");
        Student student3 = new Student ("James",40,"ID#003");
        Student student4 = new Student ("Jimmu",50,"ID#004");

        List<Student>students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student eachStudent : students) {
            System.out.println(eachStudent);
        }

        System.out.println("==============================");
        Map<Integer,List<Student>> studentMap = new HashMap<>();
        studentMap.put(1, students);
        System.out.println(studentMap);
        //key is integer
        //value is list -->4 student objects
        //1 set of kye -value (1 entry)


        System.out.println("==============================");
        Map<Integer,Student>studentMap2 = new HashMap<>();
        studentMap2.put(1, student1);
        studentMap2.put(2, student2);
        studentMap2.put(3, student3);
        studentMap2.put(4, student4);
        System.out.println(studentMap2);
        // key is integer
        // value is student object
        System.out.println("---------------------");
        studentMap2.put(5, new Student("Casey",27,"ID#006"));
        System.out.println(studentMap2);
        System.out.println(studentMap2.size());

    }
}
