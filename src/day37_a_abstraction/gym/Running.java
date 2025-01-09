package day37_a_abstraction.gym;

public class Running extends Exercise {
    //String name;
    public Running(String name) {
        super(name);

    }

    @Override
    public void doExercise() {
        System.out.println("Running " + name);
    }

    @Override
    public void burnCalories(int minutes) {
        System.out.println("Burning Calories for " + minutes);
    }
    public int calculateCaloriesBurned (int minutes) {
        return minutes * 10;
    }
}
