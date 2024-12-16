public class Fox extends Animal {
    private static final int MAX_AGE = 10;

    @Override
    public void act() {
        if (isAlive()) {
            incrementAge();
            System.out.println("Fox hunts rabbits.");
        }
    }

    @Override
    protected int getMaxAge() {
        return MAX_AGE;
    }
}
