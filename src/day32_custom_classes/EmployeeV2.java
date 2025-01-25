package day32_custom_classes;

public class EmployeeV2 {
    String name;
    int id;
    String jobTitle;
    double salary;


    public EmployeeV2 (String name,String jobTitle){
        this.name=name;
        this.jobTitle=jobTitle;
    }

    public EmployeeV2(String name, double salary, int id, String jobTitle) {
       this(name,jobTitle);
//        this.name = name;
        this.salary = salary;
        this.id = id;
//        this.jobTitle = jobTitle;
    }
    public void goToMeeting (){
        System.out.println(name+ " is going to a meeting");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
