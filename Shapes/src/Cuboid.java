import javax.swing.*;

public class Cuboid extends Shape {

    float width;
    float height;
    float depth;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public float surfaceArea() {

        float surfaceArea = (float) (2 * (depth * width + width * height + height * depth));
        return surfaceArea;
    }

    @Override
    public float volume() {

        float volume = (width * height * depth);
        return volume;
    }

    @Override
    public void render() {

        JOptionPane.showMessageDialog(null, "Cuboid\n" + "Width: " + width + "\nHeight: " + height + "\nDepth: " + depth + "\nSurfaceArea: " + surfaceArea() + "\nVolume: " + volume());

    }
}
