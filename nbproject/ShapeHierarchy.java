/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapehierarchy;

/**
 *
 * @author Ocean
 */
public class ShapeHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c =new Circle(3.4,3.4);
        System.out.println("Area of Circle is: "+c.area());
        Rectangle r=new Rectangle(3,4);
        System.out.println ("Area of Rectangle is: "+r.area());
        Triangle t=new Triangle (5,3);
        System.out.println ("Area of Triangle is: "+t.area());
        Cube cu=new Cube(2);
        System.out.println ("Area of Cube is: "+cu.area());
        System.out.println("Volume of cube is: "+cu.Volume());
        Sphere s =new Sphere(3.4);
        System.out.println("Area of sphere is: "+s.area());
        System.out.println("Volume of Sphere is: "+ s.Volume());
         }
}
