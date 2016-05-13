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
public class Rectangle extends TwoDShape {
    public Rectangle(double dim1,double dim2)
    {
        super(dim1,dim2);
    }
    public double area()
    {
        return super.GetDim1()*super.GetDim2();
    }
}
