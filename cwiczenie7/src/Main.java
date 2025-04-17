public class Main {
    public static void main(String[] args) {

        Car car = new Car(5);
        car.start();
        car.stop();
        System.out.println("Liczba miejsc w samochodzie: " + car.getNumberOfSeats());

        System.out.println("\n--- Zwierzęta ---");

        Animal[] animals = {
                new Cat(),
                new Lion(),
                new Dog(),
                new Wolf()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            System.out.println();
        }

    }
}
