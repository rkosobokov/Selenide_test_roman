public class Car1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Toyota Camry";
        car.year = 2020;
        car.beepCount = 2;  // Будет бибикнуть 2 раза

        System.out.println("=== Car1 ===");
        car.makeBeBe();
    }
}