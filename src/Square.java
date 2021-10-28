import java.awt.*;

public class Square extends Rectangle {
    public Square(int length) {
        super(length, length);
    }

    public Square(int px, int py, Color c) {
        super(px, py, c);
    }


    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setWidth(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setBoundingBox(int heightBB, int widthBB) {
        super.setWidth(heightBB);
        super.setLength(heightBB);

    }
}
