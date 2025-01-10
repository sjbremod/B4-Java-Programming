package day38_abstraction_interface.shopping;

public class Amazon extends OnlineShopping implements Shipping {

    @Override
    public void deliveryEstimate() {
        System.out.println("amazon delivery estimate");
    }

    @Override
    public void buyItem() {
        System.out.println("buy amazon item");
    }

    @Override
    public void returnItem() {
        System.out.println("return amazon item");
    }

    @Override
    public void shippingCost(boolean hasMembership) {
        System.out.println(hasMembership ? "has membership, no shipping cost" : "has no membership, shipping cost will be added");

    }
}
