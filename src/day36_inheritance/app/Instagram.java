package day36_inheritance.app;

public class Instagram extends App{

public Instagram ( double version){
    super("Instagram", version);

}
public void postPicture (){
    System.out.println("posting picture to "+ name);
}

}