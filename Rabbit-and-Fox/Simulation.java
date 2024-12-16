import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        // Tambahkan beberapa rubah dan kelinci ke dalam simulasi
        animals.add(new Rabbit());
        animals.add(new Rabbit());
        animals.add(new Fox());
        animals.add(new Fox());

        // Simulasi beberapa siklus
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cycle: " + i);
            for (Animal animal : animals) {
                animal.act();
                if (!animal.isAlive()) {
                    System.out.println(animal.getClass().getSimpleName() + " has died.");
                }
            }
            System.out.println();
        }
    }
}
