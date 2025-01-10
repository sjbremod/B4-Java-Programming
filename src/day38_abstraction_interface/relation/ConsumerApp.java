package day38_abstraction_interface.relation;
// going from interface to interface is still inheritance so we use extends

import day38_abstraction_interface.shopping.Shipping;
// interface can extend multiple interfaces
public interface ConsumerApp extends AllowUserToSell, Shipping {


}
// going from interface to class(is the one that gets additional info from interface, we us 'implements'
abstract class Test implements  AllowUserToSell,Shipping {

}
class Runner {
    public static void main(String[] args) {


    }
}