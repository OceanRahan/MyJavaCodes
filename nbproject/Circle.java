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
public class Circle extends TwoDShape {
    Circle(double r1,double r2)
    {
        super(r1,r2);
    }
    public double area()
    {
        return 3.1416*(super.GetDim1())*(super.GetDim1());
    }

}
