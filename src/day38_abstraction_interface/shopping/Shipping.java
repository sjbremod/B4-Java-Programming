package day38_abstraction_interface.shopping;

public interface Shipping {
    // variables are by default 'public static final'
    // CONSTANT VARIABLE - public static final
    String COUNTRY= "USA";
    //public abstract by default
    void shippingCost(boolean hasMembership);



}
