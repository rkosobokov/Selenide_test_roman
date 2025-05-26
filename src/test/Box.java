class Box {
    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Box{" + "Ширина=" + width + ", Высота=" + height + ", Глубина=" + depth + '}';
    }
}

