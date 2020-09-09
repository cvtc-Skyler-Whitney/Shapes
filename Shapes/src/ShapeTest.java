public class ShapeTest {

    public static void main(String[] args) {

        Cuboid cuboid = new Cuboid(10,10,10);
        Cylinder cylinder = new Cylinder(10, 10);
        Sphere sphere = new Sphere((float) 10);



        cuboid.render();
        cylinder.render();
        sphere.render();


    }

}
