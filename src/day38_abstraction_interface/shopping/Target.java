package day38_abstraction_interface.shopping;

public class Target extends Shopping{
    @Override
    public void buyItem() {
        System.out.println("Buying item from target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to target");
    }
}
