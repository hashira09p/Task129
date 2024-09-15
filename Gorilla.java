// Define the Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Implement the Gorilla class
public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla...");
            return true;
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla. Be careful!");
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        // Feed the gorilla
        boolean fed = gorilla.feed(true);
        System.out.println("Gorilla fed: " + fed);
        
        // Groom the gorilla
        gorilla.groom();
        
        // Pet the gorilla
        gorilla.pet();
    }
}
