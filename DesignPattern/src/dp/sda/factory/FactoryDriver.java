package dp.sda.factory;

public class FactoryDriver {
    public static void main(String[] args) {
        Polygon polygon;
        PolygonFactory factory = new PolygonFactory();
        
        //get the shape which has 4 sides
        polygon = factory.getPolygon(4);
        System.out.println("The shape with 4 sides is a " + polygon.getType());
        
        //get the shape which has 4 sides
        polygon = factory.getPolygon(8);
        System.out.println("The shape with 8 sides is a " + polygon.getType());
    }
}
