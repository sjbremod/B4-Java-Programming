package day37_a_abstraction.gym;

public class PullUps extends Exercise{
    //String name;
    public PullUps(String name) {
        super(name);

    }


    @Override
    public void doExercise() {
        System.out.println("doing pull ups" + name);
    }

    @Override
    public void burnCalories(int minutes) {
        System.out.println("burning calories" + minutes+ " while doing pullups");
    }
    public int calculateCaloriesBurned (int minutes) {
return minutes* 5;
    }
}
