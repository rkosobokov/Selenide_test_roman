public class Car2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Tesla Model S";
        car.year = 2022;
        car.beepCount = 1;  // Будет бибикнуть 1 раз

        System.out.println("=== Car2 ===");
        car.makeBeBe();
    }
}