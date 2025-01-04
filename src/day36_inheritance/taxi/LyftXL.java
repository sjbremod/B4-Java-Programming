package day36_inheritance.taxi;

public class LyftXL extends Lyft {
    public LyftXL(String driverName) {
        super(driverName);
    }
   // instance overridden method cost will be 20%more
    @Override
    public double calculateRate (int miles){
       return super.calculateRate(miles)*1.2;
        //return miles * 2.5;

    }

}
