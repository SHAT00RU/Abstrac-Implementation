public abstract class Animal {
    protected int age;
    protected boolean alive;

    public Animal() {
        age = 0;
        alive = true;
    }

    public abstract void act(); // Metode abstrak untuk tindakan per siklus

    public void incrementAge() {
        age++;
        if (age > getMaxAge()) {
            alive = false;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    protected abstract int getMaxAge(); // Setiap hewan memiliki umur maksimal berbeda
}
