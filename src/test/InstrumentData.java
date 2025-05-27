public class InstrumentData {
    public enum StringCount {
        GUITAR_STRINGS(6),
        PIANO_STRINGS(230);

        private final int count;

        StringCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }
}