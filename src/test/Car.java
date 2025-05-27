public class Car {
    public String model;
    public int year;
    public int beepCount = 3;  // счетчик бибиканий

    public void makeBeBe() {
        for (int i = 0; i < beepCount; i++) {
            System.out.println(model + " (" + year + "): Би-Би!");
        }
    }
}