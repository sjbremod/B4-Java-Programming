package day31_custom_classes;

public class ThisKeyword {
// instance variable decalared at class level
    int a;
//                  local variable declared at max method
public ThisKeyword (int a){
   // java prioritizes local variable over instance variable if they have the same name
    //ok but how to make the dif between them for java
    //A. with the help of "this" keyword
    // this --> representation of object ref

    this.a = a;






}



}
