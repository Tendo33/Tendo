import java.awt.*;

public abstract class Figure {
    protected Point origin;
    protected Color c;


    public Figure(Point p) {
        this.origin = p;
    }

    public Figure(Point p, Color col) {
        this.origin = p;
        this.c = col;
    }


    public String toString() {
        return "A figure that starts in (" + origin.getX() +
                ", " + origin.getY() + ")";
    }

    //method
    public abstract int getPerimeter();

    public abstract int getSurface();

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void draw(Graphics g);


}
