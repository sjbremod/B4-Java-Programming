package day06_b_unary_operators;

public class ParkingLot {
    public static void main(String[] args) {
        int carsInParkingLot = 10;
        System.out.println("2 cars drove into parking lot: ");
        carsInParkingLot = carsInParkingLot + 2;
        System.out.println("cars in the parking lot" +carsInParkingLot);
        System.out.println("2 cars drove into parking lot: ");
        carsInParkingLot++;
        carsInParkingLot++;
        // in this case it doesnt matter if it is post or pre b.c they are written as a single statement
        //++carsInParkingLot++;
        //++carsInParkingLot++;
        System.out.println("cars in the parking lot: " +carsInParkingLot);

        System.out.println("5 cars left");
        carsInParkingLot = carsInParkingLot -5;
        System.out.println("cars in the parking lot: " +carsInParkingLot);


    }
}
