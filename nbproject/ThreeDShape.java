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
public class ThreeDShape extends Shape {
    private double dim3;
    public ThreeDShape(double d1,double d2,double d3)
    {
        super(d1,d2);
        dim3=d3;
    }
    public double getDim3()
    {
        return dim3;
    }
}
