package review.enum1;

enum Resolution {
    HD(1280),
    FHD(1920),
    UHD(3840);

    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
