public class Piano implements Playable {
    @Override
    public void play(int stringCount) {
        System.out.println("Пианино звучит с использованием " + stringCount + " струн");
    }

    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play(InstrumentData.StringCount.PIANO_STRINGS.getCount());
    }
}