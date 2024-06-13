package lang.object.test;

import java.util.Objects;

public class Rectengle {
    private int width;
    private int height;

    public Rectengle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectengle{" +
                "가로=" + width +
                ", 세로=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectengle rectengle = (Rectengle) o;
        return width == rectengle.width && height == rectengle.height;
    }
}
