public class Rabbit extends Animal {
    private static final int MAX_AGE = 5;

    @Override
    public void act() {
        if (isAlive()) {
            incrementAge();
            System.out.println("Rabbit hops around.");
        }
    }

    @Override
    protected int getMaxAge() {
        return MAX_AGE;
    }
}
