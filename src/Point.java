import java.io.Serializable;

public class Point implements Serializable {
    int X;
    int Y;

    //constructor
    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public Point() {
        this.X = 0;
        this.Y = 0;
    }

    public int getX() {
        return X;
    }

    //getter,setter
    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
