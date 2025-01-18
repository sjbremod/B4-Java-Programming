package day42_b_maps.classroom;
// template class we basically build template how the object of this class will behave
public class Student {
    String name;
    int age;
    String ID;


//Custom constructor removes default constructor
    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "Student info: " +
                "name='" + name +
                ", age=" + age +
                ", ID=" + ID +
                ':';
    }
}
