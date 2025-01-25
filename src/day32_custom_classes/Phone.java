package day32_custom_classes;

public class Phone {

   String name;
   String brand;
   int  memory;
   double version;



//    public Phone(){
//
//    }

// java prioritizes local variables over instance variables if they have the same name.  so thats why we need the this.

public Phone (String name,String brand, int memory,double version){
this.name = name;
this.brand = brand;
this.memory = memory;
this.version= version;

}
public Phone (String name){
        this.name = name;


    }
public Phone (String name, String brand,int memory){
    this.name = name;
    this.brand = brand;
    this.memory = memory;
}


    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';
    }
}
//feyrus change the to string on his file to change the default printouts