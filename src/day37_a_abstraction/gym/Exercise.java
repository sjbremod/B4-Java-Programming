package day37_a_abstraction.gym;

public abstract class Exercise {
        // in abstract class we still can have all the other members as regular class
    //instance variable
    String name;

        // constructor
    public Exercise(String name) {
        this.name = name;
    }

    // Abstract methods - method without body
    public abstract void doExercise();
    // Abstract methods - method without body
    public abstract void burnCalories(int minutes);

    public abstract int calculateCaloriesBurned(int minutes);
}
