package sample;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public enum MyColor {
    GREY(142, 142, 147), //put colors
    SALMON(250, 128, 114),
    PINK(255, 192, 203),
    PLUM(221, 160, 221),
    LIGHTBLUE(52,170, 220),
    WHITE(255, 255, 255),
    BLACK(0,0,0),
    DARKPINK(231,84,128);

    private int r, g, b;

    private MyColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Paint getRGB() {
        return Color.rgb(r,g,b);
    }
}
