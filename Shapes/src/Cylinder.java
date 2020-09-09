import javax.swing.*;

public class Cylinder extends Shape {

    float radius;
    float height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    public float surfaceArea() {

        float surfaceArea = (float) (2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius));

        return surfaceArea;
    }

    @Override
    public float volume() {

        float volume = (float) (Math.PI * (radius * radius) * height);

        return volume;
    }

    @Override
    public void render() {

        JOptionPane.showMessageDialog(null, "Cylinder\n" + "Height: " + height + "\nRadius: " + radius + "\nSurfaceArea: " + surfaceArea() + "\nVolume: " + volume());

    }
}
