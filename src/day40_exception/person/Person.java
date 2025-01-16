package day40_exception.person;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        //this.name = name;
        if(name.isBlank() || name.isEmpty()){
            //System.out.println("invalid name");
            throw new Exception("invalid name!");// compile time exception
        }else{
            this.name = name;
        }



    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this.age = age;
        if(age < 0 ){
            throw new RuntimeException("invalid age!"); // runtime exception
        }else{
            this.age = age;
        }

    }
}
