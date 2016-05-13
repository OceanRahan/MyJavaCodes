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

class Teacher extends Faculty{
    private int noCourses;
    private double weeklyHour;
    Teacher(String dept,String Inst,String n,String eId,double s,double i,int fc,String desig,int Jyear,int cors,double hour)
    {
        super(dept,Inst,n,eId,s,i,fc,desig,Jyear);
        noCourses=cors;
        weeklyHour=hour;
        
    }
    int getNoCourses()
    {
        return noCourses;
    }
    double getHour()
    {
        return weeklyHour;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("NO of courses: "+getNoCourses());
        System.out.println("weekly hour: "+getHour());
    }
}