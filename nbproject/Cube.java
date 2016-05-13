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
public class Cube extends ThreeDShape {
 
    public Cube(double dim1)
    {
        super(dim1,0,0);
    }
    public double area()
    {
        return 6*super.GetDim1()*super.GetDim1();
    }
    public double Volume()
    {
        return super.GetDim1()*super.GetDim1()*super.GetDim1();
    }
}
