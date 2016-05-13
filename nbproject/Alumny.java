/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author Ocean
 */
class Alumny extends Community{
    private String name;
    private int passYear;
    Alumny(String dept,String inst,String n,int y)
    {
        super(dept,inst);
        name=n;
        passYear=y;
    }
    String getName(){
        return name;
        
    }
    int getPassYear()
    {
        return passYear;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Name of the Community member: "+getName());
        System.out.println("Pass year: "+getPassYear());
    }
}
