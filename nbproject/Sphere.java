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
public class Sphere extends ThreeDShape {
    public Sphere(double dim1)
    {
        super(dim1,0,0);
    }
    public double area()
    {
        return 4*3.1415*super.GetDim1()*super.GetDim1();
    }
    public double Volume()
    {
        return ((4*3.1416)/3)*super.GetDim1()*super.GetDim1()*super.GetDim1();
    }
}
