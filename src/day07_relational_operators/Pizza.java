package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {

        // type of pizza, the number of slices, the number of people eating

        String pizzaType = "pepperoni";
        int numOfSlices = 20 ;
        int numOfPeople = 6;

        int slicePerPerson = numOfSlices / numOfPeople;
        int slicesLeftOver = numOfSlices - (numOfPeople * slicePerPerson);
        int SlicesLeftOver2 = numOfSlices % numOfPeople;
       // System.out.println(slicesLeftOver);

        String result = "We bought " + pizzaType + " pizza. It has "+ numOfSlices + "sikces. we are "+ numOfPeople+ "people and each of use will eat" + slicePerPerson + " slices and there will "+ slicesLeftOver + " slices left over. ";

        System.out.println(result);


    }
}
