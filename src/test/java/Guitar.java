public class Guitar implements Playable {
    @Override
    public void play(int stringCount) {
        System.out.println("Гитара играет на " + stringCount + " струнах");
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play(InstrumentData.StringCount.GUITAR_STRINGS.getCount());
    }
}