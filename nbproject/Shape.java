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
public class Shape {
    private double dim1;
    private double dim2;
    public Shape(double d1,double d2)
    {
        dim1=d1;
        dim2=d2;
    }
    public double GetDim1()
    {
        return dim1;
    }
    public double GetDim2()
    {
        return dim2;
    }
}
